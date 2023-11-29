import java.util.*;

public class Example1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int CurrentNumber,PreviousNumber; //ประกาศตัวแปร
		
		System.out.print("Input number : ");
		PreviousNumber = scan.nextInt();
		
	    while(true) 
	    {
	    	System.out.print("Input number : ");
			CurrentNumber = scan.nextInt();
			
			if(CurrentNumber<PreviousNumber) 
			{
				break;
			}
			
			PreviousNumber=CurrentNumber;
	    }
	    System.out.println();
	    System.out.print("BYE BYE");
}

}
