
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

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.zhonggg.dao.UserDao;
import com.zhonggg.domain.User;


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
	@Resource
    private UserDao userDao;

    @RequestMapping("/view")
    public String view() {
        return "main/login";
    }

    @RequestMapping("/indexview")
    public String index() {
        return "main/index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(User model, HttpSession session) {
        User user = userDao.findByUsername(model.getUsername());

        session.setAttribute("user", user);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }
}
