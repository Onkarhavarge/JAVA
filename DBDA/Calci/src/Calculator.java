
public class Calculator {

	public static void main(String[] args) 
	{
		int choice=0;
		
		do {
		System.out.println("1. Addition of two integer ");
		System.out.println("2. Addition of two Float ");
		System.out.println("3. Substract two integer ");
		System.out.println("4. Substract two Float ");
		System.out.println("5. Multiplication of two integer ");
		System.out.println("6. Multiplication of two integer ");
		System.out.println("7 . Divide two integer ");
		System.out.println("8. Divide two integer ");
		
		System.out.println("Enter your choice :");
		choice=ConsoleInput.getInteger();
		
		
		switch(choice)
		{
			case 1:
			{
				System.out.println("Enter the No1 :");
				int Firstnum = ConsoleInput.getInteger();
				System.out.println("Enter the no2 :");
				int Secondnum = ConsoleInput.getInteger();
				Calci objCalculator = new Calci();
				int result = objCalculator.add(Firstnum, Secondnum);
				System.out.println("Result is :"+result);
				break;
			}
			case 2:
			{
				System.out.println("Enter the No1:");
				float Firstnum = ConsoleInput.getFloat();
				System.out.println("Enter the No2:");
				float Secondnum = ConsoleInput.getFloat();
				Calci objCalculator = new Calci();
				float result = objCalculator.add(Firstnum, Secondnum);
				System.out.println("Result is :"+result);
				break;
			}
			case 3:
			{
				System.out.println("Enter the No1 :");
				int Firstnum = ConsoleInput.getInteger();
				System.out.println("Enter the no2 :");
				int Secondnum = ConsoleInput.getInteger();
				Calci objCalculator = new Calci();
				int result = objCalculator.Substract(Firstnum, Secondnum);
				System.out.println("Result is :"+result);
				break;
			}
			case 4:
			{
				System.out.println("Enter the No1:");
				float Firstnum = ConsoleInput.getFloat();
				System.out.println("Enter the No2:");
				float Secondnum = ConsoleInput.getFloat();
				Calci objCalculator = new Calci();
				float result = objCalculator.Substract(Firstnum, Secondnum);
				System.out.println("Result is :"+result);
				break;
			}
			case 5:
			{
				System.out.println("Enter the no1:");
				int Firstnum = ConsoleInput.getInteger();
				System.out.println("Enter the no2");
				int Secondnum = ConsoleInput.getInteger();
				Calci objcalci = new Calci();
				int result = objcalci.multiplication(Firstnum, Secondnum);
				System.out.println("Result is :"+result);
				break;
			}
			case 6:
			{
				System.out.println("Enter the no1:");
				float Firstnum = ConsoleInput.getFloat();
				System.out.println("Enter the no2");
				float Secondnum = ConsoleInput.getFloat();
				Calci objcalci = new Calci();
				float result = objcalci.multiplication(Firstnum, Secondnum);
				System.out.println("Result is :"+result);
				break;
			}
			case 7:
			{
				System.out.println("Enter the no1:");
				int Firstnum = ConsoleInput.getInteger();
				System.out.println("Enter the no2");
				int Secondnum = ConsoleInput.getInteger();
				Calci objcalci = new Calci();
				int result = objcalci.divide(Firstnum, Secondnum);
				System.out.println("Result is :"+result);
				break;
			}
			case 8:
			{
				System.out.println("Enter the no1:");
				float Firstnum = ConsoleInput.getFloat();
				System.out.println("Enter the no2");
				float Secondnum = ConsoleInput.getFloat();
				Calci objcalci = new Calci();
				float result = objcalci.divide(Firstnum, Secondnum);
				System.out.println("Result is :"+result);
				break;
			}
		}
		}while(choice!=9);
	 }
}

