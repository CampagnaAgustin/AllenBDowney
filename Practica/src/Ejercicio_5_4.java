
public class Ejercicio_5_4 {

	public static double sumCuadrados(double x1, double x2, double y1, double y2) {
		double dx = x2 - x1;
		double dy = y2 - y1;
		return (dx * dx) + (dy * dy);
	}

	public static double distancia(double x1, double x2, double y1, double y2) {
		return Math.sqrt(sumCuadrados(x1, x2, y1, y2));
	}

	public static void main(String[] args) {
		System.out.println("La distancia entre un punto y el otro es: " + distancia(2, 4, 2, 4));
	}

}
