import java.util.Scanner;
import java.io.*;
public class Example1201 {

	public static void main(String[] args) throws IOException {
		//use Scanner Class read data from file
		Scanner readFile = new Scanner(new File("d://txtfile//MemberLogin.txt"));
		while(readFile.hasNext()) 
		{
			String FName = readFile.next();
			String LName = readFile.next();		//readFile.next();
			readFile.next();
			String email = readFile.next().toUpperCase();
			
			System.out.println(FName+" "+"("+email+")");
		}
		readFile.close();
	}
}
