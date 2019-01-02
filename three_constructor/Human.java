package three_constructor;

public class Human {
	
	private String name;
	
	private int age;
	
	public Human(String name, int age) {
		this.name = name;
		
		if(age>0)
			this.age = age;
		else
			System.out.println("Enter valid age");
	}
	
	public int getAge()
	{
		return age;
	}
	
	
	
}
