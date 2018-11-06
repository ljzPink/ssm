
/** 
* @Title: UserDao.java
* @Package com.zhonggg.dao
* @Description: TODO(用一句话描述该文件做什么)
* @author LJZ
* @date 2018年11月2日
* @version V1.0 
*/

package com.zhonggg.dao;

import com.zhonggg.domain.User;


/**
 * @ClassName: UserDao
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author LJZ
 * @date 2018年11月2日
 *
 */

public interface UserDao {
	 public abstract User findByUsername(String username);
}
