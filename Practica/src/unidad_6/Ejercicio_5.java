package unidad_6;

public class Ejercicio_5 {

	public static int factorial(int x) {
		int n = x - 1;
		if (x == 0) {
			return 1;
		} else
			while (n > 0) {
				System.out.println(x + "   " + n + "   " + x*n);
				x = x * n;
				n = n - 1;
			}
		return x;
	}

	public static void main(String[] arg) {

		System.out.println(factorial(12));

	}

}
