import java.util.*;
public class lab604 {
    static Scanner scan = new Scanner(System.in);
    static String studentId,strsubjectId;
    static int subjectId;

	public static void main(String[] args) 
	{
		inputStudent();
	}
	public static void inputStudent() 
	{
		do {
			System.out.print("Enter Student Id : ");
			studentId = scan.next();
			System.out.print("Enter Subject Id : ");
			subjectId = scan.nextInt();
			
			strsubjectId = subjectId+"";
		}while(!isLength(studentId,strsubjectId));
		
		displayData(isITStudent(studentId),isITSubject(strsubjectId));
		
    }
	public static boolean isLength(String id ,String subid)
    {
		if(id.length()==10&&subid.length()==7)
		{
			return true;
		}
		else return false;
	}
	public static boolean isITStudent(String id) 
	{
		if(id.substring(0,3).equals("211")&&id.substring(3,6).equals("311")) 
		{
			return true;
		}
		else return false;
	}
	public static boolean isITSubject(String subid)  
	{
		if(subid.substring(0,2).equals("21")&&subid.substring(4,5).equals("1")) 
		{
			return true;
		}
		else return false;
	}
	public static void displayData(boolean sid,boolean subid) 
	{
		if(sid) 
		{
			System.out.println("Student id: "+studentId+" 1st year student in IT");
		}
		else 
		{
			System.out.println("Student id: "+studentId+" is not 1st year student in IT");
		}
		if(subid) 
		{
			System.out.println("Enroll in courses for Year 1");
		}
		else 
		{
			System.out.println("not enroll in courses for Year 1");
		}
	}

}
