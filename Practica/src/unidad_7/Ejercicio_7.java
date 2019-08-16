package unidad_7;

public class Ejercicio_7 {

	public static boolean esDuodroma (String s) {
		int i = 0;
		int l = s.length();
		while (i < l) {
			if (s.charAt(i) == s.charAt(i+1)) {
				i = i+2;
			}else 
				return false;
		}
		return true;
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(esDuodroma ("ddllloo"));
	}

}
