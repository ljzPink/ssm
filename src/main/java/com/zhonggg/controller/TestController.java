
/** 
* @Title: TestController.java
* @Package com.zhonggg.controller
* @Description: TODO(用一句话描述该文件做什么)
* @author LJZ
* @date 2018年11月5日
* @version V1.0 
*/

package com.zhonggg.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @ClassName: TestController
 * @Description: 测试连接
 * @author LJZ
 * @date 2018年11月5日
 *
 */
@Controller
public class TestController {
	@RequestMapping(value = "/test", produces="application/json;charset=utf-8", method={RequestMethod.POST, RequestMethod.GET})
    public String login(HttpServletRequest req, HttpServletResponse resp) {
        
	 return "111111111111111";
	 }
}
