package assignment2;

public class Trainer {
	
	//Instance Variables
	String name;
	String department;
	String email;
	String Subject;
	
	// Use of Constructor
	public Trainer(String nam, String dept, String eml, String sub) {
		name = nam;
		department = dept;
		email = eml;
		Subject = sub;
	}
	
	public static void main(String[] args) {
		Trainer obj1 = new Trainer("Mukesh" ,"Testing","mukesh@gmail.com", "Selenium");
		obj1.displayLoginInfo();
		
		Trainer obj2 = new Trainer("Hitesh","Dev","mukesh@gmail.com","Web Development");
		obj2.displayLoginInfo();
		
		Trainer obj3 = new Trainer("Mukesh","DevOps","mukesh@gmail.com","DevOps");
		obj3.displayLoginInfo();
		
		System.out.println(obj1.Subject);
		System.out.println(obj2.Subject);
		System.out.println(obj3.Subject);

	}
	
	public void displayLoginInfo() {
		System.out.println("Employee Name is "+name);
		
		System.out.println("Department is "+department);
		
		System.out.println("Email ID is "+email);
		
		System.out.println("Teaches "+Subject);
		
		System.out.println("********************************");
	}

}
