package com.registation.service.sr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registation.entity.io.Students;
import com.registation.repository.ro.Myrepository;

@Service
public class MyServie {
	
	@Autowired
	Myrepository myrepository;
	
	public void createForm(Students students) {
		myrepository.submitForm(students);
	}

	public List<Students> getAllStudents() {
		// TODO Auto-generated method stub
		return myrepository.getStudentList();
	}
	
	
	public Students getStudentById(int id) {
	    return myrepository.findById(id);
	}

	public void updateStudent(Students student) {
	    myrepository.update(student);
	}

	public void deleteStudent(int id) {
	    myrepository.delete(id);
	}
	
	public void deleteAllStudents() {
	    myrepository.deleteAll();
	}


}
