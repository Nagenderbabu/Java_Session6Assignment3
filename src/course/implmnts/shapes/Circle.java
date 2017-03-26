package course.implmnts.shapes;

public class Circle implements Shape {

	
	// Declaring variables
	private String name;
	private float pi;
	private int radius;
	
	
    // Constructor with parameters
	public Circle(String name,float pi, int radius) {
		this.name=name;
		this.pi = pi;
		this.radius = radius;
	}
	
	// setters and getters parameters
	
//  gets name variable value
	public String getName() {
		return name;
	}
//  sets name variable value
	public void setName(String name) {
		this.name = name;
	}

	//  gets pi variable value
	public float getPi() {
		return pi;
	}

   // sets pi variable value
	public void setPi(float pi) {
		this.pi = pi;
	}

    // gets radius variable value
	public int getRadius() {
		return radius;
	}

    // sets radius variable value
	public void setRadius(int radius) {
		this.radius = radius;
	}

// overriding interface methods 

	@Override
	// Draws the Circle
	public String draw() {
		// TODO Auto-generated method stub
		System.out.println("Draws a "+" "+name);
		return name;
	}

	@Override
    // calculates area
	public double area() {
		// TODO Auto-generated method stub
		System.out.println("Area of Square is :"+pi*radius*radius);
		return pi*radius*radius;
	}

}
