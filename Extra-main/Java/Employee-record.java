public class  employee
{
 public int record_id;
 public String name;
 public String phonenumber;
 public String designation;
 public String department;
 
public employee(int r_id , String Name , String phn_no , String desig , String dept)
{
 record_id = r_id;
 name = Name;
 phonenumber = phn_no;
 designation = desig;
 department = dept;
}

public void printemp()
{
 System.out.println("RecordId : " +record_id);
 System.out.println("Name : " + name);
 System.out.println("Phone number : " +phonenumber);
 System.out.println("Designation : " + designation);
 System.out.println("Depatrment : " + department);
}

public static void main(String[] args)
{
 employee emp = new employee(101 , "Micheal" ,"9073215444", "Manager" , "SBI");
 emp.printemp();
}
}

