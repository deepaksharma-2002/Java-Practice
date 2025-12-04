package com.registation.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.registation.entity.io.Students;
import com.registation.service.sr.MyServie;

@Controller
public class MyController {
	
	@Autowired
	MyServie myServie;
	
	@GetMapping("reg")
	public String login() {
		System.out.println("Enter registation details:::::::::");
		return "register";
	}
	
	@PostMapping("submit")
	public String registation(@ModelAttribute Students students, Model model) {
	    
		model.addAttribute("student", students);
		myServie.createForm(students);
	    return "success";
	}
	
	@GetMapping("allStudents")
	public String getAllStudent(Model model) {
		 model.addAttribute("students", myServie.getAllStudents());
		    return "list";
	}
	
	
	@GetMapping("edit/{id}")
	public String editStudent(@PathVariable("id") int id, Model model) {
	    Students student = myServie.getStudentById(id);
	    model.addAttribute("student", student);
	    return "edit"; // JSP page to edit student
	}

	@PostMapping("update")
	public String updateStudent(@ModelAttribute Students student) {
	    myServie.updateStudent(student);
	    return "redirect:/allStudents";
	}


	@GetMapping("delete/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
	    myServie.deleteStudent(id);
	    return "redirect:/allStudents";
	}
	
	@GetMapping("/deleteAll")
	public String deleteAllStudents() {
	    myServie.deleteAllStudents();
	    return "redirect:/allStudents";
	}

	

}
