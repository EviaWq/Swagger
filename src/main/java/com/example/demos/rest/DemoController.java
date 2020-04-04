//package com.example.demos.rest;
//
//import com.alibaba.fastjson.JSONObject;
//import com.example.demos.beans.LoginHisBean;
//import com.example.demos.beans.ResObject;
//import com.example.demos.beans.Result;
//import com.example.demos.beans.User;
//import com.example.demos.service.LoginHisService;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.*;
//
///**
// * Hello world!
// *
// */
//@Api(description = "湘教云接口")
//@RestController
//@RequestMapping("/api")
//public class DemoController {
//
//    @Autowired
//    private LoginHisService loginHisService;
//
//    java.util.Map resultMap=new HashMap();
//
//    @ApiOperation(value = "总访问量(按天统计)" ,  notes="总访问量(按天统计)")
//    @RequestMapping(value="/countPv",method=RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
//    public ResObject countPv(String type,String beginTime,String endTime)throws ParseException{
//        Result result = new Result();
//        List<String> ctList = new ArrayList<>();
//        List<Integer> cntList = new ArrayList<>();
//        if (beginTime!=null&&beginTime!=""||endTime!=null&&endTime!="") {
//            if (beginTime.length() > 11 || endTime.length() > 11) {
//                java.text.SimpleDateFormat formattes = new SimpleDateFormat("yyyy-MM-dd");
//                Date date = formattes.parse(beginTime);
//                Date date1 = formattes.parse(endTime);
//                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//                beginTime = sdf.format(date);
//                endTime = sdf.format(date1);
//            }
//        }
//        Integer mapList =loginHisService.countPv(type,beginTime,endTime);
////        mapList.forEach(item->{
////            String ct = item.get("TM").toString();
////            Integer nms =Integer.parseInt(item.get("CNT").toString());
////            ctList.add(ct);
////            cntList.add(nms);
////        });
//        result.setCnt(cntList);
//        result.setCt(ctList);
//        return new ResObject(HttpStatus.OK.value(),JSONObject.toJSON(result), "总访问量(按天统计)");
//    }
//
//
//    @ApiOperation(value = "总访问量" ,  notes="总访问量")
//    @RequestMapping(value="/countsPv",method=RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
//    public ResObject countsPv(String type){
//        List<Map> mapList =loginHisService.countsPv(type);
//        System.out.println(mapList);
//        Result result = new Result();
////        List<String> ctList = new ArrayList<>();
////        List<Integer> cntList = new ArrayList<>();
////        mapList.forEach(item->{
////            String ct = item.get("CT").toString();
////            Integer nms =Integer.parseInt(item.get("NUM").toString());
////            ctList.add(ct);
////            cntList.add(nms);
////        });
////        result.setCnt(cntList);
////        result.setCt(ctList);
//        return new ResObject(HttpStatus.OK.value(),JSONObject.toJSON(mapList), "总访问量");
//    }
//
//
//
////    @ApiOperation(value = "接入系统访问量(按天统计)" ,  notes="接入系统访问量(按天统计)")
////    @RequestMapping(value="/showUserLists",method=RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
////    public ResObject showUserLists(String type,String beginTime ,String endTime)throws ParseException{
////        ShowUserResult result = new ShowUserResult();
////        List<String> sn = new ArrayList<>();
////        List<Integer> num = new ArrayList<>();
////        List<String> tm = new ArrayList<>();
////        System.out.println(beginTime);
////        if (beginTime!=null&&beginTime!=""||endTime!=null&&endTime!="") {
////            if (beginTime.length() > 11 || endTime.length() > 11) {
////                java.text.SimpleDateFormat formattes = new SimpleDateFormat("yyyy-MM-dd");
////                Date date = formattes.parse(beginTime);
////                Date date1 = formattes.parse(endTime);
////                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
////                beginTime = sdf.format(date);
////                endTime = sdf.format(date1);
////            }
////        }
////        List<Map> mapList =loginHisService.showUserLists(type,beginTime,endTime);
////        mapList.forEach(item->{
////            String sns = (String)item.get("SN");
////            Integer nms =Integer.parseInt(item.get("NUM").toString());
////            String tms = item.get("TM").toString();
////            System.out.println(tms);
////            sn.add(sns);
////            num.add(nms);
////            tm.add(tms);
////        });
////        result.setSn(sn);
////        result.setNum(num);
////        result.setTm(tm);
////        System.out.println(result);
////        return new ResObject(HttpStatus.OK.value(),JSONObject.toJSON(result), "接入系统访问量(按天统计)");
////    }
//
//    @ApiOperation(value = "接入系统访问量top5" ,  notes="接入系统访问量top5")
//    @RequestMapping(value="/showUserTop",method=RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
//    public ResObject showUserTop(String type){
//        List<Map> mapList =loginHisService.showUserTop(type);
////        String s = JSON.toJSONString(mapList);
////        JSONObject obj = new com.alibaba.fastjson.JSONObject();
////        obj.put("data", mapList);
////        System.out.println(obj);
//        return new ResObject(HttpStatus.OK.value(), mapList,"接入系统访问量top5");
//    }
//
//
//    @ApiOperation(value = "查询各个企业调用SSO的次数" ,  notes="查询各个企业调用SSO的次数")
//    @RequestMapping(value="/searchSsoCount",method=RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
//    public ResObject searchSsoCount(){
//        System.out.println("createUser:::");
//        loginHisService.searchSsoCount();
//        return new ResObject(HttpStatus.OK.value(), "查询各个企业调用SSO的次数.");
//    }
//
//    @ApiOperation(value = "查询各个企业调用SSO的次数(按天统计)" ,  notes="查询各个企业调用SSO的次数(按天统计)")
//    @RequestMapping(value="/searchSsoDayCount",method=RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
//    public ResObject searchSsoDayCount(String type,String beginTime ,String endTime)throws ParseException{
//        if (beginTime!=null&&beginTime!=""||endTime!=null&&endTime!="") {
//        if (beginTime.length()>11||endTime.length()>11){
//            java.text.SimpleDateFormat formattes = new SimpleDateFormat( "yyyy-MM-dd");
//            Date date = formattes.parse(beginTime);
//            Date date1 = formattes.parse(endTime);
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//             beginTime = sdf.format(date);
//             endTime = sdf.format(date1);
//        }
//        }
//        Map map2 = new HashMap();
//        List<Map> mapList =loginHisService.searchSsoDayCount(type,beginTime,endTime);
//        Result result = new Result();
//        List<String> ctList = new ArrayList<>();
//        List<Integer> cntList = new ArrayList<>();
//        mapList.forEach(item->{
//            String ct =  (String)item.get("CT");
//            Integer cnt =Integer.parseInt(item.get("CNT").toString());
//            ctList.add(ct);
//            cntList.add(cnt);
//        });
//        result.setCt(ctList);
//        result.setCnt(cntList);
//
//        return new ResObject(HttpStatus.OK.value(),JSONObject.toJSON(result), "查询各个企业调用SSO的次数(按天统计).");
//    }
//
//
//    @ApiOperation(value = "查询某个用户登录的历史明细记录" ,  notes="查询某个用户登录的历史明细记录")
//    @RequestMapping(value="/searchHistory",method=RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
//    public ResObject searchHistory(@RequestBody String userid){
//        System.out.println("searchHistory:"+userid);
//        List<LoginHisBean> loginHis=loginHisService.searchHistory(userid);
//        System.out.println(loginHis);
//        return new ResObject(HttpStatus.OK.value(), loginHis,"查询某个用户登录的历史明细记录.");
//    }
//
//    @ApiOperation(value = "统计历史明细记录(按天统计)" ,  notes="统计历史明细记录(按天统计)")
//    @RequestMapping(value="/searchHistoryDay",method=RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
//    public ResObject searchHistoryDay(String beginTime,String endTime,String userid)throws ParseException {
//        if (beginTime!=null&&beginTime!=""||endTime!=null&&endTime!="") {
//            if (beginTime.length() > 11 || endTime.length() > 11) {
//                java.text.SimpleDateFormat formattes = new SimpleDateFormat("yyyy-MM-dd");
//                Date date = formattes.parse(beginTime);
//                Date date1 = formattes.parse(endTime);
//                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//                beginTime = sdf.format(date);
//                endTime = sdf.format(date1);
//            }
//        }
//        List<Map> loginHis=loginHisService.searchHistoryDay(beginTime,endTime,userid);
//        Result result = new Result();
//        List<String> ctList = new ArrayList<>();
//        List<Integer> cntList = new ArrayList<>();
//        loginHis.forEach(item->{
//            String ct =  (String)item.get("CREATETIME");
//            Integer cnt =Integer.parseInt(item.get("HISTORYCOUNT").toString());
//            ctList.add(ct);
//            cntList.add(cnt);
//        });
//        result.setCt(ctList);
//        result.setCnt(cntList);
//        return new ResObject(HttpStatus.OK.value(),JSONObject.toJSON(result),"统计历史明细记录(按天统计)");
//    }
//
//    @ApiOperation(value = "查询登录的EEID（按登录次数排名）" ,  notes="查询登录的EEID（按登录次数排名）")
//    @RequestMapping(value="/searchEeid",method=RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
//    public ResObject searchEeid(String type){
//        List<Map> loginHisBeans=loginHisService.searchEeid(type);
//        Result result = new Result();
//        List<String> ctList = new ArrayList<>();
//        List<Integer> cntList = new ArrayList<>();
//        loginHisBeans.forEach(item->{
//            String ct =  (String)item.get("UD");
//            Integer cnt =Integer.parseInt(item.get("CNT").toString());
//            ctList.add(ct);
//            cntList.add(cnt);
//        });
//        result.setCt(ctList);
//        result.setCnt(cntList);
//        return new ResObject(HttpStatus.OK.value(),JSONObject.toJSON(result), "查询登录的EEID（按登录次数排名）");
//    }
//
//    @ApiOperation(value = "统计调用SSO的次数" ,  notes="统计调用SSO的次数")
//    @RequestMapping(value="/totalSsoCount",method=RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
//    public ResObject totalSsoCount(String type){
//        Integer login=loginHisService.totalSsoCount(type);
//        return new ResObject(HttpStatus.OK.value(), login,"统计调用SSO的次数.");
//    }
//
//
//    @ApiOperation(value = "查询登录次数(按天统计)" ,  notes="查询登录次数(按天统计)")
//    @RequestMapping(value="/searchDayCount",method=RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
//    public ResObject searchDayCount(@RequestBody User user){
//        System.out.println("createUser:::"+user.toString());
//        return new ResObject(HttpStatus.OK.value(), "查询某个用户登录的历史明细记录.");
//    }
//
//
//
//    @ApiOperation(value = "所有" ,  notes="所有(按天统计)")
//    @RequestMapping(value="/Count",method=RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
//    public ResObject Count(String type){
//        //首页访问量top5
//       List<Map> mapList=loginHisService.showUserLists(type,null,null);
//       resultMap.put("mapList",mapList);
//       //EEID
//        List<Map> loginHisBeans=loginHisService.searchEeid(type);
//        Result result = new Result();
//        List<String> ctList = new ArrayList<>();
//        List<Integer> cntList = new ArrayList<>();
//        loginHisBeans.forEach(item->{
//            String ct =  (String)item.get("UD");
//            Integer cnt =Integer.parseInt(item.get("CNT").toString());
//            ctList.add(ct);
//            cntList.add(cnt);
//        });
//        result.setCt(ctList);
//        result.setCnt(cntList);
//        //sso访问量
//        resultMap.put("mapLists",JSONObject.toJSON(result));
//        Integer login=loginHisService.totalSsoCount(type);
//        resultMap.put("ssotocal",login);
//        Integer accountcount=loginHisService.countPv(type,null,null);
//        resultMap.put("accountcount",accountcount);
//        loginHisService.searchSsoCount();
//
////        //总访问量
////        List<Map> mapLists =loginHisService.countsPv(type);
////        resultMap.put("countaccount",mapLists);
////        List<String> ctLists = new ArrayList<>();
////        List<Integer> cntLists = new ArrayList<>();
////        //总访问量
////        List<Map> mapListsd =loginHisService.countPv(type,null,null);
////        mapListsd.forEach(item->{
////            String ct = item.get("TM").toString();
////            Integer nms =Integer.parseInt(item.get("CNT").toString());
////            ctLists.add(ct);
////            cntLists.add(nms);
////        });
////        result.setCnt(cntLists);
////        result.setCt(ctLists);
////        resultMap.put("countaccount",result);
//        return new ResObject(HttpStatus.OK.value(),resultMap,"所有");
//    }
//
//
//
//}
