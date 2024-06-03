import java.util.*;
class pattern
{
 public static void main(String[] args)
 { 
  int i , j ,limit;
  Scanner s = new Scanner(System.in);
  System.out.println("Enter the limit");
  limit = s.nextInt();
  for(i = 1 ; i <= limit ; i++)
  {
   for(j = 1 ;j <= i ; j++)
   {
    System.out.print("* ");
   }
   System.out.print("\n");
  }
  for(i = limit ; i >= 1 ; i--)
  {
   for(j = i  ;j >= 1 ; j--)
   {
    System.out.print("* ");
   }
   System.out.print("\n");
  }
 }
}