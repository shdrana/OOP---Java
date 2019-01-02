package association;

import java.awt.List;
import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		
		Student student1 = new Student("111", "Rakib", "CSE");
		Student student2 = new Student("222", "Sakib", "CSE");
		Student student3 = new Student("333", "Rigan", "CSE");
		Student student4 = new Student("444", "Sezan", "CSE");
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		
		Department cse_department = new Department("CSE", studentList);
		ArrayList<Student> allStudent = cse_department.getAllStudents();
		
		for(Student aStudent: allStudent) {
			System.out.println(aStudent.getStudentName()+" "+ aStudent.getStudentDept());
		}
		
		
		

	}

}
