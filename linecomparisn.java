package linecomparisn;

import java.util.Scanner;

public class linecomparisn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to line comparison");
		
		int x1,x2,y1,y2;//2 end points of line 1
		int p1,p2,q1,q2;//end points of line2
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the values for line 1");
		x1=sc.nextInt();
		x2=sc.nextInt();
		y1=sc.nextInt();
		y2=sc.nextInt();
		double lengthline1;
		lengthline1 =Math.sqrt((Math.pow((x2-x1), 2))+(Math.pow((y2-y1), 2)));//find length of line
		System.out.println("lenth of line 1 is :"+lengthline1);
		
		System.out.println("enter the values for line 2");
		p1=sc.nextInt();
		p2=sc.nextInt();
		q1=sc.nextInt();
		q2=sc.nextInt();
		double lengthline2;
		lengthline2 =Math.sqrt((Math.pow((p2-p1), 2))+(Math.pow((q2-q1), 2)));
		System.out.println("lenth of line 2 is :"+lengthline2);


		if(lengthline1==lengthline2)
		{
			System.out.println("lines are equal");
		}
		else if(lengthline1>lengthline2)
		{
			System.out.println("line 1 is larger than line2");
		}
		else {
			System.out.println("line 2 is larger than linel");
		}
		sc.close();



	}

}
