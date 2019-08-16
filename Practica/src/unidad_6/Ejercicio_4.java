package unidad_6;

public class Ejercicio_4 {

	public static double potencia(double x0, int n) {
		double x1 = x0;
		if (x0 == 0 && n == 0) {
			throw new IllegalArgumentException();
		} else if (n == 0) {
			return 1;
		} else
			while (n > 1) {
				x1 = x1 * x0;
				n = n - 1;
			}
		return x1;
	}
	
	public static void main (String [] arg) {
		
		System.out.println(potencia(2, 3));
		
	}

}
