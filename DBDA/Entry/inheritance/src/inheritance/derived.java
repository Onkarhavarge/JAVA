package inheritance;

class derived extends base{
	
	
//	derived (float temp)
//	{
//		this.temp=temp;
//	}
//	{
//		this.no1=no1;
//		this.no2=no2;
//	}
//	
//	void pro(int no1,int no2)
//	{
//		int pro=no1 * no2;
//		System.out.println("Sum in derived:"+pro);
//	}
	
	void display()
	{	
		System.out.println("This is child class");
	}

	public static void main(String[] args)
	{
		base b1=new base();
		b1.Display();
		derived d1=new derived();
		d1.display();
		d1.Display();
	}
	

}
