
public class Circle {
		// the public constants
		public static final double DEFAULT_RADIUS = 1.0;
		public static final String DEFAULT_COLOR = "red";
        //the private 2 attributes
		private double radius;
		private String color;
		
		//constructs a Circle with default radius and color
		//1st(default) constructor
		Circle(){
			this.radius = DEFAULT_RADIUS;
			this.color = DEFAULT_COLOR;
		}
		//constructor a Circle with the given radius and default color
		//2nd constructor
		Circle(double radius){
			this.radius = radius;
			this.color = DEFAULT_COLOR;
		}
		//constructor a Circle with the given radius and color
		Circle(double radius,String color){
			this.radius = radius;
			this.color = color;
		}
		//return the radius the public getter for private attribute radius
		public double getRadius(){
			return this.radius;
		}
		//set the radius the public setter for private attribute radius
		public void setRadius(double radius) {
			this.radius = radius;
		}
		
		public String getColor() {
			return this.color;
		}
		
		public void setColor(String color) {
			this.color = color;
		}
		//return a self-descriptive string for a circle
		public String toString() {
			return"Circle[radius= "+this.radius+",color= "+color+"]";
		}
		//return the area of this Circle
		public double getArea(){
			return Math.PI * Math.pow(radius, 2);
		}
		//return the circumference of this Circle
		public double getCircumference() {
			return 2.0 * Math.PI * radius;
		}
		
		
}
