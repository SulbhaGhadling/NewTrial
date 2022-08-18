package com.serviceImpl;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.model.Batch;
import com.model.Course;
import com.model.Faculty;
import com.model.Student;
import com.service.ClassMngService;

public class ClassMngServiceImpl implements ClassMngService {

	Scanner sc;

	@Override
	public void addCourse() {
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/batchdb16", "root", "root");
			String sql = "insert into course values(?, ?)";
			ps = conn.prepareStatement(sql);

			sc = new Scanner(System.in);
			System.out.println("Enter Course ID: ");
			int courseID = getcid();	//55
			System.out.println("Enter Course Name: ");
			String courseName = sc.next();

			ps.setInt(1, courseID);
			ps.setString(2, courseName);
			ps.executeUpdate();

			System.out.println("Course Record added Successfully.");
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
}

	private int getcid() {
		sc = new Scanner(System.in);
		int courseid = 0;
		try {
			courseid = sc.nextInt();	//55
		} catch (InputMismatchException e) {
			System.out.println("Please Re-Enter Course ID as integer numbers only, greater than 0.");
			return getcid();
		}
		if (isvalidcID(courseid)) {
			return courseid;	//55
		} else {
			return getcid();
		}
	}

	private boolean isvalidcID(int cid) {
		boolean flag = false;
		if (cid > 0) {
			flag = true;
		}
		return flag;
	}

