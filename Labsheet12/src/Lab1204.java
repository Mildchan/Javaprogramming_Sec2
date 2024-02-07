import java.io.*;
import java.util.Scanner;
public class Lab1204
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//BookData.txt"));
		Scanner input = new Scanner(System.in);
		System.out.print("Enter rating of books: ");
		double Rating = input.nextDouble();
		int i = 1;
		String temp = "";
		System.out.println("------------------------------------------------------------------");
		
		while((temp = readFile.readLine()) != null)
		{
			String[] data = temp.split("\t");
			System.out.println("Book " + i + " : " + data[0] + " write by " + data[1] + " (" + data[3] + ") reviews");
			i++;
		}
		
		System.out.println("------------------------------------------------------------------");
		readFile.close();
	}
}