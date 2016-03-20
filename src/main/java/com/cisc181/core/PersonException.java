package com.cisc181.core;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonException extends Exception {
	private Person person;
	private Date DOB;
	private String phone_number;
	/**
	 * Create an instance of the InsufficientFundsException class, to be thrown
	 * to the caller
	 * 
	 * @param people
	 */
	public PersonException(Person person) {
		this.person = person;
	}

	public PersonException(PersonException personException) {
		// TODO Auto-generated constructor stub
	}

	public String getPerson(String Person) {
		return Person;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date DOB) throws PersonException {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, 100);
		if (calendar.getTime().before(DOB)) {
			throw new PersonException(this);
		}
		this.DOB = DOB;
	}

	public String getPhone() {
		return phone_number;
	} 
	public void setPhone(String newPhone_number) throws PersonException {
		Pattern pattern = Pattern.compile("^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$");
		if (!pattern.matcher(newPhone_number).matches()) {
			throw new PersonException(this);
		}

		phone_number = newPhone_number;
	}

	
    
}

