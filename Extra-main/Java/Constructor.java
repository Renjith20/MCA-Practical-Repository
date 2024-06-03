import java.util.*;
class Rectangle
{
 int length;
 int breadth;
 void Rectangle()
 {
  length = 5;
  breadth = 4;
 }
 void Rectangle(int x , int y)
 { 
  length = x;
  breadth = y;
 }
 void 
getdata()
 {
  Scanner s = new Scanner(System.in);
  System.out.println("Enter the length");
  length = s.nextInt();
  System.out.println("Enter the breadth");
  breadth = s.nextInt();
 }
 callArea(int x , int y)
 {
  Area = length * breadth;
  System.out.println("Area:" + Area);
 }

 class Constructor
 {
  public static void main(String[] args)
  {
    
  