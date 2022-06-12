package com.cg.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="certificate1")
public class Certificate implements Serializable {
	private static final long serialVersionUID=1L;
	@Id
	
	private int id;
	private int year;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="College_ID")
	private College college;
	public Certificate() {
		super();

}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	
}
