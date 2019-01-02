package java_keyword;

public class Human extends Animal {
	private String gender;
	
	public Human(String name, int age, String gender) {
		super(name, age);     //instantiate using super class constructor 
		this.gender = gender; //instantiate it in here 
	}
	
	public String getGender() {
		return gender;
	}
	public void think()
	{
		System.out.println("Can think");
	}
	
		
}
