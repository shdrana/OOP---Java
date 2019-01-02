package anonymous_inner_class;

import java.awt.List;
import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		PersonalData personalData = new PersonalData() {
			
			@Override
			public void getAge() {
				System.out.println("The age is: "+ x);
				
			}
		};
		
		personalData.getAge();
		
	}

}
