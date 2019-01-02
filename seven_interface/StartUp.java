package seven_interface;

public class StartUp {

	public static void main(String[] args) {
		Human human1 = new Human();
		human1.Walk();
		human1.Speak();
		
		Dog dog1 = new Dog();
		dog1.Walk();
		dog1.Speak();
	}

}	
