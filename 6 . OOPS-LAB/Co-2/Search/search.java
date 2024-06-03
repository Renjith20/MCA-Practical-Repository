import java.util.Scanner;
class search{
    public static void main(String [] args)
    {
        int i,j,x=0;
        boolean state=false;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of elements in array: ");
        int num=s.nextInt();

        String word[] = new String[num];
        for(i=0;i<num;i++){
            System.out.println("Enter the element :");
            word[i]=s.next();
        }

        System.out.println("Enter the element to be searched: ");
        String search=s.next();
        for(i=0;i<num;i++){
            if(word[i].equals(search)){
                x=i+1;
                state=true;
            }
        }
        if(state){
            System.out.println("Element found at position ="+x);
        }else{
            System.out.println("Element not found");
        }
    }
}
