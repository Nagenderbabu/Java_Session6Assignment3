package course.implmnts.shapes;

public class Rectangle implements Shape{

	// declaring variables
	private String name;
	private int width;
	private int length;
	
	// constructor with parameters 
	public Rectangle(String name,int length, int width) {
		this.name=name;
		this.length = length;
		this.width = width;
	}

// setters and getters variables
	
	// gets length variable value
	public int getLength() {
		return length;
	}


	// sets length variables value
	public void setLength(int height) {
		this.length = height;
	}

// gets width variable value
	public int getWidth() {
		return width;
	}

// sets width variable value
	public void setWidth(int base) {
		this.width = base;
	}

// overriding interface variables
	
	@Override
	// Draws the shape
	public String draw() {
		// TODO Auto-generated method stub
		System.out.println("Draws a "+" "+name);
		return name;	
	}

	@Override
	// calculates area
	public double area() {
		// TODO Auto-generated method stub
		System.out.println("Area of Square is :"+length*width);
		return 0;
	}

}
