package unidad_9;

public class Racional {

	int numerador, denominador;

	public Racional() {
		this.numerador = 0;
		this.denominador = 0;
	}

	public Racional(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public String toString() {
		if (denominador != 1) {
			return numerador + "/" + denominador;
		} else {
			return numerador + "";
		}
	}

	public void imprimirRacional() {
		if (denominador != 1) {
			System.out.println(numerador + "/" + denominador);
		} else {
			System.out.println(numerador);
		}
	}
	
	public void invertirSigno() {
		numerador = -numerador;
	}
	
	public void invertir() {
		int y = numerador;
		numerador = denominador;
		denominador = y;
		if (denominador < 0) {
			numerador = -numerador;
			denominador = - denominador;
		}
	}
	
	public double aDouble() {
		double x = numerador;
		double y = denominador;
		return x/y;
	}

	public static void imprimirRacional(Racional x) {
		if (x.denominador != 1) {
			System.out.println(x.numerador + "/" + x.denominador);
		} else {
			System.out.println(x.numerador);
		}
	}

	public static void invertirSigno(Racional x) {
		x.numerador = -x.numerador;
	}

	public static void invertir(Racional x) {
		int y = x.numerador;
		x.numerador = x.denominador;
		x.denominador = y;
		if (x.denominador < 0) {
			x.numerador = -x.numerador;
			x.denominador = -x.denominador;
		}
	}

	public static double aDouble(Racional x) {
		return x.numerador / x.denominador;
	}

	public static void main(String[] args0) {
		Racional x = new Racional();
		x.numerador = 5;
		x.denominador = 10;
		System.out.println(x.aDouble());
	}

}
