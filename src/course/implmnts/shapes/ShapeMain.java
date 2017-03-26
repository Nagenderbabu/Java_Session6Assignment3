package course.implmnts.shapes;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//  initializing implemented(SquareShape) class and referring it to interface class object
	Shape s1=new SquareShape("square",3);
	// initializing implemented(RectangleShape) class and referring it to interface class object
	Shape s2 =new Rectangle("rectangle",5,6);
	// initializing implemented(CircleShape) class and referring it to interface class object
	Shape s3= new Circle("Circle",(float) 3.14,4);
	// prints square shape details
System.out.println("************* Square Shape ************************** ");
	s1.draw();
    s1.area();
 // prints rectangle shape details
	System.out.println("************* Rectangle Shape ************************** ");
    s2.draw();
    s2.area();
//  prints Circle shape details
System.out.println("*************** Circle Shape ************************** ");
    s3.draw();
    s3.area();

	}

}
