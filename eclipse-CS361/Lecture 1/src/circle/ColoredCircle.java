/**
 * 
 */
package circle;

/**
 * @author cscharff
 *
 */
public class ColoredCircle extends Circle {

	public int color;
	
	/**
	 * 
	 */
	public ColoredCircle() {
	}

	@Override
	void moveTo(int newX, int newY) {
		this.centerX=newX;
		this.centerY=newY;
	}
	
	// overridden method from Circle
	@Override
	void draw() {
		System.out.print("Drawing a ColoredCircle..." + "\u001B[33m");
		for (int i = 0;i <= centerX + radius; i++) {
		       for (int j = 0;j <=centerY + radius; j++) {
		            double xSquared = (i - centerX)*(i - centerX);
		            double ySquared = (j - centerY)*(j - centerY);
		            if (Math.abs(xSquared + ySquared - radius * radius) < radius) {
		                System.out.print("//");
		            } else {
		                System.out.print(" ");
		            }
		        }
		        System.out.println();
		    }
		
		System.out.println("\u001B[0m");
	}
	
	@Override
	public String toString() {
		return "Circle: centerX = "+ centerX + " centerY = " + centerY + " radius = " + radius + " color: " + color;
	}
}
