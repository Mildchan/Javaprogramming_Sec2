import java.io.*;
import java.util.*;
public class SaveandOpen extends Employee {
//Class SaveandOpen วิ่งไปใช้ Class Employee
	private String name;
	private String dept;
	
	public void insert() throws IOException{
		//รับข้อมูลจากแป้น
		Scanner scan = new Scanner(System.in);
		
		PrintStream writeFile = new PrintStream(new File("d://txtFile//employee.txt"));
		String answer;
		//รับข้อมูลลงไฟล์
		do {
			Haeder();
			System.out.print("Enter name: ");
			name = scan.next();
			System.out.print("Enter department: ");
			dept = scan.next();
			//save all data to File
			writeFile.println(name+"\t"+dept);
			System.out.print("Enter data again? : ");
			answer = scan.next().toLowerCase();
		}while(answer.equals("y"));
	
	}
	public void read() {
		try {
			//create obj for read Fle using Scanner Class
			Scanner readFile = new Scanner(new File("d://txtFile//employee.txt"));
			//test Scanner readFile = new Scanner(new File("d://txtFile//employees.txt")); 
			boolean check = false;
			Haeder();
			int i = 1;
			while(readFile.hasNext()) {
				name = readFile.next();
				dept = readFile.next();
				
				if(dept.equalsIgnoreCase(super.getDept())) 
				{
					System.out.println(i+")" +name);
					check=true;
					i++;
				}
			}
			if(check==false)
			{
				System.out.println("\nSorry, no department: "+super.getDept()+" in File.");
			}
			else if (check==true) {
				Haeder();
				System.out.println("Employee in dept"+"is is "+(i-1)+" person.");
			}
			readFile.close();
		}catch(IOException e) 
		{
			System.out.println("Sorry, file not found...");
		}
	}
}
