package com.jbk.Controller;

import java.util.ArrayList;

import com.jbk.Service.ClassroomService;
import com.jbk.entity.Classrooms;

public class ClassroomController {

	public static ArrayList<Classrooms> getAllClassrooms()
	{
		ArrayList<Classrooms> listcls=ClassroomService.LoadAllClassrooms();
	
		return listcls;
	}
	
	public static ArrayList<Classrooms> getClassroomsById(int clsID)
	{
		return ClassroomService.LoadClassroomsById(clsID);
	}
	
	public static ArrayList<Classrooms> getClassroomsByName(String clsLocation)
	{
		return ClassroomService.LoadClassroomsBylocation(clsLocation);
	}
	
}
