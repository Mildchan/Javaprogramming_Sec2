import javax.swing.JOptionPane;

public class Example03 {

	public static void main(String[] args) 
	{
		double Weight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight"));
		
		double Height = Double.parseDouble(JOptionPane.showInputDialog("Input Height"));
		
		Height = Height/100;
		double bmi = Weight/(Height*Height);
		
		String bmicategory;
		if (bmi<18.5)bmicategory="Underweight";
		else if (bmi<25)bmicategory="Normal-weight";
		else if (bmi<30)bmicategory="Overweight";
		else bmicategory = "Obesity";
        
		JOptionPane.showMessageDialog(null,"BMI = "+String.format("%.1f", bmi)+""
				+ "\nYou're "+bmicategory,"BMI",JOptionPane.WARNING_MESSAGE);
	}

}
