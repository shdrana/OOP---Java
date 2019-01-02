package nested_class;

public class OuterClass {
	public class InnerClass{
		public class Ins{
			public  void Print() {
				System.out.println("Inside inner clas");
			}
			public void Print(String message) {
				System.out.println(message);
			}
		}
	}
	
	
	
}
