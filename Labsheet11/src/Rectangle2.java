
public class Rectangle2 implements Shape2 {

	private double width,length;
	
	Rectangle2(double width,double length){ 
		this.width = width ;
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getLangth() {
		return length;
	}
	
	public double getArea() {
		return this.width * this.length;
	}
	
	public String toString() {
		return "Rectangle[wigth = "+this.width+",length= "+this.length+""
				+ "]";
	}

}
