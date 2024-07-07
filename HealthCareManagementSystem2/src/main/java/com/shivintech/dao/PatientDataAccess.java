package com.shivintech.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.shivintech.model.Patient;

public class PatientDataAccess 
{
	  private static String dbUrl="jdbc:mysql://localhost:3306/springmvc";
	  private static String dbUsername="root";
	  private static String dbPassword="Giri@226";
	  
	  private static Connection cn=null;
	  private static PreparedStatement ps=null;
	  
	  public static void insertPatientDetail(Patient pd)
		 {
			    try
			    {
					Class.forName("com.mysql.cj.jdbc.Driver");
					cn	=DriverManager.getConnection(dbUrl,dbUsername,dbPassword);  
					//step 3:prepared Statement
					ps = cn.prepareStatement("insert into patient(id,name,email,password,gender) values(?,?,?,?,?)");
	// To get value present in bean class private variable we will use getter methods because we are using Patient input type in method.
		            ps.setInt(1, pd.getId());
		            ps.setString(2, pd.getName());
		            ps.setString(3, pd.getEmail());
		            ps.setString(4, pd.getPassword());
		            ps.setString(5, pd.getGender());
		            ps.executeUpdate();
				} 
			    catch (ClassNotFoundException | SQLException e)
			    {
					e.printStackTrace();
				}
			    finally
			    {
			    	if(ps!=null) // To avoid null pointer Exception
					{
						try
						{
							ps.close();
						} 
						catch (SQLException e1)
						{
							e1.printStackTrace();
						}
					}
					if(cn!=null)
					{
						try
						{
							cn.close();
						}
						catch (SQLException e1) 
						{
							e1.printStackTrace();
						}
					}
			    }
		   }
	  
}
