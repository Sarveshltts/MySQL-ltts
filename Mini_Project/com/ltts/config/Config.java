package com.ltts.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config 
{
	public Connection getConnection() throws SQLException
	{
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini","root","root");
	return c;
	}
}
