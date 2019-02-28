
/** 
* @Title: UserController.java
* @Package com.zhonggg.controller
* @Description: TODO(用一句话描述该文件做什么)
* @author LJZ
* @date 2018年11月2日
* @version V1.0 
*/

package com.zhonggg.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.zhonggg.dao.user.UserDao;
import com.zhonggg.domain.User;
import com.zhonggg.service.UserService;


/**
 * @ClassName: UserController
 * @Description: 用户相关
 * @author LJZ
 * @date 2018年11月2日
 *
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
    private UserService userService;

    @RequestMapping("/")
    public String view() {
        return "user/index";
    }

    @RequestMapping("/indexview")
    public String index() {
        return "user/indexview";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login( User model, HttpSession session) {
        User user = userService.findByUsername("ljz");

        // session.setAttribute("username", user);
        //ModelAndView mav = new ModelAndView();
        // mav.setViewName("index")";
        return "index";
    }
}
