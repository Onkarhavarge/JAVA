
public class triangle {
	
	int side1 ;
	int side2 ;
	int side3 ;
	int base;
	int height;
	
	triangle(int side1,int side2,int side3,int base,int height)
	{
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
		this.base=base;
		this.height=height;
	}
	
	
	void display()
	{
		float perimeter=this.side1 +this.side2+this.side3;
		System.out.println("perimeter:"+perimeter);
		
		float area=(base*height)/2;
		System.out.println("Area:"+area);
	}
	public static void main(String[] args) {
		
		triangle tri = new triangle(3,4,5,9,5);

		tri.display();
	}

}
