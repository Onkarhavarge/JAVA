
public class SalesPerson extends Employee {

	float commission;
	public SalesPerson(String name, String address, int age, String gender, float basicSalary, float commission) {
		super(name, address, age, gender, basicSalary);
		this.commission = commission;
	}
	
//	@Override
//	public void displayDetails() {
//		super.displayDetails();
//		System.out.println("Employee commission   : "+this.commission);
//	}
	
	@Override 
	  public String toString() { 
		  return "\nName = " + name +
	  "\nAddress = " + address + "\nAge = " + age + "\nGender = " + gender +
	  "\nBasic Salary = " + basicSalary + "\nCommission = " + commission +"\n----------------\n"; 
		  }
}


/*
 *************************************************************************************************************** 
 
public class SalesPerson extends Employee {

float commission;
public SalesPerson(String name, String address, int age, String gender, float basicSalary, float commission) {
	super(name, address, age, gender, basicSalary);
	this.commission = commission;
}

@Override
public void displayDetails() {
	super.displayDetails();
	System.out.println("Employee commission   : "+this.commission);
}
}
*/