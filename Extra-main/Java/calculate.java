import java.util.*;
class Calculator
{
 public static void main(String[] args)
 {
  int num1 ,num2 ,res,ch;
  Scanner s = new Scanner(System.in);
  System.out.println("Enter Two Numbers");
  num1 = s.nextInt();
  num2 = s.nextInt();
  System.out.println("1.Addition");
  System.out.println("2.Subtraction");
  System.out.println("3.Multiplication");
  System.out.println("4.Division");
  System.out.println("Enter your choice:");
  ch = s.nextInt();
  switch(ch)
  {
   case 1:
          res = num1 + num2 ;
          System.out.println("Sum = " + res);
          break;
   case 2:
          res = num1 - num2 ; 
          System.out.println("Result = " + res);
          break;
   case 3: 
           res = num1 * num2 ;
           System.out.println("Result =" + res);
           break;
   case 4:  
           res = num1 /num2;
           System.out.println("Result =" + res);
           break;
   default : System.out.println("Invalid");
             break;
  }
 }
}
