package com.connection_master_api;

import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.dbmanager.connection.setting.AbstractConnectionSettings;
import com.dbmanager.connection.setting.ConnectionSettings;
import com.dbmanager.objectify.Objectify;
import com.dbmanager.property.util.PropertyReader;

public class DatabaseService {
	private static final Logger logger = Logger.getLogger("DatabaseService.class");
	private AbstractConnectionSettings connectionSettings;
	public static final String PROPERTIES = "resources\\connection-master-properties\\mysql.properties";

	public DatabaseService() throws IOException {
		connectionSettings = new ConnectionSettings(new PropertyReader(new File(PROPERTIES)).readProperties());
	}

	public void save(Employee employee) throws Exception {
		connectionSettings.build();
		String query = "insert into employee(empobj) values (?)";
		PreparedStatement prepareStatement = connectionSettings.getConnection().prepareStatement(query);
		prepareStatement.setObject(1, Objectify.serialize(employee));
		prepareStatement.executeUpdate();
		logger.info("Employee saved!");
		connectionSettings.closeConnection();
	}

	public Employee find(int id) throws Exception {
		connectionSettings.build();
		String query = "select * from employee where id = ?";
		PreparedStatement prepareStatement = connectionSettings.getConnection().prepareStatement(query);
		prepareStatement.setInt(1, 1);
		ResultSet rs = prepareStatement.executeQuery();
		Employee employee = null;
		if (rs.next()) {
			employee = (Employee) Objectify.deserialize(rs.getBytes("empobj"));
		}
		connectionSettings.closeConnection();
		return employee;
	}

	public void usingQueryRunner() throws Exception {
		connectionSettings.build();
		QueryRunner queryRunner = new QueryRunner();
		ResultSetHandler<Employee> resultHandler = new BeanHandler<Employee>(Employee.class);
		Employee emp = queryRunner.query(connectionSettings.getConnection(), "SELECT * FROM employee WHERE id=?",
				resultHandler, 1);
		System.out.println(emp);
		connectionSettings.closeConnection();
	}
}
