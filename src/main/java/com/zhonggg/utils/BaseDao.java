
/** 
* @Title: BaseDao.java
* @Package com.zhonggg.utils
* @Description: TODO(用一句话描述该文件做什么)
* @author LJZ
* @date 2019年1月30日
* @version V1.0 
*/

package com.zhonggg.utils;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * @ClassName: BaseDao
 * @Description: 
 * @author LJZ
 * @date 2019年1月30日
 *
 */

public class BaseDao<T> {
	@Autowired
    public SqlSessionTemplate idcp_sessionTemplate;
    
	/**
	 * 根据实体添加记录, 返回添加成功条数
	 * 
	 * @param statement
	 * @param parameter
	 * @return 返回添加成功条数
	 */
    public int add(String statement, T parameter){
    	return idcp_sessionTemplate.insert(statement, parameter);
    }
    
    public int add(String statement){
    	return idcp_sessionTemplate.insert(statement);
    }
    
	/**
	 * 根据id删除记录, 返回删除成功条数
	 * 
	 * @param statement
	 * @param parameter
	 * @return 返回删除成功条数
	 */
    public int delete(String statement, Object id){
    	return idcp_sessionTemplate.delete(statement, id) ;
    }
    
    public int delete(String statement){
    	return idcp_sessionTemplate.delete(statement) ;
    }
    
    
	/**
	 * 根据参数条件更新记录, 返回更新成功条数
	 * 
	 * @param statement
	 * @param parameter
	 * @return 返回更新成功条数
	 */
    public int update(String statement, Object parameter){
    	return idcp_sessionTemplate.update(statement, parameter) ;
    }
    
	/**
	 * 无条件全部更新记录
	 * 
	 * @param statement
	 * @return 返回更新成功条数
	 */
    public int update(String statement){
    	return idcp_sessionTemplate.update(statement) ;
    }
    
	/**
	 * 根据单个参数条件查询单条记录, 返回查询的实体
	 * 
	 * @param statement
	 * @param parameter
	 * @return 返回更新成功条数
	 */
    @SuppressWarnings("unchecked")
	public T selectOne(String statement, Object parameter){
    	return (T) idcp_sessionTemplate.selectOne(statement, parameter) ;	 
    }
    
    @SuppressWarnings("unchecked")
	public String selectNum(String statement, Map<String, Object> parameter){
    	return (String) idcp_sessionTemplate.selectOne(statement, parameter) ;	 
    }
    
    
    @SuppressWarnings("unchecked")
	public T selectOne(String statement){
    	return (T) idcp_sessionTemplate.selectOne(statement) ;	 
    }
    @SuppressWarnings("unchecked")
	public String selectNum(String statement, Object parameter){
    	return    (String) idcp_sessionTemplate.selectOne(statement, parameter) ;	 
    }
    
   
    public String selectNum(String statement){
    	return    (String) idcp_sessionTemplate.selectOne(statement) ;	 
    }
    public Integer selectIntNum(String statement){
    	return    (Integer) idcp_sessionTemplate.selectOne(statement) ;	 
    }
    public Integer selectIntNum(String statement,String parameter){
    	return    (Integer) idcp_sessionTemplate.selectOne(statement,parameter) ;	 
    }
   
	/**
	 * 根据多个参数条件查询单条记录, 返回查询的实体
	 * 
	 * @param statement
	 * @param parameter
	 * @return 返回更新成功条数
	 */
    @SuppressWarnings("unchecked")
    public T selectOne(String statement, Map<String, Object> parameter){
    	return (T) idcp_sessionTemplate.selectOne(statement, parameter) ;	 
    }
    
    /**
     * 根据参数条件查询单条记录, 返回查询的实体
     * 
     * @param statement
     * @param parameter
     * @return 返回更新成功条数
     */
    @SuppressWarnings("unchecked")
    public List<T> selectList(String statement, Map<String, Object> parameter){
    	System.out.print(statement);
    	return (List<T>) idcp_sessionTemplate.selectList(statement, parameter); 
    }
    
    @SuppressWarnings("unchecked")
    public List<T> selectList(String statement, Object parameter){
    	return (List<T>) idcp_sessionTemplate.selectList(statement, parameter); 
    }
	/**
	 * 根据参数条件查询单条记录, 返回查询的实体
	 * 
	 * @param statement
	 * @param parameter
	 * @return 返回更新成功条数
	 */
    @SuppressWarnings("unchecked")
    public List<T> selectList(String statement){
    	return (List<T>) idcp_sessionTemplate.selectList(statement); 
    }
    
	/**
	 * 根据参数条件查询, 返回分页后的结果集
	 * @param statement
	 * @param parameter
	 * @param rowBounds new RowBounds(2, 1)
	 * @return
	 */
    @SuppressWarnings("unchecked")
    public List<T> selectList(String statement, Map<String, Object> parameter, RowBounds rowBounds){
    	return (List<T>) idcp_sessionTemplate.selectList(statement, parameter, rowBounds); 
    }
    
    public Map<?, ?> selectMap(String statement,String mapKey){
    	return   idcp_sessionTemplate.selectMap(statement, mapKey); 
    }
    
    public Object selectOneObject(String statement, Map<String, Object> parameter){
    	return   idcp_sessionTemplate.selectOne(statement,parameter); 
    }
    
    public Object selectOneObject(String statement){
    	return   idcp_sessionTemplate.selectOne(statement); 
    }
}
