package com.example.demos.service.impi;

import com.example.demos.beans.LoginHisBean;
import com.example.demos.dao.LoginHisDao;
import com.example.demos.service.LoginHisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author XiangJing
 * @ClassName: HelloServiceImpl
 * @Description: TODO
 * @date 2019/5/30 11:56
 */
@Service("loginHisService")
public class LoginHisServiceImpl implements LoginHisService {
    @Autowired
    private LoginHisDao loginHisDao;

    /**
     * 总访问量
     */
    public List<Map> countsPv(String type) {
        return loginHisDao.countsPv(type);
    }


    /**
     * 总访问量(按天统计)
     */
    public Integer countPv(String type, String beginTime, String endTime) {
        return loginHisDao.countPv(type, beginTime, endTime);
    }

    /**
     * 查询各个企业调用SSO的次数(按天统计)
     *
     * @param type
     * @return
     */
    public List<Map> searchSsoDayCount(String type, String beginTime, String endTime) {
        return loginHisDao.searchSsoDayCount(type, beginTime, endTime);
    }

    /**
     * 接入系统访问量
     *
     * @param type
     * @return
     */
    public List<Map> showUserLists(String type, String beginTime, String endTime) {
        return loginHisDao.showUserLists(type, beginTime, endTime);
    }

    /**
     * 接入系统访问量top5
     *
     * @param
     * @return
     */
    public List<Map> showUserTop(String type) {
        return loginHisDao.showUserTop(type);
    }

    /**
     * 查询某个用户登录的历史明细记录
     *
     * @param userid
     * @return
     */
    public List<LoginHisBean> searchHistory(String userid) {

        return loginHisDao.searchHistory(userid);
    }

    public List<LoginHisBean> searchSsoCount() {
        return loginHisDao.searchSsoCount();
    }


    /**
     * 查询登录的EEID（按登录次数排名）
     *
     * @param
     * @return
     */
    public List<Map> searchEeid(String type) {
        return loginHisDao.searchEeid(type);
    }


    /**
     * 统计调用SSO的次数
     *
     * @param
     * @return
     */
    public Integer totalSsoCount(String type) {
        return loginHisDao.totalSsoCount(type);
    }


    /**
     * 统计历史明细记录(按天统计)
     *
     * @param
     * @return
     */
    public List<Map> searchHistoryDay(String beginTime, String endDate, String userid) {
        return loginHisDao.searchHistoryDay(beginTime, endDate, userid);
    }

    /**
     * 统计历史明细记录(按天统计)
     *
     * @param
     * @return
     */
    public List<Map> Accesssystem(List<String> webid) {
        return loginHisDao.Accesssystem(webid);
    }

    public List<String>  searchSysname(){
        return loginHisDao.searchSysname();
    }



}