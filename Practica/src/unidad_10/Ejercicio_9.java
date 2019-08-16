package unidad_10;

public class Ejercicio_9 {

	public static int[] arrayAleatorio(int n, int bajo, int alto) {
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * (alto - bajo + 1) + bajo);
			System.out.println(array[i]);
		}
		return array;
	}

	public static int maximoEnArreglo(int[] array, int indiceBajo, int indiceAlto) {
		int med, maxBajo, maxAlto;
		if (indiceBajo == indiceAlto) {
			return array[indiceBajo];
		} else {
			med = (indiceBajo + indiceAlto) / 2;
			maxBajo = maximoEnArreglo(array, indiceBajo, med);
			maxAlto = maximoEnArreglo(array, med + 1, indiceAlto);
			if (maxBajo > maxAlto) {
				return maxBajo;
			} else {
				return maxAlto;
			}
		}
	}
	
	public static int max(int [] array) {
		int w = maximoEnArreglo(array, 0, array.length-1);
		return w;
	}
	
	public static int encontrar(int[] array, int objetivo, int r, int l) {
		if (r>l) {
			return -1;
		}else if(array[r] == objetivo) {
			return r;
		}else if(array[l] == objetivo) {
			return l;
		}else
			return encontrar(array, objetivo, r+1, l-1);
	}
	
	public static int find(int [] array, int objetivo) {
		int w = encontrar(array, objetivo, 0, array.length-1);
		return w;
	}

	public static void main(String[]args) {
		System.out.println(max(arrayAleatorio(10, 4, 20)));
		System.out.println(find(arrayAleatorio(10, 0, 15), 5));
	}
	
}
