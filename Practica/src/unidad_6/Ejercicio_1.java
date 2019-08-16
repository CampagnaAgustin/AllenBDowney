package unidad_6;

public class Ejercicio_1 {

	public static void main(String[] args) {
		ciclar(10);
	}

	public static void ciclar(int n) {
		int i = n;
		while (i > 1) {
			System.out.println(i + "   " + n);
			if (i % 2 == 0) {
				i = i / 2;
			} else {
				i = i + 1;
			}
		}
	}

}
