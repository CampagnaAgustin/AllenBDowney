package unidad_10;

public class Ejercicio_4 {
	
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

	public static boolean sonFactores(int n, int[] array) {
		for(int i=0; i<array.length;i++) {
			if (n % array[i] == 0) {
				System.out.println(n + " es factor de " + array[i]);
			} else {
				System.out.println(n + " no es factor de " + array[i]);
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[]args) {
		int [] factor = new int [5];
		factor [0] = 6;
		factor [1] = 4;
		factor [2] = 2;
		factor [3] = 4;
		factor [4] = 3;
		System.out.println(sonFactores(8, factor));
	}
	
}
