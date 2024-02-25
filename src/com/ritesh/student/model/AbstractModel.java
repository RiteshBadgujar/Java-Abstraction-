package com.ritesh.student.Model;

public class AbstractModel {

	 
	  private int rollno;
	  private String name;
	  private String mobno;
	  private float fees;
		
    public  void  setRollno(int rollno) {
    	this.rollno=rollno;
	}
	
    public void  setName(String name) {
    	this.name=name;
	}
	
	public void  setMobno(String mobno) {	
		this.mobno=mobno;
	}

	public void  setFees(float fees) {
		this.fees=fees;
	}
	
	public int getRollno() {
		return this.rollno;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getMobno() {
		return this.mobno;
	}
	
	public float getFees() {
		return this.fees;
	}
	
}
