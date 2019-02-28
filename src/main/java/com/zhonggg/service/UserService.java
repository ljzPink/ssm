
/** 
* @Title: UserService.java
* @Package com.zhonggg.service
* @Description: TODO(用一句话描述该文件做什么)
* @author LJZ
* @date 2019年1月30日
* @version V1.0 
*/

package com.zhonggg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhonggg.dao.user.UserDao;
import com.zhonggg.domain.User;


/**
 * @ClassName: UserService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author LJZ
 * @date 2019年1月30日
 *
 */
@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public User findByUsername(String userName){
		return userDao.findByUsername(userName);
	}
}
