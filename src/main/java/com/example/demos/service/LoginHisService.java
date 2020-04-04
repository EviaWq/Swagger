package com.example.demos.service;


import com.example.demos.beans.LoginHisBean;

import java.util.List;
import java.util.Map;

/**
 * @author XiangJing
 * @InterfaceName: HelloService
 * @Description: TODO
 * @date 2019/5/30 11:55
 */

public interface LoginHisService {
  /**
   * 总访问量
   */
  public  List<Map> countsPv(String type);

  /**
   * 总访问量
   */
  public  Integer countPv(String type,String beginTime,String endTime);


  /**
   * 查询各个企业调用SSO的次数(按天统计)
   * @param type
   * @return
   */
  public  List<Map> searchSsoDayCount(String type,String beginTime ,String endTime);


  /**
   * 接入系统访问量
   * @param type
   * @return
   */
  public  List<Map> showUserLists(String type,String beginTime ,String endTime);

  /**
   * 接入系统访问量top5
   * @param
   * @return
   */
  public  List<Map> showUserTop(String type);

  /**
   * 查询某个用户登录的历史明细记录
   * @param userid
   * @return
   */
  public  List<LoginHisBean> searchHistory(String userid);

  /**
   * 查询各个企业调用SSO的次数
   * @param
   * @return
   */
  public  List<LoginHisBean> searchSsoCount();


  /**
   * 查询登录的EEID（按登录次数排名）
   * @param
   * @return
   */
  public List<Map> searchEeid(String type);

  /**
   * 统计调用SSO的次数
   * @param
   * @return
   */
  public Integer totalSsoCount(String type);

  /**
   * 统计历史明细记录(按天统计)
   * @param
   * @return
   */
  public List<Map>  searchHistoryDay(String beginTime,String endDate,String userid);


  /**
   * 统计历史明细记录(按天统计)
   * @param
   * @return
   */
  public List<Map>  Accesssystem(List<String> webid);



  public List<String>  searchSysname();


}
