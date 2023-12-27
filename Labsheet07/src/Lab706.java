import javax.swing.JOptionPane;

public class Lab706 {

	public static void main(String[] args) 
	{
		int[] nums = {25, 78, 41, 22, 36, 85, 37};
		
		int Indexnum = Integer.parseInt(JOptionPane.showInputDialog("Input index of array: "));
        
		while(checkIndex(nums,Indexnum)) 
		{
			Indexnum = Integer.parseInt(JOptionPane.showInputDialog("Input index of array, again: "));
        }
		int currentValue = currentData(nums,Indexnum);
        int prevValue = prevData(nums,Indexnum);
		int nextValue = nextData(nums,Indexnum);
		JOptionPane.showMessageDialog(null, "current data, nums["+Indexnum+"] is"+currentData(nums,Indexnum)+""
				+ "\n"+((prevValue<0)?"no previous data":"Previos data nums["+(prevValue)+"]"+" is "+nums[prevValue])+""
						+ "\n"+((nextValue>=nums.length)?"no Next data":"Next data nums["+(nextValue)+"]"+" is "+ nums
								[nextValue]));
				
	}
	public static boolean checkIndex(int[] number ,int index) 
	{
		/*if ((index>=number.length)||(index<0))
		{
			return true;
		}
		else 
		{
			return false;
		}*/
		return ((index>=number.length)||(index<0))?true:false;
	}
	public static int currentData(int[] nums ,int index) 
	{
		return nums[index];
	}
	public static int prevData(int[] nums ,int index) 
	{
		return nums[index-1];
	}
	public static int nextData(int[] nums ,int index) 
	{
		return nums[index+1];
	}
}
	


