
public class Entry {

	public static void main(String[] args) 
	{
		System.out.println("Enter the float value:");
		int Firstnum = ConsoleInput.getInteger();
		System.out.println("Enter the float value:");
		int Secondnum = ConsoleInput.getInteger();
		Calculator objCalculator = new Calculator();
		int result = objCalculator.add(Firstnum, Secondnum);
		System.out.println("Result is :"+result);
		
		System.out.println("Enter the float value:");
		float Firstnum1 = ConsoleInput.getFloat();
		System.out.println("Enter the float value:");
		float Secondnum2 = ConsoleInput.getFloat();
		Calculator objCalculator1 = new Calculator();
		float result1 = objCalculator.add(Firstnum, Secondnum);
		System.out.println("Result is :"+result1);
	}

}
