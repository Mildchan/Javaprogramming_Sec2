import java.util.Scanner;

public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X,Y,Z; //ประกาศตัวแปร
		
		System.out.print("Input number X : ");
		X = scan.nextInt();
		System.out.print("Input number Y : ");
		Y = scan.nextInt();
		
        while(X>Y) 
			{
				System.out.print("Input number Y, again : ");
				Y = scan.nextInt();
				break;
            }
		Z=X;
		System.out.println();
	    while (X<Y) 
	    {
	    	int sum = Z+X+1;
            System.out.println(" "+Z+" + "+(X+1)+" = "+sum);
	    	Z=sum;
	    	X++;
	    }
	    
	}



}
