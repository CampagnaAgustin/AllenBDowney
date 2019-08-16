package unidad_10;

public class Ejercicio_1 {

	public static void doubleAleatorio(double bajo, double alto) {
		for (int i=0; i<10; i++) {
		double x = Math.random ()*(alto-bajo) + bajo;
		System.out.println(x);
		}
	}
	
	public static void intAleatorio(int bajo, int alto) {
		for (int i=0; i<10;i++) {
			int x = (int) (Math.random()*((alto + 1)-bajo) + bajo);
			System.out.println(x);
		}
	}
	
	public static void main(String[] args) {
		intAleatorio(-2, 15);
	}
}
