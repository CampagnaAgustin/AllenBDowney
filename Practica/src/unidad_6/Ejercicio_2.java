package unidad_6;

public class Ejercicio_2 {

	public static int parentesis(String s) {
		int largo = s.length();
		int i = 0;
		int cont = 0;
		while (i < largo) {
			System.out.print(s.charAt(i));
			char c = s.charAt(i);
			if (c == '(') {
				cont = cont + 1;
			} else if (c == ')') {
				cont = cont - 1;
			}
			i = i + 1;
		}
		System.out.println(cont);
		return cont;

	}

	public static void main(String [] arg) {
		
		parentesis("(()))");
		
	}
	
}
