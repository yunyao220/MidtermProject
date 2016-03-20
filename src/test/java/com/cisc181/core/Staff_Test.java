package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;


import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@Test
	public void TestAVGSalary() {
		ArrayList<Staff> staffs = new ArrayList();
		Staff stf1 = new Staff(eTitle.TA);
		Staff stf2 = new Staff(eTitle.RA);
		Staff stf3 = new Staff(eTitle.TA);
		Staff stf4 = new Staff(eTitle.RA);
		Staff stf5 = new Staff(eTitle.INSTRUCTOR);
		stf1.setSalary(32000);
		stf2.setSalary(24000);
		stf3.setSalary(35000);
		stf4.setSalary(25000);
		stf5.setSalary(31000);
		staffs.add(stf1);
		staffs.add(stf2);
		staffs.add(stf3);
		staffs.add(stf4);
		staffs.add(stf5);

		double avg = 0;
		for (Staff staff : staffs) {
			avg += staff.getSalary() / staffs.size();
		}

		double value = 32000 + 24000 + 35000 + 25000 + 31000;
		value /= 5;

		assertEquals(avg, value, 0);
	}

	@Test(expected = PersonException.class)
	public void TestInvalidDOB() throws PersonException {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, 101);
		Staff stf = new Staff(eTitle.TA);
		stf.setDOB(calendar.getTime());
	}

	@Test(expected = PersonException.class)
	public void TestInvalidPhone() throws PersonException {
		Staff stf = new Staff(eTitle.TA);
		stf.setPhone("(608)433-8605");
	}



}
