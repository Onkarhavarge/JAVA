
public class Ass9 {

	public static void main(String[] args) {

//		boolean flag = true;

		while(true){
			System.out.println("\n1 . Addition");
			System.out.println("2 . Substract");
			System.out.println("3 . multiplication");
			System.out.println("4 . division");
			System.out.println("5 . Square");
			System.out.println("6. Cube");
			System.out.println("7. Exit");

			System.out.println("\nEnter choice :");
			int choice = ConsoleInput.getInteger();

			int no2 = 0;
			int no1 = 0;
			if(choice!= 7) 
			{
			
			System.out.println("Enter no1: ");
			 no1 = ConsoleInput.getInteger();

			System.out.println("Enter no2: ");
			no2 = ConsoleInput.getInteger();
			}

			switch (choice) {
			case 1: {
				int Add = no1 + no2;
				System.out.println("Addition of two no is :" + Add);
			}
				break;
			case 2: {
				int Substraction = no1 - no2;
				System.out.println("Addition of two no is :" + Substraction);
			}
				break;
			case 3: {
				int Multiplication = no1 * no2;
				System.out.println("Addition of two no is :" + Multiplication);
			}
				break;
			case 4: {
				if (no2 == 0) {
					System.out.println("Can not divide by zero");
				}
				else {
					int Divide = no1 / no2;
					System.out.println("Addition of two no is :" + Divide);
				}
			}
				break;
			case 5: {
				System.out.println("Enter no to square : ");
				int no = ConsoleInput.getInteger();

				int Square = no * no;
				System.out.println("Addition of two no is :" + Square);
			}
				break;
			case 6: {
				System.out.println("Enter no to Cube : ");
				int no = ConsoleInput.getInteger();

				int Cube = no * no * no;
				System.out.println("Addition of two no is :" + Cube);
			}
				break;
			case 7: {
				System.out.println("Exit ......");
				return;
			}

			}

		} 

	}

}
