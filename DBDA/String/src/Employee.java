
public class Employee {
        String name;
        int yearofjoining;
        float salary;
        String adress;
        
        Employee(String n, int y, float s, String a)
        {
        	name=n;
        	yearofjoining=y;
        	salary=s;
        	adress=a;
        }
        
        void show() {
        System.out.println(name + "\t\t" + yearofjoining + "\t\t" + salary + "\t\t" + adress );
        }
        
	public static void main(String[] args) {
		
		System.out.println("Name\tYears of joining\t salary\t\t\t Adress");
		
		Employee emp1 = new Employee("Robert",1994,1000000,"64C-Wallstreet");
		Employee emp2 = new Employee("Sam",2000,6400000,"68D-Wallstreet");
		Employee emp3 = new Employee("John",1999,9000000,"26B-Wallstreet");
		emp1.show();
		emp2.show();
		emp3.show();
	
	}

}
