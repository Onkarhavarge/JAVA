
public class Manager extends Employee {

		float hra;
		public Manager(String name, String address, int age, String gender, float basicSalary, float hra) {
			super(name, address, age, gender, basicSalary);
			this.hra = hra;		
		}
		
		
//		  @Override 
//		  public void displayDetails() { super.displayDetails();
//		  System.out.println("Employee HRA          : "+this.hra); }
//		 
		
		@Override 
		  public String toString() { 
			  return "\nName = " + name +
		  "\nAddress = " + address + "\nAge = " + age + "\nGender = " + gender +
		  "\nBasic Salary = " + basicSalary + "\nHRA = " + hra +"\n----------------\n"; 
			  }
}

/*
 * ****************************************************************************************************

public class Manager extends Employee {

float hra;
public Manager(String name, String address, int age, String gender, float basicSalary, float hra) {
	super(name, address, age, gender, basicSalary);
	this.hra = hra;		
}

@Override
public void displayDetails() {
	super.displayDetails();
	System.out.println("Employee HRA          : "+this.hra);
}
}
*/