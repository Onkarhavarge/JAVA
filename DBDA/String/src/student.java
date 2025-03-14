
public class student {
		String name ;
		int roll_no ;
		String phone_no ;
		String Address ;
	
		student(String name ,int roll_no, String phone_no,String Address){
			this.name=name;
			this.roll_no=roll_no;
			this.phone_no=phone_no;
			this.Address=Address;
		}
		
		void display()
		{
			System.out.println("name :"+name);
			System.out.println("roll_no :"+roll_no);
			System.out.println("phone_no :"+phone_no);
			System.out.println("Address :"+Address);
		}
	public static void main(String[] args) {
		
		student str = new student("john",2,"456987123","pune") ;
		
		student str2= new student("don",3,"9089796865","PUNE");
		str.display();
		str2.display();
		
		

	}

}
