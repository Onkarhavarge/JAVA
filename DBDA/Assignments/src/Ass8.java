
public class Ass8 {

	public static void main(String[] args) {
		System.out.println("Enter the array length :");
		int no = ConsoleInput.getInteger();
		int arr[] = new int[no];
		int arr1[]=new int[no];

		System.out.println("Enter Array elements :");
		for(int temp=0;temp<no;temp++)
		{
			int elem = ConsoleInput.getInteger();
			arr[temp] = elem;
			
		}
//		System.arraycopy(arr, 0, arr1, arr.length-1,arr[0] );
//		System.out.println("Arr1 :"+arr1);
		for(int temp1=0;temp1<no;temp1++)
		{
			arr1[temp1]=arr[arr.length-1-temp1];
		}
		for(int temp1=0;temp1<no;temp1++) {
			System.out.println("arr :"+arr1[temp1]);
		}
	}

}
