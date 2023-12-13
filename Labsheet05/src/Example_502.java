import javax.swing.JOptionPane;

public class Example_502 {

	public static void main(String[] args) {
		//input
		String yourEmail = JOptionPane.showInputDialog("Input your e-mail:");
		//checkEmail
		while(yourEmail.startsWith("@")||yourEmail.startsWith(" ")) 
		{
			yourEmail = JOptionPane.showInputDialog("Input your e-mail, again:");
		}
		//chackEmailend
		if(yourEmail.endsWith("hotmail.com")||yourEmail.endsWith("gmail.com"))
		{
			JOptionPane.showMessageDialog(null,"Your e-mail is "+yourEmail);
		}
		else {
			JOptionPane.showMessageDialog(null,"Your e-mail is not hotmail or gmail dot \r\n"
					+ "com");
		}
		
	}

}
