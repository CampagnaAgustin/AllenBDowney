
public class Ejercicio_5_1 {

	public static boolean triangulo(int x, int y, int z) {
		if (x + y > z && x + z > y && y + z > x) {
			System.out.println("Con tres palitos de las medidas: " + x + "cm, " + y + "cm y " + z
					+ "cm se puede formar un triangulo");
			return true;
		} else
			System.out.println("No se puede armar un triangulo");
		return false;
	}

	public static void main(String[] args) {
		triangulo(2, 2, 10);

	}

}
