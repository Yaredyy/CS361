/**
 * 
 */
package circle;


/**
 * @author ADD YOUR NAME
 * Yared Y Yehualashet
 * CS 361
 *
 */

// TODO Complete the code

public class Circle extends GraphicObject {

	// No use of encapsulation
	public double centerX, centerY;
	public double radius=2;
	public int windowNumber;

	/**
	 * 
	 */
	public Circle() {
	}

	// overloaded method in Circle
	// overridden method from GraphicObject
	@Override
	void draw() {
		System.out.print("Drawing a Circle...");
		
		for (int i = 0;i <= centerX + radius; i++) {
		       for (int j = 0;j <=centerY + radius; j++) {
		            double xSquared = (i - centerX)*(i - centerX);
		            double ySquared = (j - centerY)*(j - centerY);
		            if (Math.abs(xSquared + ySquared - radius * radius) < radius) {
		                System.out.print("(}");
		            } else {
		                System.out.print(" ");
		            }
		        }
		        System.out.println();
		    }
		System.out.println();
	}

	// overloaded method in Circle
	// Not overridden as it does follow the signature in GraphicObject
	public void draw(int color) {
		System.out.println("Drawing a Circle in color...");
		for (int i = 0;i <= centerX + radius; i++) {
		       for (int j = 0;j <=centerY + radius; j++) {
		            double xSquared = (i - centerX)*(i - centerX);
		            double ySquared = (j - centerY)*(j - centerY);
		            if (Math.abs(xSquared + ySquared - radius * radius) < radius) {
		                System.out.print("/#");
		            } else {
		                System.out.print(" ");
		            }
		        }
		        System.out.println();
		    }
	}

	public double circumference() {
		return 2.0 * 3.141529 * radius;
	}

	public double area() {
		return 3.141529 * radius * radius;
	}

	public boolean overlaps(Circle other) {
		return ((centerX - other.centerX) * (centerX - other.centerX)
				+ (centerY - other.centerY) * (centerY - other.centerY)) < ((radius + other.radius)
						* (radius + other.radius));
	}

	@Override
	void moveTo(int newX, int newY) {
		centerX = newX;
		centerY = newY;
	}

	// TODO To complete
	/**
	 * @return the Circle with this EXACT format Circle: centerX = ... centerY = ... radius = ...
	 */
	@Override
	public String toString() {
		return "Circle: centerX = "+ centerX + " centerY = " + centerY + " radius = " + radius;
	}

	// TODO To complete
	// TODO Be sure that you understand the difference between equals and ==
	/**
	 * @return true if this and obj have the same values for
	 * centerX, centerY and radius
	 */
	public boolean equals(Circle obj) {
		boolean flag = true;
		if(this.centerX!=obj.centerX||this.centerY!=obj.centerY|| this.radius!=obj.radius) {
			flag = false;
		}
		return flag;
	}

	// TODO To complete
	/**
	 * @return an exact copy of the Circle that is a new instance 
	 */
	 @Override
	 protected Object clone() throws CloneNotSupportedException {
		 Circle cl = new Circle();
		 cl.centerX = this.centerX;
		 cl.centerY = this.centerY;
		 cl.radius = this.radius;
	 return cl;
	 }

}
