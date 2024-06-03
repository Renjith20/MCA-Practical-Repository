import java.util.*;
class Array
{
 public static void main(String[] args)
 {
  int a[] = new int[5] ;
  int i;
  Scanner s = new Scanner(System.in);
  for(i = 0; i<5 ;i++)
  {
     System.out.println("Enter Element"+ i+1);
     a[i] = s.nextInt();
  }
  System.out.println("Array Elements :");
  for(i=0 ; i<5 ; i++)
  {
   System.out.println(a[i]);
  }
 }
}  