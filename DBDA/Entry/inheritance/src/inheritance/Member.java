package inheritance;

import java.util.Scanner;

public class Member {
	String name;
	int age;
	String phone_no;
	String Add;
	int sal;
	
	
	Member(String name,int age,String Phone_no,String Add,int sal)
	{
		this.name=name;
		this.age=age;
		this.phone_no= Phone_no;
		this.Add=Add;
		this.sal=sal;
	}

	void Display()
	{
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Phone_no :"+phone_no);
		System.out.println("Address :"+Add);
		System.out.println("Salary :"+sal);
		
	}
	
//	
//	public String toString() {
//		return "Member [name=" + name + ", age=" + age + ", phone_no=" + phone_no + ", Add=" + Add + ", sal=" + sal
//				+ "]";
//	}

	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter name :");
		String name = scanner.next() ;
		
		System.out.println("enter age :");
		int age = scanner.nextInt();
		
		System.out.println("enter phone_no :");
		String phone_no = scanner.next() ;
		
		System.out.println("enter Address :");
		String Add = scanner.next() ;
		
		System.out.println("enter Salary :");
		int sal = scanner.nextInt() ;
		
		Member mem1=new Member(name,age,phone_no,Add,sal);
		mem1.Display();
	}
	
	
	

}
