import java.io.*;
import java.util.*;
class Shape{
	void Area(int len, int wid){
		System.out.print("Area of Rectangle "+ len*wid +"\n");
	}
	void Area(float rad){
		System.out.print("Area of Circle "+ 3.14*rad*rad +"\n");
	}
	void Area(double a,double b,double c){
		if((a+b)>c && (a+c)>b && (b+c)>a)
                {
			double temp=(a+b+c);
			double s=temp/2;
			double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
			System.out.print("Area of Triangle "+ area +"\n");
		}
         	else  
           		System.out.println("Area of Triangle not exit");
	}

  public static void main(String args[]) throws IOException {
	Scanner s=new Scanner(System.in);
	Shape obj=new Shape();

	System.out.print("\nFind the area of \n1.Rectangle \n2.Circle \n3.Triangle \nEnter your option: ");
	int ch=s.nextInt();

	switch(ch){
		case 1:
			System.out.print("Enter the lenght: ");
			int l=s.nextInt();
			System.out.print("Enter the width: ");
			int w=s.nextInt();
			obj.Area(l,w);
			break;
		case 2:
			System.out.print("Enter the radius: ");
			float r=s.nextFloat();
			obj.Area(r);
			break;
		case 3:
			System.out.print("Enter the lenght of first side: ");
			double a=s.nextInt();
			System.out.print("Enter the lenght of second side: ");
			double b=s.nextInt();	
			System.out.print("Enter the lenght of third side: ");
			double c=s.nextDouble();
			obj.Area(a,b,c);
			break;
		default:
			System.out.println("Invalid Choice");
	}
}
}


		
