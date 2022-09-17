/**
 * 
 */
package reflection;

/**
 * @author ADD YOUR NAME 
 *	Yared Y Yehualashet
 */

// Reflection: https://docs.oracle.com/javase/tutorial/reflect/class/

// Demonstration of Reflection

// Given an object o, we want to know what class corresponds to o, the inheritance chain for o
// and the list of methods of the class

// Complete the code

import java.lang.reflect.Method;

import circle.ColoredCircle;

public class Reflection {

	/**
	 * Print the class corresponding to the object
	 * @param o the object
	 */
	public void correspondingClass(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		System.out.println("Inspecting class: " + o.getClass().getName());
	}

	/**
	 * Print the chain of super classes of the object 
	 * Format of the output:
	 * Inheritance chain:
	 * Cn inherits from Cn-1 inherits ... inherits from java.lang.Object
	 * @param o the object
	 */
	public void inheritanceChain(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		// TODO To complete
		// You need to use the EXACT format of the output
		// Hint: Use the method getSuperClass()
		System.out.println("\nInheritance chain:");
		Object holder = o;
		while(!holder.getClass().getName().startsWith("java.lang")) {
			System.out.print(holder.getClass().getName() + " inherits from ");
			holder = holder.getClass().getSuperclass();
		}
		System.out.println(o.getClass().getName());
	}
	
	/**
	 * Print the list of methods of the object
	 * @param o an object
	 */
	public void listMethods(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		Method[] m = o.getClass().getMethods();

		// List of methods
		// TODO To complete
		// Print each method on one line
		// Use this EXACT format
		System.out.println("\nMethods in " + o.getClass().getName()+":");
		for (int i = 0; i < m.length; i++){
			System.out.println(m[i].getName());
		}
	}

	/**
	 * Constructor
	 */
	public Reflection() {
	}

	/**
	 * Demonstration
	 * @param args
	 */
	public static void main(String[] args) {

		Reflection r = new Reflection();		
		
		// Demonstration of the methods on an objet of type String
		// TODO To complete
		Object test1 = "Hello World";
		r.correspondingClass(test1);
		r.inheritanceChain(test1);
		r.listMethods(test1);
		
		// Demonstration of the methods on an objet of type ColoredCircle
		// TODO To complete	
		System.out.println("\n");
		ColoredCircle cc = new ColoredCircle();
		cc.centerX = 5;
		cc.centerY = 6;
		cc.color = 1;
		
		r.correspondingClass(cc);
		r.inheritanceChain(cc);
		r.listMethods(cc);
	}

}
