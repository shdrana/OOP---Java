package two_polymarphism;

public class Human {
	
	private String name;
	
	private int age;
	
	public void setName(String Name) {
		name = Name;
	}
	
	public void setAge(int Age)
	{
		if(Age>0)
			age = Age;
		else
			System.out.println("Please input valid age");
	}
	
}
