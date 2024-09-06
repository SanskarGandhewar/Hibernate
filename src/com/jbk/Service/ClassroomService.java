package com.jbk.Service;

import java.util.ArrayList;

import com.jbk.Dao.ClassroomDao;
import com.jbk.entity.Classrooms;

public class ClassroomService {

	public static ArrayList<Classrooms> LoadAllClassrooms()
	{
		ArrayList<Classrooms> list=ClassroomDao.fetchAllClassrooms();
		return list;
	}

	public static ArrayList<Classrooms> LoadClassroomsById(int clsID)
	{
		ArrayList<Classrooms> list=ClassroomDao.fetchAllClassrooms();
		ArrayList<Classrooms> ls= new ArrayList<Classrooms>();
	
		for (Classrooms classrooms : list) 
		{
			if(clsID==classrooms.getClsID())
			{
				ls.add(classrooms);
			}
		}
		return ls;
	}

	public static ArrayList<Classrooms> LoadClassroomsBylocation(String clsLocation)
	{
		ArrayList<Classrooms> list=ClassroomDao.fetchAllClassrooms(); 
		ArrayList<Classrooms> cls= new ArrayList<Classrooms>();
		for (Classrooms classrooms : list)
		{
			if(clsLocation.equals(classrooms.getClsLocation()))
			{
				cls.add(classrooms);
			}
		}
		return cls;
	}
}
