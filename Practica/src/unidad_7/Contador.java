package unidad_7;

public class Contador {

	public static void contarLetras(String palabra, char letra) {
		int contador = 0;
		int indice = 0;
		while (palabra.indexOf(letra, indice) != -1) {
			contador = contador + 1;
			indice = palabra.indexOf(letra, indice) + 1;
		}
		System.out.println(contador);

	}

	public static void main(String[] args) {
		contarLetras("menem", 'o');
	}

}
