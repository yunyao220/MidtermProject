package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

import javax.xml.bind.annotation.XmlElement;

import com.cisc181.eNums.eMajor;

public class Student extends Person {
	@XmlElement
	private eMajor Major;
	private UUID studentID;
	
	public eMajor getMajor ()
    {
        return this.Major;
    }
    public void setMajor (eMajor Major)
    {
        this.Major = Major;           
    }
    
	public Student(String FirstName, String MiddleName, String LastName,Date DOB, eMajor Major,
			String Address, String Phone_number, String Email) 
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number, Email);
		this.Major = Major;
		studentID = UUID.randomUUID();
		
	}
	public UUID getStudentID() {
		return studentID;
	}
	
	@Override
	public void PrintName() {
		System.out.println(getLastName() + ","  + getFirstName() + ' ' + getMiddleName());
	}

	public void PrintName(boolean bnormal)
	{
		super.PrintName();
	}
}