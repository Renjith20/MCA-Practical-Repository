import java.util.*;
class Circle
{
 double area;
 Circle(double r)
 {
  area = 3.14 * r * r;
 }
 public static void main(String args[])
 {
   Scanner s = new Scanner(System.in);
   System.out.println("Enter the radius");
   double rad = s.nextDouble();
   Circle c = new Circle(rad);
   System.out.println("Area of Circle is:" + c.area);
 }
}
 
