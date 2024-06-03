class product
{
 int product_id;
 String name;
 product(int x , String y)
 {
  product_id = x;
  name = y;
 }
}
class customer extends product
{
 String Cname;
 String address;
 customer(String a , String b)
 {
  Cname = a;
  address = b;
 }
}
display()
{
 System.out.println("Product Id :" +product_id);
 System.out.println("Product name :" +name);
 System.out.println("Customer name :" +Cname);
 System.out.println("Address :" +address);
}
class SingleInherit
{
 public static void main(String[] args)
 {
  product c = new product(101 , "Car");
  c.customer("Ram" , "Abc");
  c.display();
 }
}
 