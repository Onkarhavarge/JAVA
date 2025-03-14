
public class Ass2 {
		public static void main(String args[])
		{
			System.out.println("Enter the No of integer values to add :");
			int No=ConsoleInput.getInteger();
			int sum=0;
			System.out.println("Enter your numbers :");
			for (int temp=0;temp<No;temp++)
			{
				int elem=ConsoleInput.getInteger();	
				sum=sum+elem;
			}
			System.out.println("Sum of entered no is :"+sum);
			
		 }
		
}
