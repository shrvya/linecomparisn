package linecomparisn;

import java.util.Scanner;

public class linecomparisn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to line comparison");
		
		int x1,x2,y1,y2;//2 end points of line 1
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the values for line 1");
		x1=sc.nextInt();
		x2=sc.nextInt();
		y1=sc.nextInt();
		y2=sc.nextInt();
		double lengthline1;
		lengthline1 =Math.sqrt((Math.pow((x2-x1), 2))+(Math.pow((y2-y1), 2)));//find length of line
		System.out.println("lenth of line 1 is :"+lengthline1);

	}

}
