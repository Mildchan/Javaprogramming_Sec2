
public class PersonalInfo {
	private Person name ;
	private Date bday ;
	
	private int personID ;
	
	PersonalInfo()
	{
		name = new Person();
		bday = new Date();
		personID = 0;
	}
	PersonalInfo(String first,String last,int month,int day,int year,int ID)
	{
		name = new Person(first,last);
		bday = new Date(month,day,year);
		personID = ID; 
	}
	public void setPersonalInfo(String first,String last,int month,int day,int year,int ID) 
	{
		name.setName(first, last);
		bday.setDate(month, day, year);
		personID = ID; 
	}
	
	public String toString() 
	{
		return "Name: " + name + "\n"+"Date of birth: " + bday +"\n"+"Personal ID: "+personID;
	}

}
