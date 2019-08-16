
public class Ejercicio_5_7 {

	static int x = 0;

	public static int ack(int m, int n) {
		if (m == 0) {
			return x = (n + 1);
		} else if (m > 0 && n == 0) {
			return x = ack(m - 1, 1);
		} else if (m > 0 && n > 0) {
			return x = ack(m - 1, ack(m, n - 1));
		} else
			return x;
	}

	public static void main(String[] args) {
		ack(3, 4);
		System.out.println("Ackerman es: " + x);
	}

}
