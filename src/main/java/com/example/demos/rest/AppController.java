package com.example.demos.rest;

import com.alibaba.fastjson.JSON;
import com.example.demos.beans.AccessNum;
import com.example.demos.beans.ResObject;
import com.example.demos.beans.ShowUserResult;
import com.example.demos.service.LoginHisService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Hello world!
 *
 */
@Api(description = "湘教云接口")
@RestController
@RequestMapping("/AppController")
public class AppController {


    @Autowired
    private LoginHisService loginHisService;

    @ApiOperation(value = "接入系统访问量(按天统计)" ,  notes="接入系统访问量(按天统计)")
    @RequestMapping(value="/showUserLists",method=RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
    public ResObject showUserLists(String type,String beginTime ,String endTime)throws ParseException {
        ShowUserResult result = new ShowUserResult();
        List<String> sn = new ArrayList<>();
        List<Integer> num = new ArrayList<>();
        List<String> tm = new ArrayList<>();
        if (beginTime != null && beginTime != "" || endTime != null && endTime != "") {
            if (beginTime.length() > 11 || endTime.length() > 11) {
                java.text.SimpleDateFormat formattes = new SimpleDateFormat("yyyy-MM-dd");
                Date date = formattes.parse(beginTime);
                Date date1 = formattes.parse(endTime);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                beginTime = sdf.format(date);
                endTime = sdf.format(date1);
            }
        }
        Map resulMap = new HashMap();
        List<String> loginList=loginHisService.searchSysname();
        List<String> snList5 = new ArrayList<>();
        System.out.println(loginList);
        List<String> list=new ArrayList<>();
        String sysname="";
        List<Map> lists=null;
        for (int i = 0; i < loginList.size(); i++) {
           sysname= loginList.get(i);
            System.out.println(sysname+"000000000000000");
            list.add(sysname);
            lists=loginHisService.Accesssystem(list);
            System.out.println(lists);
            snList5.add(sysname);
        }
        AccessNum access=new AccessNum();
        List<String> synameList5 = new ArrayList<>();
        List<Integer> numList1 = new ArrayList<>();
        List<Integer> numList2 = new ArrayList<>();
        lists.forEach(item->{
//            String hostime=item.get("hospitTime").toString();
            String sysnames=item.get("sysname").toString();
            Integer nms = Integer.parseInt(item.get("num").toString());
//            snList5.add(hostime);
            synameList5.add(sysnames);
            numList1.add(nms);
        });
        resulMap.put("snList5",snList5);
        resulMap.put("snList6",synameList5);
        resulMap.put("numList1",JSON.toJSON(numList1));
//        List<Map> mapList = loginHisService.Accesssystem(type, beginTime, endTime);
//        System.out.println(mapList+"list");
//        List<AccessNum> accessList = new ArrayList<>();
//        Access dandiandenglu = new Access();
//        Access xiang = new Access();
//        Access shiming = new Access();
//        Access shimings = new Access();
//        AccessNum accessNum = new AccessNum();
//        AccessNum accessNum1 = new AccessNum();
//        AccessNum accessNum2 = new AccessNum();
//        Set<String> snList4 = new HashSet<>();
//        List<String> snList5 = new ArrayList<>();
//        List<Integer> numList1 = new ArrayList<>();
//        List<Integer> numList2 = new ArrayList<>();
//        List<Integer> numList3 = new ArrayList<>();
//        Map<String, List<String>> mapTemp = new HashMap<>();
//        mapTemp.put("hospitTime", new LinkedList<>());
//        mapList.forEach(item -> {
//            String sns = (String) item.get("sysname");
//            snList4.add(sns);
//            shimings.setSysname(snList4);
//            resulMap.put("shimings", snList4);
//            Integer nms = Integer.parseInt(item.get("nums").toString());
//            String tms = item.get("times").toString();
//            snList5.add(tms);
//            shimings.setCreatetime(snList5);
//            resulMap.put("times", snList5);
//            if (!mapTemp.containsKey(sns)) {
//                List<String> listTemp = new LinkedList<>();
//                mapTemp.put(sns, listTemp);
//            }
//            System.out.println(mapTemp+"------------------------------");
////            int i = 0;
////            Boolean flag = false;
////            for (; i < mapTemp.get("times").size(); i++) {
////                if (StringUtils.equalsIgnoreCase(mapTemp.get("times").get(i), resultTimeValue)) {
////                    flag = true;
////                    break;
////                }
////            }
//            // 创建一个新的list集合，用于存储去重后的元素
////            if (sns.equals("单点登录")) {
////                numList1.add(nms);
////            } else if (sns.equals("是多少")) {
////                numList2.add(nms);
////            } else if (sns.equals("sso")) {
////                numList3.add(nms);
////            }
//        });
//        accessNum.setNums(numList1);
//        accessNum1.setNums(numList2);
//        accessNum2.setNums(numList3);
//        accessList.add(accessNum);
//        accessList.add(accessNum1);
//        accessList.add(accessNum2);
//        resulMap.put("accessList", accessList);
//        System.out.println(JSON.toJSON(accessList));
        return new ResObject(HttpStatus.OK.value(), resulMap, "接入系统访问量(按天统计)");
//        // 创建一个新的list集合，用于存储去重后的元素
//        List listTemp = new ArrayList();
//        for (int i = 0; i <sn.size() ; i++) {
//            if (!listTemp.contains(sn.get(i))) {
//                // 将未包含的元素添加进listTemp集合中
//                listTemp.add(sn.get(i));
//            }
//        }
//        System.out.println(listTemp);
//        result.setSn(listTemp);
    }



















}
