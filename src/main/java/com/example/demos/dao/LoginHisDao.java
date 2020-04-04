package com.example.demos.dao;

import com.example.demos.beans.LoginHisBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface LoginHisDao {

//    @Select("select count(1) cn from T_SSO_LOGIN_LOG")
    List<Map> countsPv(String type);

    Integer countPv(@Param("type") String type,@Param("beginTime") String beginTime,@Param("endTime") String endTime);

    List<Map> searchSsoDayCount(@Param("type") String type,@Param("beginTime") String beginTime ,@Param("endTime") String endTime);

    List<Map> showUserTop(String type);

    List<Map>  showUserLists(@Param("type") String type,@Param("beginTime") String beginTime ,@Param("endTime") String endTime);

    @Select("select * from t_login_his where user_id=#{userid}")
    List<LoginHisBean> searchHistory(@Param("userid") String userid);


    @Select("select * from  T_SSO_LOGIN_LOG")
    List<LoginHisBean> searchSsoCount();


//    @Select("select user_id , count(id) cnt from t_login_his group by user_id order by cnt desc")
    public List<Map> searchEeid(@Param("type") String type);


//    @Select("select count(1) from T_SSO_LOGIN_LOG")
    public Integer totalSsoCount(@Param("type") String type);

//    @Select("select to_char(login_time,'YYYY-MM-DD'),count(id) from t_login_his where create_time BETWEEN #{beginTime} AND #{endTime} group by to_char(login_time,'YYYY-MM-DD') order by to_char(login_time,'YYYY-MM-DD')")
    public List<Map>  searchHistoryDay(@Param("beginTime") String beginTime, @Param("endTime") String endDate,@Param("userid") String userid);


    /**
     * 统计历史明细记录(按天统计)
     * @param
     * @return
     */
    public List<Map>  Accesssystem(@Param(value = "webid") List<String> webid);


    public List<String>  searchSysname();

}
