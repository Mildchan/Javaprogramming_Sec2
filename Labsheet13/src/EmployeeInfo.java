import java.io.*;
import java.util.*;
public class EmployeeInfo {

	public static void main(String[] args)throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		String choice,department;
		System.out.print("Insert or Read data? : ");
		choice = scan.next().toLowerCase();
		
		while(!(choice.equals("insert"))&& !(choice.equals("read"))) 
		{
			System.out.print("Please text insert or read data? : ");
			choice = scan.next().toLowerCase();
		}
		
		//create Obj เรียกใช้class SaveandOpen
		SaveandOpen obj = new SaveandOpen();
		//obj ไปใช้ method ได้ทั้งหมดของ SaveandOpen และ Empolyee
		if(choice.equals("insert")) 
		{
			obj.insert();
		}
		else if(choice.equals("read")) 
		{
			System.out.print("\nEnter department: ");
			department = scan.next().toLowerCase(); 
			obj.setDept(department);//ส่งค่าไปmethod setdept class employee
			obj.read();
		}
	}

}
