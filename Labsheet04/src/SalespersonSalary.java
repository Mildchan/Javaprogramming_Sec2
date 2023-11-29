import java.util.*;
import java.text.*;
public class SalespersonSalary {

	public static void main(String[] args) {
		// Declare constants
		 DecimalFormat frm = new DecimalFormat("$#,###.00");
		 final double COMMISSION_RATE = 0.15;
		 final int SENTINEL = -1; // Terminating value for input
		 // Declare variables
		 int sales; // Input gross sales
		 double salary; // Salary to be computed
		 Scanner scan = new Scanner(System.in);
		 
		 while(true) 
		    {
		    	System.out.print("Enter sales in dollars (or -1 to end): ");
		    	sales = scan.nextInt();
                
		    	
		    	if(sales==SENTINEL) 
				{
					System.out.print("bye");
					break;
				}
		    	salary=sales*COMMISSION_RATE+1000;
				System.out.print("Salaly is: "+frm.format(salary)+"\n");
		    }
		 
		    


	}

}
