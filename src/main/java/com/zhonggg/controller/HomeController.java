
/** 
* @Title: HomeController.java
* @Package com.zhonggg.controller
* @Description: TODO(用一句话描述该文件做什么)
* @author LJZ
* @date 2019年1月29日
* @version V1.0 
*/

package com.zhonggg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * @ClassName: HomeController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author LJZ
 * @date 2019年1月29日
 *
 */
@Controller
public class HomeController {
	@RequestMapping("/")
    public String index() {
		// ModelAndView model = new ModelAndView();
		//model.addAttribute("name", "hahha");
        return "index";
    }
}
