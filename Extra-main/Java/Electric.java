import java.util.*;
class Electric
{
 public static void main(String[] args)
 {
  System.out.println("Enter the units used");
  Scanner sc = new Scanner(System.in);
  int unit = sc.nextInt();
  int cost , temp;
  if(unit <= 50)
  {
   cost = unit * 6 ;
   System.out.println("Cost = " + cost);
  }
  else if( unit > 50 && unit <= 100)
  {
   temp = unit - 50;
   cost = (50*6) + (temp*7);
   System.out.println("Cost =" + cost);
  }
  else if(unit > 100 && unit <= 300)
  {
   temp = unit - 100;
   cost = (50*6) + (50*7) +(temp*8);
   System.out.println("Cost =" + cost);
  }
  else
  {
   temp = unit - 300;
   cost = (50*6) + (50*7) + (200*8) + (temp*10);
   System.out.println("Cost = " + cost);
  }
 }
}
  
   