package com.usecase.message.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Message {
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Id
	private String studentEmail;
	
	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getTeacherEmail() {
		return teacherEmail;
	}

	public void setTeacherEmail(String teacherEmail) {
		this.teacherEmail = teacherEmail;
	}

	private String teacherEmail;
	
	private String message;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	
	
	

}
