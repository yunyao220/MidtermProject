package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.eNums.eMajor;


public class Student_Test {
	private static ArrayList<Course> courses = new ArrayList();
	private static ArrayList<Semester> semesters = new ArrayList();
	private static ArrayList<Section> sections = new ArrayList();
	private static ArrayList<Student> students = new ArrayList();


	@BeforeClass
	public static void addStudentsData() throws PersonException {
		Course course = new Course();
		course.setCourseID(UUID.randomUUID());
		course.setCourseName("Chemistry");
		course.setGradePoints(2);
		course.setMajor(eMajor.CHEM);
		courses.add(course);

		course = new Course();
		course.setCourseID(UUID.randomUUID());
		course.setMajor(eMajor.PHYSICS);
		course.setCourseName("Physics");
		course.setGradePoints(3);
		courses.add(course);

		course = new Course();
		course.setCourseID(UUID.randomUUID());
		course.setMajor(eMajor.COMPSI);
		course.setCourseName("CISC");
		course.setGradePoints(4);
		courses.add(course);

		Semester sem = new Semester();
		sem.setSemesterID(UUID.randomUUID());
		Calendar calendar = Calendar.getInstance();
		calendar.set(2015, Calendar.SEPTEMBER, 1);
		sem.setStartDate(calendar.getTime());
		calendar.set(2016, Calendar.DECEMBER, 23);
		sem.setEndDate(calendar.getTime());
		semesters.add(sem);

		sem = new Semester();
		sem.setSemesterID(UUID.randomUUID());
		calendar.set(2015, Calendar.FEBRUARY, 6);
		sem.setStartDate(calendar.getTime());
		calendar.set(2015, Calendar.MAY, 23);
		sem.setEndDate(calendar.getTime());
		semesters.add(sem);

		for (Semester s : semesters) {
			for (Course c : courses) {
				Section sec = new Section();
				sec.setCourseID(c.getCourseID());
				sec.setSemesterID(s.getSemesterID());
				sec.setRoomID(0);
				sections.add(sec);

				sec = new Section();
				sec.setCourseID(c.getCourseID());
				sec.setSemesterID(s.getSemesterID());
				sec.setRoomID(1);
				sections.add(sec);
			}
		}

		calendar.set(1995, Calendar.MARCH, 15);
		Student stu = new Student("Jack", "R", "Green", calendar.getTime(), eMajor.CHEM, "266 S College Ave", "(302)-499-1234", "jrh@udel.edu");
		students.add(stu);
		calendar.set(1992, Calendar.AUGUST, 15);
		stu = new Student("Jane", "", "Green", calendar.getTime(), eMajor.CHEM, "265 S College Ave", "(302)-499-1234", "jrh@udel.edu");
		students.add(stu);
		calendar.set(1995, Calendar.MARCH, 15);
		stu = new Student("George", "R", "Smith", calendar.getTime(), eMajor.CHEM, "266 S College Ave", "(302)-499-1234", "jrh@udel.edu");
		students.add(stu);
		calendar.set(1995, Calendar.MARCH, 15);
		stu = new Student("John", "R", "Smith", calendar.getTime(), eMajor.CHEM, "286 S College Ave", "(302)-499-1234", "jrh@udel.edu");
		students.add(stu);
		calendar.set(1995, Calendar.MARCH, 15);
		stu = new Student("Coco", "R", "Smith", calendar.getTime(), eMajor.CHEM, "296 S College Ave", "(302)-499-1234", "jrh@udel.edu");
		students.add(stu);
		calendar.set(1995, Calendar.MARCH, 15);
		stu = new Student("Sam", "R", "Smith", calendar.getTime(), eMajor.CHEM, "236 S College Ave", "(302)-499-1234", "jrh@udel.edu");
		students.add(stu);
		calendar.set(1995, Calendar.MARCH, 15);
		stu = new Student("Stephen", "R", "Smith", calendar.getTime(), eMajor.CHEM, "246 S College Ave", "(302)-499-1234", "jrh@udel.edu");
		students.add(stu);
		calendar.set(1995, Calendar.MARCH, 15);
		stu = new Student("Miley", "R", "Smith", calendar.getTime(), eMajor.CHEM, "268 S College Ave", "(302)-499-1234", "jrh@udel.edu");
		students.add(stu);
		calendar.set(1995, Calendar.MARCH, 15);
		stu = new Student("Dashawn", "R", "Smith", calendar.getTime(), eMajor.CHEM, "269 S College Ave", "(302)-499-1234", "jrh@udel.edu");
		students.add(stu);
		calendar.set(1995, Calendar.MARCH, 15);
		stu = new Student("Meera", "R", "Smith", calendar.getTime(), eMajor.CHEM, "267 S College Ave", "(302)-499-1234", "jrh@udel.edu");
		students.add(stu);
		calendar.set(1995, Calendar.MARCH, 15);
	}



	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void TestCase1() {
		ArrayList<Enrollment> enrolls = new ArrayList();
		for (Section sec : sections) {
			Student stu = students.get(0);
			Enrollment enr = new Enrollment(stu.getStudentID(), sec.getSectionID());
			enr.setGrade(70);
			enrolls.add(enr);

			stu = students.get(1);
			enr = new Enrollment(stu.getStudentID(), sec.getSectionID());
			enr.setGrade(80);
			enrolls.add(enr);

			stu = students.get(2);
			enr = new Enrollment(stu.getStudentID(), sec.getSectionID());
			enr.setGrade(90);
			enrolls.add(enr);

			stu = students.get(3);
			enr = new Enrollment(stu.getStudentID(), sec.getSectionID());
			enr.setGrade(75);
			enrolls.add(enr);

			stu = students.get(4);
			enr = new Enrollment(stu.getStudentID(), sec.getSectionID());
			enr.setGrade(88);
			enrolls.add(enr);

			stu = students.get(5);
			enr = new Enrollment(stu.getStudentID(), sec.getSectionID());
			enr.setGrade(92);
			enrolls.add(enr);

			stu = students.get(6);
			enr = new Enrollment(stu.getStudentID(), sec.getSectionID());
			enr.setGrade(84);
			enrolls.add(enr);

			stu = students.get(7);
			enr = new Enrollment(stu.getStudentID(), sec.getSectionID());
			enr.setGrade(95);
			enrolls.add(enr);

			stu = students.get(8);
			enr = new Enrollment(stu.getStudentID(), sec.getSectionID());
			enr.setGrade(95);
			enrolls.add(enr);

			stu = students.get(9);
			enr = new Enrollment(stu.getStudentID(), sec.getSectionID());
			enr.setGrade(95);
			enrolls.add(enr);
		}

		assertEquals(getScale(70), getGPA(enrolls, students.get(0)), 0);
		assertEquals(getScale(80), getGPA(enrolls, students.get(1)), 0);
		assertEquals(getScale(90), getGPA(enrolls, students.get(2)), 0);
		assertEquals(getScale(75), getGPA(enrolls, students.get(3)), 0);
		assertEquals(getScale(88), getGPA(enrolls, students.get(4)), 0);
		assertEquals(getScale(92), getGPA(enrolls, students.get(5)), 0);
		assertEquals(getScale(84), getGPA(enrolls, students.get(6)), 0);
		assertEquals(getScale(95), getGPA(enrolls, students.get(7)), 0);
		assertEquals(getScale(95), getGPA(enrolls, students.get(8)), 0);
		assertEquals(getScale(95), getGPA(enrolls, students.get(9)), 0);

		for (Course course : courses) {
			assertEquals(getAvgGrades(enrolls, course), (70 + 80 + 90 + 75 + 88 + 92 + 84 + 95 + 95 + 95) / 10d, 0);
		}

		students.get(4).setMajor(eMajor.BUSINESS);
	}

