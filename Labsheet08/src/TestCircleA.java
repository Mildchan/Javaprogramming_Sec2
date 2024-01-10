
public class TestCircleA {

	public static void main(String[] args) {
		CircleA c1 = new CircleA();
		CircleA c2 = new CircleA();
		CircleA c3 = new CircleA();
		
		c1.setRadius(2.0);
		c1.setColor("blue");
		
		System.out.println("Circle of object c1 Area is "+c1.getArea()+", and color is "+c1.getcolor());
		
		c2.setRadius(2.0);
		c2.setColor("red");
		
		System.out.println("Circle of object c2 Area is "+c2.getArea()+", and color is "+c2.getcolor());
		
		c3.setRadius(1.0);
		c3.setColor("red");
		
		System.out.println("Circle of object c3 Area is "+c3.getArea());
		
		
	}

}
