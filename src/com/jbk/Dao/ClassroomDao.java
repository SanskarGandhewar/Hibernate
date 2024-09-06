package com.jbk.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.jbk.entity.Classrooms;

public class ClassroomDao {
	
	public static ArrayList<Classrooms> fetchAllClassrooms()
	{
		ArrayList<Classrooms> listcls=new ArrayList<>();
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/thekiranacademy","root","root");
			Statement stm=con.createStatement();
			String sql="select * from classrooms";
			ResultSet rs=stm.executeQuery(sql);
			
			while(rs.next())
			{
				Classrooms classroom =new Classrooms();
				int id=rs.getInt(1);
				String Name=rs.getString(2);
				String Floor=rs.getString(3);
				String Location=rs.getString(4);
				int StudCount=rs.getInt(5);
				int StudPlaced=rs.getInt(6);
				
				classroom.setClsID(id);
				classroom.setClsName(Name);
				classroom.setClsFloor(Floor);
				classroom.setClsLocation(Location);
				classroom.setClsStudCount(StudCount);
				classroom.setClsStudPlaced(StudPlaced);
				
				listcls.add(classroom);
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return listcls;
	} 
	
	public static void insertClassroomDetail(Classrooms classrooms) throws  Exception
	{

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/thekiranacademy","root","root");
		
		String sql="insert into classrooms (clsID, clsName, clsFloor, clsLocation, clsStudCount,clsStudPlaced) values (?, ?, ?, ?, ?,?)";
		
		PreparedStatement preparedStatement=con.prepareStatement(sql);
		
		preparedStatement.setInt(1, classrooms.getClsID());
		preparedStatement.setString(2, classrooms.getClsName());
		preparedStatement.setString(3, classrooms.getClsFloor());
		preparedStatement.setString(4, classrooms.getClsLocation());
		preparedStatement.setInt(5, classrooms.getClsStudCount());
		preparedStatement.setInt(6, classrooms.getClsStudPlaced());
		
		preparedStatement.executeUpdate();
		
		con.close();
	}
	
	

}
