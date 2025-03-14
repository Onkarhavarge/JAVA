
public class Engineer extends Employee {

	float overtime;
	
	public Engineer(String name, String address, int age, char gender, float basicsal,float overtime) {
		super(name, address, age, gender, basicsal);
		this.overtime=overtime;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Hra :"+this.overtime);
	}

	public float getOvertime() {
		return overtime;
	}

	public void setOvertime(float overtime) {
		this.overtime = overtime;
	}

	
	
	
}
