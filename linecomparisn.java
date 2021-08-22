package linecomparisn;

import java.util.Scanner;

public class linecomparisn {
   private int x2;
private int x1;
private int y1;
private int y2;


public  linecomparisn(int x1,int x2,int y1,int y2)
   {

		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
   }
		public double computelength()
		{
			double lengthline;
			
			lengthline =Math.sqrt((Math.pow((x2-x1), 2))+(Math.pow((y2-y1), 2)));
			return lengthline;
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to line comparison");
		 linecomparisn l1=new  linecomparisn(1,3,4,5);
		 linecomparisn l2=new  linecomparisn(1,3,4,7);
		 double length;
		 length=l1.computelength();
		 Double lengthline1=new Double(length);
			System.out.println("Length of line 1 is"+length);
		 length=l2.computelength();
		 Double lengthline2=new Double(length);
		 System.out.println("Length of line 2 is"+length);
		 if(lengthline1.equals(lengthline2))
		 {
			 System.out.println("Length of line 1 and line 2 is equal");
		 }
		 else {
			 System.out.println("Length of line 1 and line 2 is not equal!!!");
		 }
		 if(lengthline1.compareTo(lengthline2)<0)
		 {
			 System.out.println("line 1 is smaller than line 2");
		 }
		 else if(lengthline1.compareTo(lengthline2)>0)
		 {
			 System.out.println("line 2 is smaller than line 1");
		 }
		 
		 
		



	}
	private static boolean equals() {
		// TODO Auto-generated method stub
		return false;
	}

}
