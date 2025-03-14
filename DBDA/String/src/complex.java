
public class complex {

	int no1;
	int no2;
//	
//	complex(int no1 , int no2)
//	{
//		this.no1=no1;
//		this.no2=no2;
//		
//	}
     
	 void sum(int no1,int no2){
		int sum = no1+no2;
		System.out.println("sum is : " +sum);
	}
	
	  
	  public static void main(String[] args) {
		
		  complex cmp = new complex();
		  
		  cmp.sum(4,8);
		

	}

}
