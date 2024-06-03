import java.util.*;
class TwoD
{
 public static void main(String[] args)
 {
  int a[][] = new int[3][4] ;
  int i,j;
  Scanner s1 = new Scanner(System.in);
  System.out.println("Enter 2D Array elements");
  for(i=0;i<3;i++)
  {
   for(j=0;j<4;j++)
   {
    a[i][j] = s1.nextInt();
   }
  }
  System.out.println("Array Elements :");
  for(i=0;i<3;i++)
  {
   for(j=0;j<4;j++)
   {
    System.out.println(a[i][j]);
   }
  }
 }
}