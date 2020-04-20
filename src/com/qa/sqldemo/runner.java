package com.qa.sqldemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class runner {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/gamedb?useSSL=false";
	static final String USER = "root";
	static final String PASS = "root";

	public static void main(String[] args) {
		
		//Start up
		Connection conn = null;
		Statement stmt = null;
		

//		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Starting connection to db");

		try {
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Connected!!");

//		System.out.println("Starting insert statement");
//		
		String tablename = "Customers";
		//Create Statements
//		int ID = 1;
//		System.out.println("customer's first name: ");
//		String firstname = sc.nextLine();
//		System.out.println("customer's last name: ");
//		String lastname = sc.nextLine();
//		System.out.println("Customer address: ");
//		String address = sc.nextLine();
//		System.out.println("Customer email: ");
//		String email = sc.nextLine();
//		System.out.println("Customer age: ");
//		int age = sc.nextInt();
//		sc.close();
//
//		try {
//			stmt = conn.createStatement();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		String sqlinsert = "INSERT INTO " + TableName + " Values(" + ID + ",'" + firstname + "','" + lastname + "','"
//				+ address + "','" + email + "'," + age + ")";
//
//		try {
//			stmt.executeUpdate(sqlinsert);
//			System.out.println("Statement inserted");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		
		
		
		
		// Read statements
//		System.out.println("Selecting current statement");
//		try {
//			stmt = conn.createStatement();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		String sql2 = "SELECT customerID,firstname,lastname,address,email,age from Customers";
//		ResultSet rs = null;
//		try {
//			rs = stmt.executeQuery(sql2);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			while (rs.next()) {
//				int ID = rs.getInt("customerID");	//get int from column name cystomer ID
//				String name1 = rs.getString("firstname");
//				String name2 = rs.getString("lastname");
//				String address = rs.getString("address");
//				String email = rs.getString("email");
//				int age = rs.getInt("age");
//				System.out.println(ID+" "+name1+" "+name2+" "+address+" "+email+" "+age);
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//update statements
//		System.out.println("Updating statement");
//
//		
//		String sql3 = "update "+tablename+ " set age = 40 where customerID = 1";
//		try {
//			stmt.executeUpdate(sql3);
//			System.out.println("updated");
//		} catch (SQLException e) {
//			//TODO manually typing this is dumb
//			System.out.println("failure to launch");
//			e.printStackTrace();
//		}

		//Delete Statment
		System.out.println("Delete Statement");
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql4 = "DELETE FROM "+ tablename + " WHERE customerID = 1";
		try {
			stmt.executeUpdate(sql4);
			System.out.println("records deleted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
//		try {
//			conn.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}