package unidad_10;

public class Ejercicio_10 {

	public static void imprimirArray(int [] array) {
		for(int i = 0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static int[] arrayAleatorio(int n, int bajo, int alto) {
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * (alto - bajo + 1) + bajo);
		}
		return array;
	} 
                                                                                    
	public static int maximoEnRango(int[] array, int indiceBajo, int indiceAlto) {
		int indice = indiceBajo, z = array[indiceBajo];
		for (int i = indiceBajo; i < indiceAlto; i++) {
			if (indiceBajo == indiceAlto) {
				return indice;
			}else if (array[i]>z) {
				z = array[i];
				indice = i;
			}
		}return indice;
	}
	
	public static int[] intercambiarIndices(int[]array, int indice1, int indice2) {
		int w = array[indice1];
		array[indice1] = array[indice2];
		array[indice2] = w;
		return array;
	}

	public static int[] ordenarArreglo(int [] array) {
		for(int i = 0;i<array.length;i++) {
			intercambiarIndices(array, maximoEnRango(array, i, array.length), i);
		}
		return array;
	}
	
	public static void main(String[] args) {
		int largo = 50;
		int [] array = ordenarArreglo(arrayAleatorio(largo, -50, 100));
		imprimirArray(array);
	}
	
}