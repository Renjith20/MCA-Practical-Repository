import java.util.*;
class Switch
{
 public static void main(String[] args)
 {
  System.out.println("Enter your choice:");
  Scanner s = new Scanner(System.in);
  int choice = s.nextInt();
  switch(choice)
  {
   case 1:
         System.out.println("January");
   case 2:
         System.out.println("February");
   case 3:
         System.out.println("March");
   case 4:
         System.out.println("April");
   case 5:
         System.out.println("May");
   case 6:
         System.out.println("june");
   case 7:
         System.out.println("july");
   case 8:
         System.out.println("August");
   case 9:
         System.out.println("September");
   case 10:
         System.out.println("October");
   case 11:
         System.out.println("November");
   case 12:
         System.out.println("December");
   default:
         System.out.println("Invalid Choice");
  }
 }
}

 

   