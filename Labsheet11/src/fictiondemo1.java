import java.util.*;
public class fictiondemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Title: ");
		String title = scan.nextLine();
		
		System.out.print("Year: ");
		int publicYear = scan.nextInt();
		scan.nextLine();
		FictionBook book = new FictionBook(title,publicYear);
		
		
		System.out.print("Name: ");
		String author_name = scan.nextLine();
		book.setAuthorName(author_name);
		while(!book.checkFormatName()) {
			System.out.print("Name: ");
			author_name = scan.nextLine();
			book.setAuthorName(author_name);
		}
		
		System.out.print("Email: ");
		String email = scan.nextLine();
		book.setEmail(email);
		while(!book.checkEmail()) {
			System.out.print("Email: ");
			email = scan.nextLine();
			book.setEmail(email);
		}
		System.out.print(book);
		}	
}
