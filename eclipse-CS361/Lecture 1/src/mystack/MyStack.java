/**
 * 
 */
package mystack;

/**
 * @author ADD YOUR NAME
 * Yared Y Yehualashet 
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack=null;;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		T out = theStack.val;
		theStack = theStack.next;
		return out;
	}

	public void push(T v) {
		// TODO To complete
		if(theStack==null) {
			theStack=new MyNode(v, null);
			return;
		}
		
		theStack = new MyNode(v,theStack);
		return;
		
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		// Push 1 and 2
		// Pop
		// Push 5
		MyStack stackInt = new MyStack();
		stackInt.push(1);
		stackInt.push(2);
		stackInt.pop();
		stackInt.push(5);
		
		
		
		// TODO To complete
		// Create a stack of Person
		// Push a person p1 with your name
		// Push a person p2 with my name
		MyStack stackPer = new MyStack();
		stackPer.push(new Person("Yared", "Yehualashet"));
		stackPer.push(new Person("Christelle", "Scharff"));
		
	}

}
