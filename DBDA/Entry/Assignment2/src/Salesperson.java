
public class Salesperson extends Employee {
	protected float commision;

	public Salesperson(String name, String address, int age, char gender, float basicsal,float commision) {
		super(name, address, age, gender, basicsal);
		this.commision=commision;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Hra :"+this.commision);
	}

	public float getCommision() {
		return commision;
	}

	public void setCommision(float commision) {
		this.commision = commision;
	}

	public Salesperson(String name, String address, int age, char gender, float basicsal) {
		super(name, address, age, gender, basicsal);
		// TODO Auto-generated constructor stub
	}



	

	
}
