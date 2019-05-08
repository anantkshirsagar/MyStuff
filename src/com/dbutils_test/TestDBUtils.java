package com.dbutils_test;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

import org.apache.commons.dbutils.QueryRunner;

import com.dbmanager.connection.setting.AbstractConnectionSettings;
import com.dbmanager.connection.setting.ConnectionSettings;
import com.dbmanager.property.util.PropertyReader;
import com.json_to_java.StudentEntity;

public class TestDBUtils {
	private static final Logger logger = Logger.getLogger("DatabaseService.class");
	private AbstractConnectionSettings connectionSettings;
	public static final String PROPERTIES = "resources\\connection-master-properties\\mysql.properties";

	public TestDBUtils() throws IOException {
		connectionSettings = new ConnectionSettings(new PropertyReader(new File(PROPERTIES)).readProperties());
	}

	public static void main(String[] args) {
		try {
			TestDBUtils dbUtils = new TestDBUtils();
			dbUtils.connectionSettings.build();
			
			QueryRunner queryRunner = new QueryRunner();
			//ResultSetHandler<StudentEntity> resultHandler = new BeanHandler<StudentEntity>(StudentEntity.class);
			StudentEntity student = new StudentEntity();
			student.setId(101);
			student.setName("Anant Kshirsagar");
			student.setPercentage(80.8f);
			String query = "insert into studententity(id, name, percentage) values(?, ?, ?)";
			int ans = queryRunner.update(dbUtils.connectionSettings.getConnection(), query, 101, "Anant Kshirsagar", 80.0f);
			System.out.println(" Record inserted: " +ans);
			dbUtils.connectionSettings.closeConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
