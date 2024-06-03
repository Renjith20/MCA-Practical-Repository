public class cpu
{
 int price;
 class processor
 {
  int cores;
  String producer;
  processor(int noC, String menu)
  {
   cores  = noC;
   producer = menu;
  }
  void display()
  {
   System.out.println("\nProccessor info");
   System.out.println("\nNo.of cores = "+ cores);
   System.out.println("\nManufacturer = "+producer+"\n");
  }
 }
 static class ram
 {
  int mem;
  String manuf;
  ram(int memory , String producer)
  {
   mem = memory;
   manuf = producer;
  }
  void display()
  {
   System.out.println("\nRAM info");
   System.out.println("\nmemory = "+ mem + "GB");
   System.out.println("\nManufacturer = "+manuf+"\n");
  }
 }
 public static void main(String [] args)
 {
  cpu.ram obj1 = new cpu.ram(8,"intel");
  cpu obj2 = new cpu();
  cpu.processor obj3 =obj2.new processor(8,"samsung");
  obj1.display();
  obj3.display();
 }
}

