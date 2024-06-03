import java.util.*;
class Employee{
	int empid;
	String name;
	double salary;
	String address;
	Employee()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter employee   id:");
		empid= s.nextInt();

		System.out.println("enter employee  name:");
		name= s.next();

		System.out.println("enter employee  salary:");
		salary= s.nextDouble();

		System.out.println("enter employee  address:");
		address= s.next();
	}
}
class Teacher extends Employee
{
	String department;
	String subject;
	Teacher()
	{
		Scanner sc3=new Scanner(System.in);
		System.out.println("enter  department:");
		department= sc3.next();

		System.out.println("enter  subject:");
		subject= sc3.next();
	}
	void display()
	{
		
		System.out.println("id:" +empid);
		System.out.println("NAME :" +name);
		System.out.println("SALARY :" +salary);
		System.out.println("ADDRESS :" +address);
		System.out.println("DEPARTMENT:" +department);
		System.out.println("SUBJECT :" +subject);
		System.out.println("...............................");
	}

}
class multilevelInheritance
{
	public static void main(String args[])
	{
		int n;
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter number of employees:");
		n=sc1.nextInt();
		Teacher t[]= new Teacher[n];
		for(int i=0;i<n;i++)
		{
			t[i]=new Teacher();

		}
		
		System.out.println("\nTHE DETAILS ARE...:");
		System.out.println("...............................");

		for(int i=0;i<n;i++)
		{
	
			t[i].display();
		}
	}  
}
