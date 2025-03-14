
public class Engineer extends Employee {

	float overtime;
	public Engineer(String name, String address, int age, String gender, float basicSalary, float overtime) {
		super(name, address, age, gender, basicSalary);
		this.overtime = overtime;
	}
	
//	@Override
//	public void displayDetails() {
//		super.displayDetails();
//		System.out.println("Employee overtime     : "+this.overtime);
//	}
	
	@Override 
	  public String toString() { 
		  return "\nName = " + name +
	  "\nAddress = " + address + "\nAge = " + age + "\nGender = " + gender +
	  "\nBasic Salary = " + basicSalary + "\nOvertime = " + overtime +"\n----------------\n"; 
		  }
}

/*
***********************************************************************************************************************
public class Engineer extends Employee {

	float overtime;
	public Engineer(String name, String address, int age, String gender, float basicSalary, float overtime) {
		super(name, address, age, gender, basicSalary);
		this.overtime = overtime;
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Employee overtime     : "+this.overtime);
	}
}
*/