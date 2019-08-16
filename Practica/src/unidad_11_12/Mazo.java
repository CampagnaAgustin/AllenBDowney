package unidad_11_12;

public class Mazo {

	Carta[] cartas;

	public static int intAleatorio(int bajo, int alto) {
		int x = (int) (Math.random() * ((alto + 1) - bajo) + bajo);
		return x;
	}

	public Mazo(int n) {
		cartas = new Carta[n];
	}

	public Mazo() {
		cartas = new Carta[52];
		int indice = 0;
		for (int palo = 0; palo <= 3; palo++) {
			for (int valor = 1; valor <= 13; valor++) {
				cartas[indice] = new Carta(palo, valor);
				indice++;
			}
		}
	}

	public static void imprimirMazo(Mazo mazo) {
		for (int i = 0; i < mazo.cartas.length; i++) {
			Carta.imprimirCarta(mazo.cartas[i]);
		}
	}

	public static int buscarCarta(Mazo mazo, Carta carta) {
		for (int i = 0; i < mazo.cartas.length; i++) {
			if (Carta.mismaCarta(mazo.cartas[i], carta))
				return i;
		}
		return -1;
	}

	public static void intercambiarCartas(Mazo mazo, int x, int i) {
		Carta comodin = new Carta();
		comodin = mazo.cartas[x];
		mazo.cartas[x] = mazo.cartas[i];
		mazo.cartas[i] = comodin;
	}

	public static void mezclarMazo(Mazo mazo) {
		for (int i = 0; i < mazo.cartas.length; i++) {
			intercambiarCartas(mazo, intAleatorio(i, mazo.cartas.length - 1), i);
		}
	}

	public static int cartaMasBaja(Mazo mazo, int piso, int techo) {
		int indice = piso;
		Carta comodin = mazo.cartas[piso];
		for (int i = piso; i < techo; i++) {
			if (Carta.compararCarta(mazo.cartas[i], comodin) == -1) {
				comodin = mazo.cartas[i];
				indice = i;
			}
		}
		return indice;
	}

	public static void ordenarMazo(Mazo mazo) {
		int indice;
		for (int i = 0; i < mazo.cartas.length; i++) {
			indice = cartaMasBaja(mazo, i, mazo.cartas.length);
			intercambiarCartas(mazo, i, indice);
		}
	}

	public static Mazo subMazo(Mazo mazo, int menor, int mayor) {
		Mazo sub = new Mazo(mayor - menor + 1);
		for (int i = 0; i < sub.cartas.length; i++) {
			sub.cartas[i] = mazo.cartas[menor + i];
		}
		return sub;
	}

	public static void moverMazo(Mazo subMazo, Mazo mazo, int pisoSubmazo, int pisoMazo) {
		for (int i = pisoSubmazo; i < subMazo.cartas.length; i++) {
			mazo.cartas[pisoMazo] = subMazo.cartas[i];
			subMazo.cartas[i] = null;
			pisoMazo++;
		}
	}

	public static void intercambiarEntreMazos(Mazo mazo1, Mazo mazo2, int i, int j) {
		Carta comodin = mazo1.cartas[i];
		mazo1.cartas[i] = mazo2.cartas[j];
		mazo2.cartas[j] = comodin;
	}

	public static Mazo mergeSortSimple(Mazo mazo) {
		int medio = mazo.cartas.length / 2;
		Mazo sub1 = subMazo(mazo, 0, medio - 1);
		Mazo sub2 = subMazo(mazo, medio, mazo.cartas.length - 1);
		ordenarMazo(sub1);
		ordenarMazo(sub2);
		Mazo resultado = unir(sub1, sub2);
		return resultado;
	}

	public static Mazo mergeSort(Mazo mazo) {
		if (mazo.cartas.length <= 1) {
			return mazo;
		}
		int medio = mazo.cartas.length / 2;
		Mazo sub1 = subMazo(mazo, 0, medio - 1);
		Mazo sub2 = subMazo(mazo, medio, mazo.cartas.length - 1);
		mergeSort(sub1);
		mergeSort(sub2);
		Mazo resultado = unir(sub1, sub2);
		return resultado;
	}

	public static Mazo unir(Mazo mazo1, Mazo mazo2) {
		Mazo resultado = new Mazo(mazo1.cartas.length + mazo2.cartas.length);
		int i = 0;
		int j = 0;
		Carta c;
		for (int k = 0; k < resultado.cartas.length; k++) {
			if (i == mazo1.cartas.length) {
				System.out.println("Mazo 1 vacio");
				c = mazo2.cartas[j];
				j++;
			} else if (j == mazo2.cartas.length) {
				System.out.println("Mazo 2 vacio");
				c = mazo1.cartas[i];
				i++;
			} else {
				System.out.println("Lucha de mazos");
				int x = Carta.compararCarta(mazo1.cartas[i], mazo2.cartas[j]);
				if (x == -1) {
					c = mazo1.cartas[i];
					i++;
				} else {
					c = mazo2.cartas[j];
					j++;
				}
			}
			resultado.cartas[k] = c;
		}
		return resultado;
	}

	public static int buscarBinario(Mazo sub, Carta carta) {
		int medio = sub.cartas.length / 2;
		System.out.println(medio);
		int comp = Carta.compararCarta(sub.cartas[medio], carta);
		if (comp == 0) {
			return medio;
		} else if (comp > 0) {
			Mazo sub2 = subMazo(sub, 0, medio - 1);
			imprimirMazo(sub2);
			return buscarBinario(sub2, carta);
		} else {
			Mazo sub2 = subMazo(sub, medio + 1, sub.cartas.length-1);
			imprimirMazo(sub2);
			return buscarBinario(sub2, carta);
		}
	}

	public static void main(String[] args) {
		Mazo mazo = new Mazo();
		Carta carta = new Carta(0, 5);
		Mazo sub = subMazo(mazo, 0, 19);
		Carta.imprimirCarta(carta);
		imprimirMazo(sub);
		System.out.println(buscarBinario(sub, carta));
	}

}
