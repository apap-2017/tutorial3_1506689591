package com.example.tutorial3.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.example.tutorial3.model.StudentModel;

public class InMemoryStudentService implements StudentService {
	private static List<StudentModel> studentList = new ArrayList<StudentModel>();
	
	@Override
	public StudentModel selectStudent(String npm) {
		// TODO Auto-generated method stub

		Iterator<StudentModel> itr = studentList.listIterator();
		while (itr.hasNext()) {
			StudentModel s = (StudentModel) itr.next();
			if (s.getNpm().equals(npm)) {
				return s;
			}
		}
		return null;
	}


	@Override
	public List<StudentModel> selectAllStudents() {
		// TODO Auto-generated method stub
		return studentList;
	}

	@Override
	public void addStudent(StudentModel student) {
		// TODO Auto-generated method stub
		studentList.add(student);
	}


	@Override
	public StudentModel deleteStudent(String npm) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getNpm().equals(npm)) {
				StudentModel temp = studentList.get(i);
				studentList.remove(i);
				return temp;
			}
		}
		return null;
	}
}
