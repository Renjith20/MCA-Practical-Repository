import java.util.*;
class Multi
{
 public static void main(String[] args) 
{     
       int num;
       System.out.println("Enter a number");
       Scanner s = new Scanner(System.in);
       num = s.nextInt();
       for(int i = 1; i <= 12;i++)
        {
            System.out.printf("%d * %d = %d \n" ,i,num,num * i);
        }
    }
}
