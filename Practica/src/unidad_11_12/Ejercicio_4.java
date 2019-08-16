package unidad_11_12;

public class Ejercicio_4 {
	
	public static int[] histoPalos(Carta[] mazo) {
		int[] histo = new int[4];
		for(int i = 0; i<mazo.length; i++) {
			histo[mazo[i].palo]++;
		}
		return histo;
	}
	
	public static void imprimirArray(int [] array) {
		String[] palos = { "Treboles", "Diamantes", "Corazones", "Picas"};
		for(int i = 0; i < array.length; i++) {
			System.out.println("Cantidad de " + palos[i] + " = " + array[i]);
		}
	}
	
	public static void main(String[] args) {
		imprimirArray(histoPalos(Carta.generarMazo()));
	}

}
