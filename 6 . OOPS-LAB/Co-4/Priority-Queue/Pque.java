import java.util.*;
class Pque{
public static void main(String args[]){
PriorityQueue<String>  city=new PriorityQueue<String>();

city.add("Mumbai");
city.add("Bengaluru");
city.add("Kolkata");
city.add("Chennai");
city.add("pune");

System.out.println("PriorityQueue Head:"+city.element());

System.out.println("\nPriorityQueue elements:");
Iterator iter=city.iterator();
while(iter.hasNext()){
System.out.print(iter.next() + " ");
}
}
}
