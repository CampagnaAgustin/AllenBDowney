package unidad_7;

public class Ejercicio_5 {

	public static boolean esCapicua(String word) {
		if (word.length() < 2) {
			return true;
		} else {
			char primeraLetra = word.charAt(0);
			char ultimaLetra = word.charAt(word.length() - 1);
			String medio = word.substring(1, word.length() - 1);
			int i = word.length() - 2;
			String reverse = "";
			while (i > 0) {
				reverse = reverse + word.charAt(i);
				i--;
			}
			if (primeraLetra == ultimaLetra && medio.equals(reverse)) {
				return true;
			} else
				return false;
		}
	}

	public static boolean esCapicuaIte(String word) {
		int i = 0;
		int n = word.length();
		if (n < 2) {
			return true;
		} else if (n % 2 == 0) {
			while (i != n) {
				if (word.charAt(i) == word.charAt(n - 1)) {
					i++;
					n--;
				} else
					return false;
			}
		} else {
			while (i != n + 1) {
				if (word.charAt(i) == word.charAt(n - 1)) {
					i++;
					n--;
				} else
					return false;
			}
		}
		return true;
	}

	public static void main(String[] arg) {
		System.out.println(esCapicua("holaaloh"));
		System.out.println(esCapicuaIte("fuuuuuuuf"));

	}

}
