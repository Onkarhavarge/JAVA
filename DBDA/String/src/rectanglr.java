 public class rectanglr{
	 
	 int side1;
	 int side2;
	 float sidea;
	 float sideb;
	 
	 rectanglr (int side1, int side2 ,int sidea,int sideb)
	 {
		 this.side1=side1;
		 this.side2=side2;
		 this.sidea=sidea;
		 this.sideb=sideb;
		
	 }
	  
//	 rectanglr (float sidea, float sideb)
//	 {
//		 this.sidea=sidea;
//		 this.sideb=sideb;
//	 }
	 void area()
	 {
		 float area1=side1*side2;
		     System.out.println("area of 1st rectangle : " + area1);
		 float area2=sidea*sideb;
		 System.out.println("area of 2st rectangle : " + area2);
	 }
	 
	public static void main(String[] args) {
		   rectanglr rect1 = new rectanglr(6,7,8,8);
		  // rectanglr rect2 = new rectanglr(15,10);
		   rect1.area();
		  // rect2.area();

	}

}
