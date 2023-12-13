import java.util.Scanner;

public class Lab501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("Full Name: ");
		String fullname = scan.nextLine();
        int  result = fullname.indexOf(' ');
		
		
		if(result == -1)
		{
			System.out.print("Incorrect Name");
		}
		else {
			String firstname = fullname.substring(0,result);
			String lastname = fullname.substring(result+1);
			System.out.println("First Name: "+firstname.toUpperCase());
			System.out.println("Last Name: "+lastname.toLowerCase());
		}
	}
}

	
	


