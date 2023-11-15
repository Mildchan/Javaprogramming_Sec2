
public class Example1 {

	public static void main(String[] args) {
		String bookIsbn = "IB2-6325-85-4-1";
		String bookTitle = "Basic Java Programming";
		int bookUnit = 5;
		float bookPrice = 225.75f;
		//display to console
		System.out.println("Book ISBN  : "+bookIsbn);
		System.out.println("Book Title : "+bookTitle);
		System.out.println("Book Unit  : "+bookUnit+ " Books.");
		System.out.println("Book Price : "+bookPrice+ " Baht.");
		System.out.println("----------------------------------");
		double totalPrice = bookUnit * bookPrice ;
		double VatPrice = (totalPrice*0.07)+totalPrice ;
		System.out.println("Total Price is "+totalPrice);
		System.out.println("Add VAT 7%  is "+VatPrice);
	}

}
