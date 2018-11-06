
/** 
* @Title: User.java
* @Package com.zhonggg.domain
* @Description: TODO(用一句话描述该文件做什么)
* @author LJZ
* @date 2018年11月2日
* @version V1.0 
*/

package com.zhonggg.domain;


/**
 * @ClassName: User
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author LJZ
 * @date 2018年11月2日
 *
 */

public class User {
	private Integer id;
    private String username;
    private String password;
	/**
	 * @return id
	 */
	
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return username
	 */
	
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return password
	 */
	
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	
	public void setPassword(String password) {
		this.password = password;
	}

    
}
