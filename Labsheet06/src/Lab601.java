import javax.swing.*;

public class Lab601 {

	public static void main(String[] args) 
	{
		
		InputEmail();
	}
	
	public static void InputEmail() 
	{
        String inputEmail = JOptionPane.showInputDialog("Input your e-mail:").toLowerCase();
		
		JOptionPane.showMessageDialog(null,"Your e-mail is "+inputEmail);
		boolean chkemail = checkEmail(inputEmail);
		displayEmail(chkemail,inputEmail);
    }
	
	public static boolean checkEmail(String email) 
	{
        if(email.endsWith("hotmail.com")||email.endsWith("gmail.com"))
		{
			return true;
		}
        else return false;
    }
	
	
	public static void displayEmail(boolean chemail,String inEmail)
	{
		if(chemail == true)
		{
			JOptionPane.showMessageDialog(null,"Your e-mail is "+inEmail);
		}
		else 
		{
			JOptionPane.showInputDialog("Input your e-mail, again:");
		}
	}

}
