package unidad_11_12;

public class Carta {

	int palo, valor;

	public Carta() {
		this.palo = 0;
		this.valor = 0;
	}

	public Carta(int p, int v) {
		this.palo = p;
		this.valor = v;
	}

	public static void imprimirCarta(Carta c) {
		String[] palos = { "Treboles", "Diamantes", "Corazones", "Picas" };
		String[] valores = { "nada", "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

		System.out.println(valores[c.valor] + " de " + palos[c.palo]);
	}

	public static void compararCartas(Carta carta1) {
		Carta carta2 = carta1;
		if (carta1 == carta2) {
			System.out.println("carta1 y carta2 son el mismo objeto.");
		}
	}

	public static boolean mismaCarta(Carta c1, Carta c2) {
		return (c1.palo == c2.palo && c1.valor == c2.valor);
	}

	public static int compararCarta(Carta c1, Carta c2) {
		if (c1.palo > c2.palo)
			return 1;
		if (c1.palo < c2.palo)
			return -1;
		if (c1.valor > c2.valor)
			return 1;
		if (c1.valor < c2.valor)
			return -1;
		return 0;

	}

	public static int compararCarta2(Carta c1, Carta c2) {
		if (c1.palo > c2.palo)
			return 1;
		if (c1.palo < c2.palo)
			return -1;
		if (c1.valor == 1) {
			c1.valor = 13;
		}
		if (c2.valor == 1) {
			c2.valor = 13;
		}
		if (c1.valor > c2.valor)
			return 1;
		if (c1.valor < c2.valor)
			return -1;
		return 0;

	}

	public static Carta[] generarMazo() {
		Carta[] mazo = new Carta[52];
		int indice = 0;
		for (int palo = 0; palo <= 3; palo++) {
			for (int valor = 1; valor <= 13; valor++) {
				mazo[indice] = new Carta(palo, valor);
				indice++;
			}
		}
		return mazo;
	}

	public static void imprimirMazo(Carta[] mazo) {
		for (int i = 0; i < mazo.length; i++) {
			imprimirCarta(mazo[i]);
		}
	}

	public static int buscarCarta(Carta[] mazo, Carta carta) {
		for (int i = 0; i < mazo.length; i++) {
			if (mismaCarta(mazo[i], carta))
				return i;
		}
		return -1;
	}

	public static int buscarBinario(Carta[] mazo, Carta carta, int desde, int hasta) {
		System.out.println(desde + ", " + hasta);
		if (hasta < desde)
			return -1;
		int medio = (hasta + desde) / 2;
		int comp = compararCarta(mazo[medio], carta);
		if (comp == 0) {
			return medio;
		} else if (comp > 0) {
			return buscarBinario(mazo, carta, desde, medio - 1);
		} else {
			return buscarBinario(mazo, carta, medio + 1, hasta);
		}
	}

	public static Carta leerCarta(String c) {
		int x = 5;
		int v = c.charAt(0);
		System.out.println(v);
		if (v > 49 && v < 58) {
			v = v - 48;
		} else if (v == 49) {
			v = 10;
			x = 6;
		} else if (v == 65 || v == 97) {
			v = 1;
		} else if (v == 74 || v == 106) {
			v = 11;
		} else if (v == 81 || v == 113) {
			v = 12;
		} else if (v == 75 || v == 107) {
			v = 13;
		}
		char p = c.charAt(x);
		if (p == 84 || p == 116) {
			p = 0;
		} else if (p == 68 || p == 100) {
			p = 1;
		} else if (p == 67 || p == 99) {
			p = 2;
		} else if (p == 80 || p == 112) {
			p = 3;
		} else {
			return null;
		}
		Carta carta = new Carta(p, v);
		return carta;
	}

	public static void main(String[] args) {
		Carta carta1 = new Carta(1, 2);
		imprimirCarta(carta1);
		System.out.println(buscarCarta(generarMazo(), carta1));
		System.out.println(buscarBinario(generarMazo(), carta1, 20, 51));
	}

}
