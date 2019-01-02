package association;

import java.awt.List;
import java.util.ArrayList;

public class Department {
	
	 private String departmentName;  
     private ArrayList<Student> studentList;  
     public Department(String departmentName, ArrayList<Student> studentList) {  
          this.departmentName = departmentName ;  
          this.studentList = studentList;  
     }  
     public ArrayList<Student> getAllStudents() {  
          return studentList;  
     }  
	

}
