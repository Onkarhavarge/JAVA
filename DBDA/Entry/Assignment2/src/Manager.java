
public class Manager extends Employee {

	protected float hra;
	
	public Manager(String name, String address, int age, char gender, float basicsal ,float hra)
	{
		super(name, address, age, gender, basicsal);
		this.hra=hra;
	}

	public void display()
	{
		super.display();
		System.out.println("Hra :"+this.hra);
	}
	public float getHra() {
		return hra;
	}

	public void setHra(float hra) {
		this.hra = hra;
	}
	

}
