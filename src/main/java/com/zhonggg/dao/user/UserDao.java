
/** 
* @Title: UserDao.java
* @Package com.zhonggg.dao.user
* @Description: TODO(用一句话描述该文件做什么)
* @author LJZ
* @date 2019年1月30日
* @version V1.0 
*/

package com.zhonggg.dao.user;

import org.springframework.stereotype.Component;

import com.zhonggg.domain.User;
import com.zhonggg.utils.BaseDao;


/**
 * @ClassName: UserDao
 * @Description:用户相关
 * @author LJZ
 * @date 2019年1月30日
 *
 */
@Component
public class UserDao extends BaseDao {
	public User findByUsername(String userName){
		return (User) this.selectOne("UserDao.findByUsername", userName);
	}
}
