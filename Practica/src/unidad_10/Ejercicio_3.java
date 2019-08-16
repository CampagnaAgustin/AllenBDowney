package unidad_10;

public class Ejercicio_3 {
	
	public static int[] arrayAleatorio(int n) {
		int [] array = new int[n];
		for (int i=0; i<array.length;i++) {
			array[i] = (int) (Math.random()*100 + 1);
		}
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		return array;
	}
	
	public static void histogramaNotas(int [] notas) {
		int[] cuentas = new int [11];
		for (int i = 0; i < notas.length; i++) {
		int indice = notas[i]/10 ;
		cuentas[indice]++;
		}
		for(int i=0;i<cuentas.length;i++) {
			if (i == 10) {
				System.out.println("cantidad de notas con " + (i*10) + " = " + cuentas[i]);
			} else
			System.out.println("cantidad de notas de " + (i*10) + " a " + ((i + 1)*10) + " = " + cuentas[i]);
		}
		
	}
	
	public static void main(String[] args) {
		histogramaNotas(arrayAleatorio(200));
			
		}
	}
