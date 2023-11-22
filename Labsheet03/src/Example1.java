import java.text.*;
import javax.swing.JOptionPane;

public class Example1 {

	public static void main(String[] args) {
		
		final int PriceBuffe = 299;
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
        int manyCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill?:"));
		
		int totalPrice = manyCustomer * PriceBuffe ;
		int Membercard;
		
        do {
              Membercard = JOptionPane.showConfirmDialog(null,"Total Price is "+frm.format(totalPrice)+" baht."+""
    				+ "\nDo you have a member card?","Select an Option",JOptionPane.YES_NO_CANCEL_OPTION);
        }while(Membercard == JOptionPane.CANCEL_OPTION);
        
	    if(Membercard == JOptionPane.YES_OPTION) 
	    {
	    	double Pricemember = totalPrice-(totalPrice*10/100);
	    	JOptionPane.showMessageDialog(null,"Amount to be paid is "+frm.format(Pricemember)+" baht. ");
	    }
	    else if(Membercard == JOptionPane.NO_OPTION) 
	    {
            JOptionPane.showMessageDialog(null,"Amount to be paid is "+frm.format(totalPrice)+" baht. ");
	    }
}

}
