package unidad_10;

public class Ejercicio_13 {

	public static boolean testearPalabra(String palabra, String letras) {
		int comodin = 0;
		int[] array = new int[26];
		for (int i = 0; i < palabra.length(); i++) {
			int c = palabra.charAt(i);
			if (65 <= c && c <= 90) {
				array[c - 65]++;
			} else if (97 <= c && c <= 122) {
				array[c - 97]++;
			}
		}
		for (int j = 0; j < letras.length(); j++) {
			int c = letras.charAt(j);
			if (65 <= c && c <= 90) {
				array[c - 65]--;
			} else if (97 <= c && c <= 122) {
				array[c - 97]--;
			} else if (c == 32) {
				comodin++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				while (comodin > 0 && array[i] > 0) {
					array[i]--;
					comodin--;
				}
				if (array[i] > 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(testearPalabra("salame", "     "));
	}

}
