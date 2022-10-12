package Labs;

public class recurse {
	
	
	public static void main(String[] arggs) {
		
		for (int i = 0; i<=100; i++) {
			f(i,i);
		}
		
	}
	
	public static int f(int n , int m) {
		int out = 0;
		System.out.println("For: "+n+", out: ");
		try {
			if(n!=0) {
				out = f(n-1,f(n,m));
			}
		}
		catch (StackOverflowError e) {
			System.out.println("Terminates in this language");
		}
		
		return out;
	}
	
	
}
