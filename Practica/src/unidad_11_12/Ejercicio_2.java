package unidad_11_12;

public class Ejercicio_2 {

	public static int intAleatorio(int bajo, int alto) {
			int x = (int) (Math.random()*((alto + 1)-bajo) + bajo);
			return x;
	}
	
	public static int puntajeMano(Carta[] mazo) {
		int puntaje = 0;
		int puntos;
		Carta carta = new Carta();
		for(int i=0; i<4; i++) {
			carta = mazo[intAleatorio(0,51)];
			Carta.imprimirCarta(carta);
			puntos = carta.valor;
			if (puntos == 11 || puntos == 12 || puntos == 13) {
				puntos = 10;
			}
			puntaje = puntaje + puntos;
		}
		if (puntaje == 21) {
			System.out.println("Black Jack");
		}
		return puntaje;
	}
	
	public static boolean color(Carta[] mazo) {
		int palo1 = mazo[intAleatorio(0,51)].palo;
		int palo2;
		System.out.println(palo1);
		for(int i=0; i<4; i++) {
			palo2 = mazo[intAleatorio(0,51)].palo;
			System.out.println(palo2);
			if (palo1 != palo2) {
				return false;
			}
		}return true;
	}
	
	public static void main(String[]args) {
		System.out.println(puntajeMano(Carta.generarMazo()));
		System.out.println(color(Carta.generarMazo()));
	}
	
	
}
