
public class Fibonacci {

	static int x;

	public static int fibonacci(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return x = (fibonacci(n - 1) + fibonacci(n - 2));
		}
	}

	public static void main(String[] args) {

		fibonacci(10);
		System.out.println(x);

	}

}
