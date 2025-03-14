
public class Ass4 {

	public static void main(String[] args) {
		System.out.println("Enter First No :");
		int No1=ConsoleInput.getInteger();
		
		System.out.println("Enter Second No :");
		int No2=ConsoleInput.getInteger();

		System.out.println("Enter Third No :");
		int No3=ConsoleInput.getInteger();
		
		if (No2 > No1 && No3 > No2)
			System.out.println("True");
		else
			System.out.println("False");
	}

}
