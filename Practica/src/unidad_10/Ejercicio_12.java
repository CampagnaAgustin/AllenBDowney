package unidad_10;

public class Ejercicio_12 {

	public static boolean esRedoblona(String palabra) {
		int [] array = new int[26];
		for (int i = 0; i<palabra.length(); i++){
			int c = palabra.charAt(i);
			if (65 <= c && c <= 90) {
				array[c-65]++;
			}else if (97 <= c && c <= 122) {
				array[c-97]++;
			}
		}for (int j = 0; j<26; j++) {
			if (array[j] != 0 && array[j] != 2) {
				return false;
			}
		}return true;
	}
	
	public static void main(String [] args) {
		System.out.println(esRedoblona("dada"));
	}
	
}
