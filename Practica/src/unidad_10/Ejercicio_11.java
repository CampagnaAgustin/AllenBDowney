package unidad_10;

public class Ejercicio_11 {

	public static void imprimirArray(int [] array) {
		for(int i = 0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static int[] histogramaLetras(String palabra) {
		int [] array = new int[26];
		for (int i = 0; i<palabra.length(); i++){
			int c = palabra.charAt(i);
			if (65 <= c && c <= 90) {
				array[c-65]++;
			}else if (97 <= c && c <= 122) {
				array[c-97]++;
			}
		}return array;
	}
	
	public static void main(String [] args){
		imprimirArray(histogramaLetras("abcdefghijkmnlopqrstuvwxyzABCDEFGHIJKMNLOPQRSTUVWXYZ"));
	}
	
}
