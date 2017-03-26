package course.implmnts.shapes;

public class SquareShape implements Shape {
	
	// declaring variables  
	private int side;
	private String name;
	
	// constructor with variables
	public SquareShape(String name, int side) {
		super();
		this.name = name;
		this.side = side;
	}

	// setters and getters methods
	
	// gets side variable  value
		public int getSide() {
		return side;
	}

// sets side variable value
	public void setSide(int side) {
		this.side = side;
	}

// gets name variable value 
	public String getName() {
		return name;
	}

// sets value to name variable
	public void setName(String name) {
		this.name = name;
	}

// overriding  shape interface methods
	
		@Override
		// Draws shape
	public String draw() {
		// TODO Auto-generated method stub
			System.out.println("Draws a "+" "+name);
	return name;
	}

	@Override
	// calculates area
	public double area() {
		// TODO Auto-generated method stub
		System.out.println("Area of Square is :"+side*side);
	return  side;
	}

}
