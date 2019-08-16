package unidad_7;

public class Ejercicio_4 {

	public static void rarificar(int x) {
		if (x == 0) {
			return;
		} else {
			rarificar(x / 2);
		}
		System.out.print(x % 2);
	}

	public static void main(String[] args) {
		rarificar(5);
		System.out.println("");
	}
}
