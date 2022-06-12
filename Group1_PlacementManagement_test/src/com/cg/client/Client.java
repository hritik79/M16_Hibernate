package com.cg.client;

import java.time.LocalDate;

import com.cg.entities.Admin;
import com.cg.entities.Certificate;
import com.cg.entities.College;
import com.cg.entities.Placement;
import com.cg.entities.Student;
import com.cg.entities.User;
import com.cg.service.ICertificateServiceImpl;
import com.cg.service.ICollegeService;
import com.cg.service.ICollegeServiceImpl;
import com.cg.service.IAdminService;
import com.cg.service.IAdminServiceImpl;
import com.cg.service.ICertificateService;
import com.cg.service.IPlacementService;
import com.cg.service.IStudentService;
import com.cg.service.IPlacementServiceImpl;
import com.cg.service.IStudentServiceImpl;
import com.cg.service.IUserService;
import com.cg.service.IUserServiceImpl;

@SuppressWarnings("unused")
public class Client {

	public static void main(String[] args) 
	{
			Student student = new Student();
			IStudentService service = new IStudentServiceImpl();
			
		    student.setId(413);
			student.setName("Test Jain");
			student.setCollege("yCCE");
			student.setRoll(1002);
			student.setQualification("BE");
			student.setCourse("E&TC");
			student.setYear(2020);
			student.setHallTicketNo(1010);
			service.addStudent(student);
			
			User u=new User();
			u.setId(6010);
			u.setName("Test1");
			u.setType("Faculty");
			u.setPassword("Test1@123");
			
			IUserService user=new IUserServiceImpl();
			User u2 = user.addNewUser(u);
			user.login(u2);
			
			System.out.println("data is inserted");
			
			/*Certificate c=new Certificate();
			c.setId(324);
			c.setYear(2021);
			College col=new College();
			col.setId(501);
			col.setCollegeName("Y.C.C.E");
			col.setLocation("Nagpur");
			

			
			
			user.addNewUser(u);
			col.setCollegeAdmin(u);
			ICollegeService college=new ICollegeServiceImpl();
			college.addCollege(col);
			c.setCollege(col);
			ICertificateService certificate=new ICertificateServiceImpl();
			certificate.addCertificate(c);
	        student.setCollege(col);
			student.setRoll(785);
			student.setQualification("BE");
			student.setCourse("CSE");
		    student.setCertificate(c);
			student.setHallTicketNo(701);
			
			Admin a=new Admin();
			a.setId(301);
			a.setName("Umesh Nayak");
			a.setPassword("Umesh@123");
		    IAdminService ad=new IAdminServiceImpl();
		    ad.addNewAdmin(a);
			
			

			Placement p=new Placement();
			p.setId(901);
			LocalDate date=LocalDate.now();
			p.setDate(date);
			p.setQualification("BE");
			p.setCollege(col);
			p.setName("TNS Foundation");
			p.setYear(2022);
			IPlacementService placement =new IPlacementServiceImpl();
			placement.addPlacement(p);
			Placement p1 = placement.schedulePlacement(p);
			if(p1!=null) {System.out.println("Placement Schedule on" +p1.getDate()+"For Company"+p1.getName());
			}
					
			
		
		
		
			
			
			
			
		   	student = service.searchStudentById(101);
			System.out.println("Id is: "+student.getId());
			System.out.println("Roll is: "+student.getRoll());
			System.out.println("college is: "+student.getCollege());
			
			student = service.searchStudentById(101);
			student.setCollege(col);
			service.updateStudent(student);
			System.out.println("Updated successfully");*/
		}
}

