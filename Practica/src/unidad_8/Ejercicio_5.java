package unidad_8;

import java.math.BigInteger;

public class Ejercicio_5 {

	public static BigInteger potencia(int x, int n) {
		BigInteger uno = BigInteger.valueOf(1);
		BigInteger bigX = BigInteger.valueOf(x);
		if (n == 0)
			return uno;
		// calcular x a la n/2 recursivamente
		BigInteger t = potencia(x, n / 2);
		// si n es par, el resultado es t al cuadrado
		// si n es impar, el resultado es t al cuadrado por x
		if (n % 2 == 0) {
			return t = t.multiply(t);
		} else {
			return t = t.multiply(t.multiply(bigX));
		}
	}

	public static void main(String[] args) {

		System.out.println(potencia(50,5));
		
	}

}
