package eclipse.CS361.Labs;
public class fibo {
	public static int fibonacci(int n) {
		
		if (n < 0 || n > 100) {
			throw new IllegalArgumentException("n should be between 0 and 100");
		} else {
			if (n == 0) {
				return 1;
			} else {
				return fibonacci(n - 1) + fibonacci(n - 2);
			}
		}
	}

	
	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			System.out.println("Fibonacci(" + i + ") = " + fibonacci(i));
		}

	}
}
