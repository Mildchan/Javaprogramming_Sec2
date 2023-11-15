import java.text.*;
import java.util.*;
public class Example3 {

	public static void main(String[] args) {
		Scanner inPut = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		System.out.print("Input product name : ");
		String productName = inPut.nextLine();
		System.out.print("Input product unit : ");
		int productUnit = inPut.nextInt();
		System.out.print("Input product per unit : ");
		float productPerUnit = inPut.nextFloat();
		System.out.println("");
		
		double totalPrice = productUnit * productPerUnit ;
		double VatPrice = (totalPrice*0.07)+totalPrice ;
		System.out.println("Total Price is "+frm.format(totalPrice)+" baht.");
		System.out.println("Add VAT 7%  is "+frm.format(VatPrice)+" baht.");
		
		

	}

}
