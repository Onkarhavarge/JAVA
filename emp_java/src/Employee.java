
public abstract class Employee {

	protected String name;
	protected String address;
	protected int age;
	protected String gender;
	protected float basicSalary;

	// Employee ARRAY will be created here

	public Employee(String name, String address, int age, String gender, float basicSalary) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.gender = gender;
		this.basicSalary = basicSalary;
	}

	public void displayDetails() {
		System.out.println("Employee name         : " + this.getName());
		System.out.println("Employee address      : " + this.getAddress());
		System.out.println("Employee age          : " + this.getAge());
		System.out.println("Employee gender       : " + this.getGender());
		System.out.println("Employee basic salary : " + this.getBasicSalary());
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public float getBasicSalary() {
		return basicSalary;
	}


	  @Override 
	  public String toString() { 
		  return "\nEmployee Details\n----------------\nName = " + name +
	  "\nAddress = " + address + "\nAge = " + age + "\nGender = " + gender +
	  "\nBasic Salary = " + basicSalary + "\n----------------\n"; 
		  }
	  
	 
}

/*
 * *****************************************************************************
 * *************** public abstract class Employee {
 * 
 * protected String name; protected String address; protected int age; protected
 * String gender; protected float basicSalary;
 * 
 * //Employee ARRAY will be created here
 * 
 * public Employee(String name, String address, int age, String gender, float
 * basicSalary) { this.name = name; this.address = address; this.age = age;
 * this.gender = gender; this.basicSalary = basicSalary; }
 * 
 * 
 * public void displayDetails() {
 * System.out.println("Employee name         : "+this.getName());
 * System.out.println("Employee address      : "+this.getAddress());
 * System.out.println("Employee age          : "+this.getAge());
 * System.out.println("Employee gender       : "+this.getGender());
 * System.out.println("Employee basic salary : "+this.getBasicSalary()); }
 * 
 * 
 * public String getName() { return name; }
 * 
 * public String getAddress() { return address; }
 * 
 * public int getAge() { return age; }
 * 
 * public String getGender() { return gender; }
 * 
 * public float getBasicSalary() { return basicSalary; } }
 */