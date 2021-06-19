package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.db.DBConnection;
import com.proje.db.Impl.MysqlDBConnectionImpl;

public class Test {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

//		-- Onerilmeyen yontem -- 
//		MysqlDBConnectionImpl mysqlDBConnecitonImpl = applicationContext.getBean("mysqlDBConnecitonImpl",
//				MysqlDBConnectionImpl.class);
//
//		mysqlDBConnecitonImpl.openConnection();
//
//		mysqlDBConnecitonImpl.closeConnection();

//		OracleDBConnectionImpl oracleDBConnectionImpl = applicationContext.getBean("oracleDBConnectionImpl",
//				OracleDBConnectionImpl.class);
//
//		oracleDBConnectionImpl.openConnection();
//		oracleDBConnectionImpl.closeConnection();
//
//		applicationContext.close();

		DBConnection dbConnection = applicationContext.getBean("mysqlDBConnecitonImpl", MysqlDBConnectionImpl.class);
//		DBConnection dbConnection2 = applicationContext.getBean("oracleDBConnectionImpl", OracleDBConnectionImpl.class);

		dbConnection.openConnection();
		
		dbConnection.closeConnection();
		
		applicationContext.close();

	}

}
