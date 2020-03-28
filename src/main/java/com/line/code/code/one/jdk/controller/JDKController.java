package com.line.code.code.one.jdk.controller;

import com.line.code.code.one.base.controller.BasicController;
import com.line.code.code.one.base.domain.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: yangcs
 * @Date: 2020/3/28 14:59
 * @Description:  演示统一返回前端对象;  jdk信息
 */
@RestController
@RequestMapping("/jdk")
public class JDKController extends BasicController {

    @RequestMapping("/get-msg")
    public Response<List<Map<String,String>>> getMsg(){
        Map<String, String> msgMap = new HashMap<String, String>() {{
            put("Java虚拟机提供商", System.getProperty("java.vm.version"));
            put("Java虚拟机版本号", System.getProperty("java.vm.name"));
            put("Java虚拟机名称", System.getProperty("java.vm.vendor"));
            put("Java规范版本号", System.getProperty("java.specification.version"));
            put("Java规范提供商", System.getProperty("java.specification.vendor"));
            put("Java规范名称", System.getProperty("java.specification.name"));
            put("Java类版本号", System.getProperty("java.class.version"));
            put("Java类路径", System.getProperty("java.class.path"));
            put("Java lib路径", System.getProperty("java.library.path"));
            put("Java输入输出临时路径", System.getProperty("java.io.tmpdir"));
            put("Java编译器", System.getProperty("java.compiler"));
            put("Java执行路径", System.getProperty("java.ext.dirs"));
            put("操作系统名称", System.getProperty("os.name"));
            put("os.arch", System.getProperty("os.arch"));
            put("版本号", System.getProperty("os.version"));
            put("文件分隔符", System.getProperty("file.separator"));
            put("路径分隔符", System.getProperty("path.separator"));
            put("直线分隔符", System.getProperty("line.separator"));
            put("用户名", System.getProperty("user.name"));
            put("user.home", System.getProperty("user.home"));
            put("user.dir", System.getProperty("user.dir"));
        }};
        List<Map<String, String>> msgList = new ArrayList<Map<String, String>>(){{
            add(msgMap);
        }};
        return returnSuccess(msgList,1);
    }



}
