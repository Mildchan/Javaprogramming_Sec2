import java.text.*;
import javax.swing.JOptionPane;

public class Example4 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		String productName;
		productName = JOptionPane.showInputDialog("Input product Name:");
		int productUnit = Integer.parseInt(JOptionPane.showInputDialog("Input Product Unit"));
	    float productPerUnit = Float.parseFloat(JOptionPane.showInputDialog("Input Product Unit"));
	    
	    double totalPrice = productUnit * productPerUnit ;
		double VatPrice = (totalPrice*0.07)+totalPrice ;
		
		JOptionPane.showMessageDialog(null,"Total Price is "+frm.format(totalPrice)+" baht."+""
				+ "\nAdd VAT 7%  is "+frm.format(VatPrice)+" baht.");
	}

}
