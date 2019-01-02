package eight_super;

public class Animal {
	public String name;
	public int age;
	
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void Walk()
	{
		System.out.println(name+ " Can Walk");
		
	}
	
	public void Call()
	{
		System.out.println(name+ " Can call");
	}	
	
	public void think() {
		System.out.println("Think inside Parent");
	}
	
	
}
