package Graphics;
import java.io.*;
import java.util.*;
public class Rectangle1{
	int l,b;
	Scanner s=new Scanner(System.in);
	public void getdata(){
		System.out.println("Enter length and breadth");
		l=s.nextInt();
		b=s.nextInt();
	}
	public void area(){
		System.out.println("Area of rectangle :" +(l*b));
	}
}
