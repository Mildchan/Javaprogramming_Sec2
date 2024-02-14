import java.io.*;
import java.util.*;
public class Addproduct {

	public static void main(String[] args)throws IOException {
		//use PrintWritter save
		PrintWriter writeFile = new PrintWriter(new FileWriter("d://txtFile//product.txt",true)); //saveต่ออย่าลืม true

		Scanner scan = new Scanner(System.in);
		//Display and input data from keyboard
		//ไม่ใช้whileเพราะโจทย์บอกบันทึกครั้งเดียวจบ
		System.out.print("Input product id: ");
		String productId = scan.next();//บันทึกไฟล์ห้ามเว้นวรรค
		System.out.print("Input product Name: ");
		String productName = scan.next();//บันทึกไฟล์ห้ามเว้นวรรค
		System.out.print("Input product Unit: ");
		int productUnit = scan.nextInt();//บันทึกไฟล์ห้ามเว้นวรรค
		System.out.print("Input product Price: ");
		float productPrice = scan.nextFloat();//บันทึกไฟล์ห้ามเว้นวรรค
		//save data to file
		writeFile.println(productId+","+productName+","+productUnit+","+productPrice);
		System.out.println("Save file already...");
		writeFile.close();
	}

}
