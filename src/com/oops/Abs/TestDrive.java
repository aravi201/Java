package com.oops.Abs;

public class TestDrive {

	public static void main(String[] args) {
		Attendance dev =new Developer();
		Attendance test=new Tester();
		Attendance Man=new Manager();
		
		dev.markAttendance();
		test.markAttendance();
		Man.markAttendance();
	}

}
