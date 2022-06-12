package com.cg.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("unused")
@Entity
@Table(name="student1")
public class Student
{
//	private static final long serialVersionUID=1L;
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	//@Column(name="ID")
	private int id;
	private String name;
	//@ManyToOne(cascade=CascadeType.ALL)
    //@JoinColumn(name="College_ID")
	private String college;
	private int roll;
	private String qualification;
	private String course;
	private int year;
	//@OneToOne(cascade=CascadeType.ALL)
	//@JoinColumn(name="Certificate_ID")
//	private String certificate;
	private int hallTicketNo;
	
	public Student() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String string) {
		this.college = string;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
//
//	public String getCertificate() {
//		return certificate;
//	}
//
//	public void setCertificate(String string) {
//		this.certificate = string;
//	}

	public int getHallTicketNo() {
		return hallTicketNo;
	}

	public void setHallTicketNo(int hallTicketNo) {
		this.hallTicketNo = hallTicketNo;
	}

}
