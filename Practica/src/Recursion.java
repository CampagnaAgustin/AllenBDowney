
public class Recursion {

	// primero: devuelve el primer carácter de la cadena dada
	public static char letter(String s, int y) {
		return s.charAt(y);
	}

	// último: devuelve una nueva cadena que contiene todas
	// las letras de la cadena dada, salvo la primera
	public static String resto(String s) {
		return s.substring(1, s.length());
	}

	// largo: devuelve el largo de la cadena dada
	public static int largo(String s) {
		return s.length();
	}

	public static void imprimirCadena(String s) {

		int n = 0, x = largo(s);
		while (n < x) {
			System.out.println(letter(s, n));
			n = n + 1;
		}
	}

	public static void imprimirInverso(String s) {

		int n = largo(s) - 1;
		while (n >= 0) {
			System.out.println(letter(s, n));
			n = n - 1;
		}
	}

	public static void invertirCadena(String s) {

		int n = largo(s) - 1;
		while (n >= 0) {
			System.out.print(letter(s, n));
			n = n - 1;
		}
	}

	public static void main(String[] args) {

		imprimirCadena("ola bb");
		imprimirInverso("ola bb");
		invertirCadena("ola bb");

	}

}
