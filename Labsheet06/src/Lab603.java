import java.util.*;

public class Lab603 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name, separated by a space.\n: ");
		String fullname = scan.nextLine();
		int  result = fullname.indexOf(' ');
		String firstname = fullname.substring(0,result);
		 System.out.print(abbreviatName(fullname).toUpperCase()+firstname);

	}
	public static String abbreviatName(String fullname) 
	{
		
		String Full="";
		for(int i=0;i<fullname.length();i++) 
		{
		  if(fullname.charAt(i)==' ')
		   {
			Full = Full+fullname.charAt(i+1)+".";
           }
		}
        return Full;
    }
}
	
	

	
	
