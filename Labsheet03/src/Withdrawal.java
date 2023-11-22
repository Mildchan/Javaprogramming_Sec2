import java.util.*;
import javax.swing.*;
import java.text.*;

public class Withdrawal {

	public static void main(String[] args) {
		//using class random for random money
		Random rdmoney = new Random();
		int balance = rdmoney.nextInt(9)*100000;
		DecimalFormat  frm = new DecimalFormat ("#,###");
		
        int money = Integer.parseInt(JOptionPane.showInputDialog("Your balance : "+frm.format(balance)+""
        		+ "\nInput money to Withdrawal : "));
        if (money>balance) {
        	 JOptionPane.showMessageDialog(null,"Error:Cannot Withdrawal more than balance"
     				,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else if(money>20000) {
        	JOptionPane.showMessageDialog(null,"Error:Cannot Withdrawal more than 20,000"
     				,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else if(money%100<99 && money%100>1 ) {
        	JOptionPane.showMessageDialog(null,"Error:Cannot Withdrawal "+(money%100)+""
        			+ " bath.","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else JOptionPane.showMessageDialog(null,"You Withdrawal "+frm.format(money)+"bath."
    			+"\n1000 = "+money/1000+"\n500 = "+(money%1000)/500+"\n100 = "+((money%1000)%500)/100,"Message",JOptionPane.INFORMATION_MESSAGE);
        	

	
	}
}
