
/** 
* @Title: CreatDB.java
* @Package ssm
* @Description: TODO(用一句话描述该文件做什么)
* @author LJZ
* @date 2019年1月9日
* @version V1.0 
*/

package ssm;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;


/**
 * @ClassName: CreatDB
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author LJZ
 * @date 2019年1月9日
 *
 */

public class CreatDB {
	public static void main(String[] args) {
		ProcessEngineConfiguration pec =ProcessEngineConfiguration.createStandaloneProcessEngineConfiguration();
		pec.setDatabaseType("mysql");
		pec.setDatabaseSchemaUpdate("true");
		pec.setJdbcDriver("com.mysql.jdbc.Driver");
		pec.setJdbcUrl("jdbc:mysql://111.231.93.35:3306/sjfx?useUnicode=true&characterEncoding=utf8&characterSetResults=utf8");
		pec.setJdbcUsername("ljz");
		pec.setJdbcPassword("Ljz217645!");

       ProcessEngine pe = pec.buildProcessEngine();

       pe.close();

	}
}
