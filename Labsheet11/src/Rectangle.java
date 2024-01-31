
public class Rectangle extends Shape{
	
	private double width,length;
	
	Rectangle(double width,double length,String color){
		super(color); 
		this.width = width ;
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getLangth() {
		return length;
	}
	@Override
	public double getArea() {
		return this.width * this.length;
	}
	@Override
	public String toString() {
		return "Rectangle[wigth = "+this.width+",length= "+this.length+""
				+ ","+super.toString()+"]";
	}
	
}
