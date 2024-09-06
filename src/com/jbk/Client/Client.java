package com.jbk.Client;

import java.util.ArrayList;

import com.jbk.Controller.ClassroomController;
import com.jbk.entity.Classrooms;

public class Client {

	public static void main(String[] args) {
		ArrayList<Classrooms> l=ClassroomController.getAllClassrooms();
		for (Classrooms classrooms : l) {
			System.out.println(classrooms);
			
		}
		System.out.println();
		
		ArrayList<Classrooms> lr=ClassroomController.getClassroomsById(1105);
		for (Classrooms classrooms : lr) {
			System.out.println(classrooms);
			
		}
		System.out.println();
		ArrayList<Classrooms> le = ClassroomController.getClassroomsByName("Karve Nagar,pune");
		for (Classrooms classrooms : le) 
		{
			System.out.println(classrooms);	
		}
		
	}
}
