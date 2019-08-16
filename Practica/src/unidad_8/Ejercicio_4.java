package unidad_8;

import java.math.BigInteger;

public class Ejercicio_4 {

	public static BigInteger factorial(int x) {
		int w = 1;
		BigInteger grande = BigInteger.valueOf(w);
		while (x > 0) {
			BigInteger chico = BigInteger.valueOf(x);
			grande = chico.multiply(grande);
			x--;
		}
		return grande;
	}
	
	public static void tablaFactorial(int i) {
		while (i >= 0) {
			System.out.println(i + "!\t" + factorial(i));
			i--;
		}
	}
	
	public static void main(String[] args) {	
		tablaFactorial(30);
	}

}
