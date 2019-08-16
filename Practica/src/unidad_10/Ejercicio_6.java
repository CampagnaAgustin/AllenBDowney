package unidad_10;

public class Ejercicio_6 {

	public static int[] arrayAleatorio(int n, int bajo, int alto) {
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() *(alto - bajo + 1) + bajo);
		}
		return array;
	}

	public static int[] histogramaArreglo(int[] array) {
		int indice;
		int[] histograma = new int[11];
		for (int i = 0; i < array.length; i++) {
			if (array[i] <= 0) {
				histograma[0]++;
			} else if (array[i] >= 10) {
				histograma[10]++;
			} else {
				indice = array[i];
				histograma[indice]++;
			}
		}
		return histograma;
	}
	
	public static void imprimirArray(int [] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println("Indice " + i + " = " + array[i]);
		}
	}

	public static void main(String[] args) {
		imprimirArray(histogramaArreglo(arrayAleatorio(200, 0, 10)));
	}

}
