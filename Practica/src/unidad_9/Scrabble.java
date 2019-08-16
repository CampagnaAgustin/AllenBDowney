package unidad_9;

class Ficha {
	char letra;
	int valor;

	public Ficha(char a, int x) {
		this.letra = a;
		this.valor = x;
	}
	
	public static Ficha probarFicha(char letra, int valor) {
		Ficha ficha1 = new Ficha(letra, valor);
		return ficha1;
	}
	
	public static void imprimirFicha(Ficha ficha1) {
		System.out.println("Letra: " + ficha1.letra + " Valor: " + ficha1.valor);
	}
	
}

public class Scrabble {

	public static void main(String[] args) {
		Ficha.imprimirFicha(Ficha.probarFicha('z', 10));
	}
	
}