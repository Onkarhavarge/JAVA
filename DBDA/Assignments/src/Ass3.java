
public class Ass3 {
	
	public static void main(String[] args) {
		int count=0;
		
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<5;j++)
			{
				for(int k=1;k<5;k++)
				{
					if(i!=j && i!=k && j!=k)
					{
						int no1= i * 100;
						int no2= j *10;
						int no3= k;
						int temp= no1 + no2 + no3;
						count++;
						System.out.println("No is :"+temp);
					}
				}
			}
		}
		System.out.println("count is :"+count);
	}

}
