import javax.swing.*;
public class Shop100Bath {

	public static void main(String[] args) {
		Product sold = new Product();
		
		int buttonConfrirm = JOptionPane.showConfirmDialog(null, "Pattanakarn?");
		if(buttonConfrirm == 0 ) {
			sold = new PattanakarnBranch();
		}
		
		int numberOfproduct = Integer.parseInt(JOptionPane.showInputDialog("Input the number of product: "));
	
		sold.setUnit(numberOfproduct);
		
		JOptionPane.showMessageDialog(null, sold);
	}

}
