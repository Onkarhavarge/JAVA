import java.util.Scanner;

public class Employee1 {
	
	int sal;
	int hrs;
	
	
	
	void get_info(int sal1,int hrs1)
	{
		this.sal=sal1;
		this.hrs=hrs1;
	}
	void add_sal()
	{
		if (sal <= 500)
		{
			sal+=10;
		}
	}
	
	void add_work()
	{
		if(hrs > 6)
		{
			sal+=50;
		}
	}
	
	void display()
	{
		System.out.println("Sal is :"+sal);
		System.out.println("no of hrs:"+hrs);
	}
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter Sal :");
		int sal = scanner.nextInt() ;
		System.out.println("enter hrs :");
		int hrs = scanner.nextInt() ;
		
		Employee1 emp =new Employee1();
		
		emp.get_info(sal, hrs);
		emp.add_work();
		
		emp.add_sal();
		emp.display();
		
		scanner.close();
	}

}
