package association;

public class Student {
	private String studentId;  
    private String studentName;  
    private String studentDept;  
    
    public Student(String studentId, String studentName, String studentDept) {  
         this.studentId= studentId;  
         this.studentName= studentName;  
         this.studentDept= studentDept;  
    }

	public String getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getStudentDept() {
		return studentDept;
	}



}
