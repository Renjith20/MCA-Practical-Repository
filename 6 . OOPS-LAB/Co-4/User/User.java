import java.util.*; 
public class User
{
	public static void main(String args[]){
		String username, password;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter username:");
		username = sc.nextLine();
		System.out.print("Enter password:");
		password = sc.nextLine();
		try{
			if(username.equals("admin") && password.equals("hello123")){
				System.out.println("Authentication Successful");
			}
			else{
				System.out.println("Authentication Failed");
			}
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}