	@Override
	public void displayCourse() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/batchdb16", "root",
					"root");
			String sql = "select * from course";
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("CourseID\tCourseName");
			while (rs.next()) {
				Integer CourseID = rs.getInt(1);
				String CourseName = rs.getString(2);
				System.out.println(CourseID + "\t\t" + CourseName);
			}
			connection.close();
			System.out.println("Course Record displayed Successfuly !!!");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void addFaculty() {
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/batchdb16", "root", "root");
			String sql = "insert into faculty values(?,?,?)";
			ps = conn.prepareStatement(sql);

			sc = new Scanner(System.in);
			System.out.println("Enter Faculty ID: ");
			int facultyID = getfid();
			System.out.println("Enter Faculty Name: ");
			String facultyName = sc.next();
			System.out.println("Enter CourseID from below table to assign to facutly: ");
			displayCourse();
			int f_cid = selectf_cid();

			ps.setInt(1, facultyID);
			ps.setString(2, facultyName);
			ps.setInt(3, f_cid);
			ps.executeUpdate();

			System.out.println("Faculty Record added Successfully.");
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private int selectf_cid() {
		sc = new Scanner(System.in);
		int f_cid = 0;
		try {
			f_cid = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Please Enter Course ID only: ");
			return selectf_cid();
		}
		if (isvalidf_cID(f_cid)) {
			return f_cid;
		} else {
			return selectf_cid();
		}
	}

	private boolean isvalidf_cID(int f_cid) {
		boolean flag = false;
		if (f_cid > 0) {
			flag = true;
		}
		return flag;
	}

	private int getfid() {
		sc = new Scanner(System.in);
		int facultyid = 0;
		try {
			facultyid = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Please ReEnter Faculty ID as integer numbers only greater than 0.");
			return getfid();
		}
		if (isvalidcID(facultyid)) {
			return facultyid;
		} else {
			return getfid();
		}
	}

	private boolean isvalidfID(int fid) {
		boolean flag = false;
		if (fid > 0) {
			flag = true;
		}
		return flag;
	}

	@Override
	public void displayFaculty() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/batchdb16", "root",
					"root");
			String sql = "select * from faculty";
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("FacultyID\tFacultyName\tCourseID");
			while (rs.next()) {
				Integer FacultyID = rs.getInt(1);
				String FacultyName = rs.getString(2);
				Integer cid = rs.getInt(3);
				System.out.println(FacultyID + "\t\t" + FacultyName + "\t\t" + cid);
			}
			connection.close();
			System.out.println("Course Record displayed Successfuly !!!");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void addBatch() {
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/batchdb16", "root", "root");
			String sql = "insert into batch values(?,?,?)";
			ps = conn.prepareStatement(sql);

			sc = new Scanner(System.in);
			System.out.println("Enter Batch ID: ");
			int batchID = getbid();
			System.out.println("Enter Batch Name: ");
			String batchName = sc.next();
			System.out.println("Enter FacultyID from below table to assign to Batch: ");
			displayFaculty();
			int b_fid = selectb_fid();

			ps.setInt(1, batchID);
			ps.setString(2, batchName);
			ps.setInt(3, b_fid);
			ps.executeUpdate();

			System.out.println("Batch Record added Successfully.");
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private int selectb_fid() {
		sc = new Scanner(System.in);
		int b_fid = 0;
		try {
			b_fid = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Please Enter Faculty ID only: ");
			return selectb_fid();
		}
		if (isvalidb_fID(b_fid)) {
			return b_fid;
		} else {
			return selectb_fid();
		}
	}

	private boolean isvalidb_fID(int b_fid) {
		boolean flag = false;
		if (b_fid > 0) {
			flag = true;
		}
		return flag;
	}

	private int getbid() {
		sc = new Scanner(System.in);
		int batchid = 0;
		try {
			batchid = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Please ReEnter Batch ID as integer numbers only greater than 0.");
			return getbid();
		}
		if (isvalidbID(batchid)) {
			return batchid;
		} else {
			return getbid();
		}
	}

	private boolean isvalidbID(int bid) {
		boolean flag = false;
		if (bid > 0) {
			flag = true;
		}
		return flag;
	}

	@Override
	public void displayBatch() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/batchdb16", "root",
					"root");
			String sql = "select b.batch_ID, b.batch_Name,f.faculty_name, c.course_name from course c inner join  faculty f on c.COURSE_ID = f.COURSEID\r\n"
					+ "inner join Batch b on f.FACULTY_ID=b.FACULTYID;";
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("BatchID\t\tBatchName\tFacultyName\t\tCourseName");
			while (rs.next()) {
				Integer batchID = rs.getInt(1);
				String batchName = rs.getString(2);
				String facultyName = rs.getString(3);
				String courseName = rs.getString(4);
				System.out.println(batchID + "\t\t" + batchName + "\t\t" + facultyName + "\t\t" + courseName);
			}
			connection.close();
			System.out.println("Batch Record displayed Successfuly !!!");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void addStudent() {
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/batchdb16", "root", "root");
			String sql = "insert into std values(?,?,?)";
			ps = conn.prepareStatement(sql);

			sc = new Scanner(System.in);
			System.out.println("Enter Student ID: ");
			int studentID = getbid();
			System.out.println("Enter Student Name: ");
			String studentName = sc.next();
			System.out.println("Enter BatchID from below table to assign to Batch: ");
			displayBatch();
			int s_bid = selects_bid();

			ps.setInt(1, studentID);
			ps.setString(2, studentName);
			ps.setInt(3, s_bid);
			ps.executeUpdate();

			System.out.println("Batch Record added Successfully.");
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private int selects_bid() {
		sc = new Scanner(System.in);
		int s_bid = 0;
		try {
			s_bid = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Please Enter Faculty ID only: ");
			return selects_bid();
		}
		if (isvalids_bID(s_bid)) {
			return s_bid;
		} else {
			return selects_bid();
		}
	}

	private boolean isvalids_bID(int s_bid) {
		boolean flag = false;
		if (s_bid > 0) {
			flag = true;
		}
		return flag;
	}

	private int getsid() {
		sc = new Scanner(System.in);
		int studentid = 0;
		try {
			studentid = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Please ReEnter student ID as integer numbers only greater than 0.");
			return getsid();
		}
		if (isvalidsID(studentid)) {
			return studentid;
		} else {
			return getsid();
		}
	}

	private boolean isvalidsID(int sid) {
		boolean flag = false;
		if (sid > 0) {
			flag = true;
		}
		return flag;
	}

	@Override
	public void displayStudent() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/batchdb16", "root",
					"root");
			String sql = "select * from course c inner join  faculty f on c.COURSE_ID = f.COURSEID\r\n"
					+ " inner join Batch b on f.FACULTY_ID=b.FACULTYID inner join std s on b.BATCH_ID=s.BATCHID";
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("StudentID\t\tStudentName\t\tBatchName\t\tFacultyName\t\tCourseName");
			while (rs.next()) {
				Integer studentID = rs.getInt(9);
				String studentName = rs.getString(10);
				String batchName = rs.getString(7);
				String facultyName = rs.getString(4);
				String courseName = rs.getString(2);
				System.out.println(studentID+"\t\t\t"+studentName+"\t\t\t"+batchName+"\t\t\t"+facultyName+"\t\t\t"+courseName);
			}
			connection.close();
			System.out.println("Student Record displayed Successfuly !!!");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}