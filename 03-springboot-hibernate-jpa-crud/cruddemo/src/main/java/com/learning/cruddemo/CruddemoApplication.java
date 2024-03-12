package com.learning.cruddemo;

import com.learning.cruddemo.dao.StudentDAO;
import com.learning.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
//			createStudent(studentDAO);
//			readStudent(studentDAO);
//			queryForStudents(studentDAO);
//			queryForStudentsByLastName(studentDAO);
//			updateStudent(studentDAO);
//			deleteStudent(studentDAO);
			deleteAllStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		// create the student object
		System.out.println("Creating new student object");
		Student student1 = new Student("Happy", "Patel", "Happypatel@ttu.edu");

		// save the student object
		System.out.println("Saving the student...");
		studentDAO.save(student1);

		// display id of the saved student
		System.out.println("Student saved with ID " + student1.getId());
	}

	private void readStudent(StudentDAO studentDAO) {
		// create a student object
//		Student student2 = new Student("One", "Piece" , "isreal@ttu.edu");

		// save the student
//		studentDAO.save(student2);

		// display id of student
//		System.out.println("Id " + student2.getId());
		// retrieve student based on id
		Student myStudent = studentDAO.findByID(1);

		// display student
		System.out.println(myStudent);
	}

	private void queryForStudents(StudentDAO studentDAO) {
		// get list of students
		List<Student> theStudents = studentDAO.findAll();

		// display list of students
		for(Student tempStudents : theStudents){
			System.out.println(tempStudents);
		}
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {
		// get list of students
		List<Student> theStudents = studentDAO.findByLastName("Patel");

		// display list of student
		for(Student tempStudents : theStudents){
			System.out.println(tempStudents);
		}
	}

	private void updateStudent(StudentDAO studentDAO) {
		// retrieve the student based on ID
		int stuID = 8;
		Student myStudent = studentDAO.findByID(8);
		System.out.println(myStudent);

		// change first name
		myStudent.setFirstName("WhiteBeard");

		// update object
		studentDAO.update(myStudent);

		// display updated student
		System.out.println(myStudent);
	}

	private void deleteStudent(StudentDAO studentDAO){
		studentDAO.delete(9);
	}

	private void deleteAllStudent(StudentDAO studentDAO) {
		int count = studentDAO.deleteAll();
		System.out.println("Deleted Count " + count);
	}


}
