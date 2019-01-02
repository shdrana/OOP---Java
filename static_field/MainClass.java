package static_field;

public class MainClass {
	static int a = 235;

	public static void main(String[] args) {
	
		//Create object for student1
		Student student1 = new Student();
		
		//create object for student2
		Student student2 = new Student();
		//Setting university code 
		
		
		//add data for student1
		student1.age = 23;
		student1.name = "Rakib";
		student1.university_code = 100;
		
		
		//add data for student2
		student2.name = "Rigan";
		student2.age = 24;
		student2.university_code = 250;
		
		
		//Print data for student1
		System.out.println("Name: "+ student1.name+", Age: "+student1.age+ ", University Code: "+ student1.university_code);
		//Print data for student2
        System.out.println("Name: "+ student2.name+", Age: "+student2.age+ ", University Code: "+ student2.university_code);  
				
	}

}
