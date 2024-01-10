import java.util.*;
public class Testpiggybank {
	
	static PiggyBank pb = new PiggyBank();
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		
		/*pb.setPiggyBank(500);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTwo (34);
		System.out.println("Add 2 Baht Money : " + 34);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTen (13);
		System.out.println("Add 10 Baht Money : " + 13);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addFive(100);*/
		inputCoin();
	}

	public static void inputCoin() 
	{
		System.out.println("Money Total : "+pb.getTotal());
		System.out.print("Please difine size of PiggyBank : ");
		int sizeofPiggybank = scan.nextInt();
	    pb.setPiggyBank(sizeofPiggybank);
	    System.out.println("Size of your PiggyBank : "+pb.getPiggybank());
	    System.out.println("");
	    MainMenu();
	}
	public static void MainMenu()
	{
		while(true)
		{
		Line();
		System.out.println("Menu of PiggyBank");
		Line();
		System.out.println("[1] one bath.");
		System.out.println("[2] two bath.");
		System.out.println("[3] five bath.");
		System.out.println("[4] ten bath.");
		System.out.println("[5] Exit bath.");
		Line();
		System.out.print("Please Select Menu[1-5] : ");
		int add = scan.nextInt();
		int insertBath;
		
		if(add == 1 ) 
		{
			System.out.print("Insert 1 Bath Money : ");
			insertBath = scan.nextInt();
			pb.addOne(insertBath);
			System.out.println("Money Total : "+pb.getTotal());
		}
		else if(add == 2 ) 
		{
			System.out.print("Insert 2 Bath Money : ");
			insertBath = scan.nextInt();
			pb.addTwo(insertBath);
			System.out.println("Money Total : "+pb.getTotal());
		}
		else if(add == 3 ) 
		{
			System.out.print("Insert 5 Bath Money : ");
			insertBath = scan.nextInt();
			pb.addFive(insertBath);
			System.out.println("Money Total : "+pb.getTotal());
		}
		else if(add == 4 ) 
		{
			System.out.print("Insert 10 Bath Money : ");
			insertBath = scan.nextInt();
			pb.addTen(insertBath);
			System.out.println("Money Total : "+pb.getTotal());
		}
		else
		{
			System.out.println("Bye Bye");
			break;
		}
	}
	}
	public static void Line()
	{
		System.out.println("================================");
	}
}
	
