package com.store_devnagari;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StoreDevnagari {
	public static String DRIVER = "com.mysql.jdbc.Driver";
	public static String USERNAME = "root";
	public static String PASSWORD = "root";
	public static String DB_NAME = "devnagari";
	public static String SETTING = "?useUnicode=true&characterEncoding=UTF-8";
	public static String URL = "jdbc:mysql://localhost/" + DB_NAME + SETTING;

	public static void storeDevnagariData() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			stmt = con.createStatement();
			String query = "insert into devnagari_data(devnagari_text) values('मी पुणे मध्ये राहतो')";
			stmt.executeUpdate(query);
			System.out.println(" Data stored.");
		} catch (Exception e) {
			System.out.println(" Store devnagari data exception: " + e);
		} finally {
			try {
				con.close();
			} catch (Exception e) {
				System.out.println(" Close connection exception: " + e);
			}
		}
	}

	public static void retrieveDevnagariData() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			stmt = con.createStatement();
			String query = "select * from devnagari_data";
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.println(rs.getString("devnagari_text"));
			}
		} catch (Exception e) {
			System.out.println(" Store devnagari data exception: " + e);
		} finally {
			try {
				con.close();
			} catch (Exception e) {
				System.out.println(" Close connection exception: " + e);
			}
		}
	}

	public static void main(String[] args) {
		// storeDevnagariData();
		retrieveDevnagariData();
	}
}

// CREATE DATABASE devnagari DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
// USE devnagari;
// CREATE TABLE IF NOT EXISTS devnagari_data (
// id int(11) NOT NULL AUTO_INCREMENT,
// devnagari_text varchar(100) NOT NULL,
// PRIMARY KEY (id)
// ) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=20 ;