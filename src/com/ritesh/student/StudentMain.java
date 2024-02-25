package com.ritesh.student;

import java.util.Scanner;

import com.ritesh.student.Model.AbstractModel;

public class StudentMain {
	AbstractModel abstractmodel=new AbstractModel();
	public void setInput() 
	{
	
	Scanner scanner=new Scanner(System.in);
		
	System.out.println("Enter the Roll No : ");
	abstractmodel.setRollno(scanner.nextInt());
	
	System.out.println("Enter the Studnt Name : ");
	abstractmodel.setName(scanner.next());
	
	System.out.println("Enter the Mobile No : ");
	abstractmodel.setMobno(scanner.next());
	
	System.out.println("Enter the Fees : ");
	abstractmodel.setFees(scanner.nextFloat());
	
	}
	
	public void getOutput()
	{
		
	System.out.println("Roll No : "+abstractmodel.getRollno());
	
	System.out.println("Student Name : "+abstractmodel.getName());
	
	System.out.println("MObile No : "+abstractmodel.getMobno());
	
	System.out.println("Fees : "+abstractmodel.getFees());
	
	}

	public static void main(String[] args) {
		
		StudentMain student=new StudentMain();
		
		student.setInput();
		student.getOutput();
	}

}
