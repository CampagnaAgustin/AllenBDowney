package unidad_6;

public class Ejercicio_3 {
	

	
	public static double raizCuadrada(double a) {
		double x0 = a/2;
		double x1 = (x0 + a/x0)/2;
		while (Math.abs(x1 - x0) >= 0.00001) {
			x0 = x1;
			x1 = (x0 + a/x0)/2;
		}
		return x1;
	}
	
	public static void main(String [] arg) {
		
		System.out.println(raizCuadrada(16));
		
	}
}