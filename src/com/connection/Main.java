package com.connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	
	static MySQLConnection mysqlconnect = new MySQLConnection();
	
	public static void main(String[] args) {
		Connection conexion = mysqlconnect.conectar();
		
		try {
			Statement s = conexion.createStatement(); 
			ResultSet rs = s.executeQuery ("select * from user");
		while(rs.next()){
			
			System.out.println ("id: "+ rs.getInt(1) + " username: " + rs.getString(2)); 
		}
		
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		
			e.printStackTrace();
		}
		
	}


}
