package unidad_7;

public class Ejercicio_6 {

	public static boolean esAbcedaria(String word) {
		int i = 0;
		int l = word.length();
		char c1;
		char c2;
		while (i < l - 1) {
			c1 = word.charAt(i);
			c2 = word.charAt(i + 1);
			if (c1 - c2 < 0) {
				i++;
			}else 
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(esAbcedaria("ágil"));
	}

}
