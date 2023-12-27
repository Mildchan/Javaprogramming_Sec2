import javax.swing.*;
public class Lab702_1 {
	static int[] validValues = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
	static double[] price = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };
	static double itemPrice = 0.0;
	static boolean vaLidItem= false;
	public static void main(String[] args) 
{
		inputItem();
}
	public static void inputItem() 
{
	int item = Integer.parseInt(JOptionPane.showInputDialog("Enter item number to order "));
	if(checkItem(item))
	{
		System.out.println("Item "+item+" is "+itemPrice);
	}
	else 
	{
		System.out.println("Invalid item");
	}
}
public static boolean checkItem(int item) 
	{
		for(int i = 0 ;i<validValues.length;i++) 
			if (item == validValues[i])
		{
			itemPrice = price[i];
			vaLidItem = true;
		}
		return vaLidItem;
	}
}


