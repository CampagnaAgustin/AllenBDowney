
public class Ejercicio_5_2 {

	public static boolean esDivisible(int n, int m) {
		if (n % m == 0) {
			System.out.println(n + " es divisible por " + m);
			return true;
		} else {
			System.out.println(n + " no es divisible por " + m);
			return false;
		}
	}

	public static void main(String[] args) {
		esDivisible(4, 2);

	}

}
