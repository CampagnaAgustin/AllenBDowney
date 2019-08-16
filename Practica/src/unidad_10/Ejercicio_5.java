package unidad_10;

public class Ejercicio_5 {

	public static int[] arrayAleatorio(int n) {
		int [] array = new int[n];
		for (int i=0; i<array.length;i++) {
			array[i] = (int) (Math.random()*20 + 1);
		}
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		return array;
	}
	
	public static int indice(int blanco, int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == blanco) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String [] args) {
		System.out.println(indice(5,arrayAleatorio(30)));
	}
	
}