	private double getAvgGrades(ArrayList<Enrollment> enrolls, Course course) {
		ArrayList<Enrollment> enrs = getEnrollsFromCourse(enrolls, course);
		double sum = 0;
		for (Enrollment enr : enrs) {
			sum += enr.getGrade();
		}
		return sum / enrs.size();
	}

	private ArrayList<Enrollment> getEnrollsFromCourse(ArrayList<Enrollment> enrolls, Course course) {
		ArrayList<Enrollment> result = new ArrayList();
		for (Enrollment enroll : enrolls) {
			UUID id = enroll.getSectionID();
			Section sec = getSectionFromSectionID(id);
			if (sec.getCourseID().equals(course.getCourseID())) {
				result.add(enroll);
			}
		}
		return result;
	}

	private double getGPA(ArrayList<Enrollment> enrolls, Student student) {
		ArrayList<Enrollment> result = new ArrayList();
		for (Enrollment enroll : enrolls) {
			if (enroll.getStudentID().equals(student.getStudentID())) {
				result.add(enroll);
			}
		}

		double gpsum = 0;
		int total = 0;
		for (Enrollment enroll : result) {
			UUID id = enroll.getSectionID();
			int gps = getCourseGradePointsFromSectionID(id);
			total += gps;
			gpsum += getScale(enroll.getGrade()) * gps;
		}
		return gpsum / total;
	}

	private double getScale(double grade) {
		if (grade < 0) {
			throw new RuntimeException("Grade should be within [0,100]");
		}
		if (grade < 60) {
			return 0;
		} else if (grade < 70) {
			return 1;
		} else if (grade < 80) {
			return 2;
		} else if (grade < 90) {
			return 3;
		} else if (grade <= 100) {
			return 4;
		} else {
			throw new RuntimeException("Grade should be within [0,100]");
		}
	}

	private int getCourseGradePointsFromSectionID(UUID sectionID) {
		for (Section section : sections) {
			if (section.getSectionID().equals(sectionID)) {
				for (Course course : courses) {
					if (course.getCourseID().equals(section.getCourseID())) {
						return course.getGradePoints();
					}
				}
				throw new RuntimeException("No such course");
			}
		}
		throw new RuntimeException("No such section");
	}

	private Section getSectionFromSectionID(UUID sectionID) {
		for (Section section : sections) {
			if (section.getSectionID().equals(sectionID)) {
				return section;
			}
		}
		throw new RuntimeException("No such section");
	}


}
