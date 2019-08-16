package unidad_7;

public class Ejercicio_9 {

	public static String captainCrunch(String s, int x) {
		int i = 0;
		int l = s.length();
		char t;
		String coded = "";
		while (i < l) {
			int c = s.charAt(i);
			if (65 <= c && c <= 90) {
				c = c + x;
				if (c > 90) {
					c = c - 25;
				}
				t = (char) c;
				coded = coded + t;
			} else if (97 <= c && c <= 122) {
				c = c + x;
				if (c > 122) {
					c = c - 25;
				}
				t = (char) c;
				coded = coded + t;
			} else {
				coded = coded + " ";
			}
			i = i+1;
		}
		return coded;
	}
	
	public static String deCaptainCrunch(String s, int x) {
		int i = 0;
		int l = s.length();
		char t;
		String deCoded = "";
		while (i < l) {
			int c = s.charAt(i);
			if (65 <= c && c <= 90) {
				c = c - x;
				if (c < 65) {
					c = c + 25;
				}
				t = (char) c;
				deCoded = deCoded + t;
			} else if (97 <= c && c <= 122) {
				c = c - x;
				if (c < 97) {
					c = c + 25;
				}
				t = (char) c;
				deCoded = deCoded + t;
			} else {
				deCoded = deCoded + " ";
			}
			i = i+1;
		}
		return deCoded;
	}

	public static void main(String[] args) {
		int x = 13;
		String coded = captainCrunch("Capita es lo MAS", x);
		System.out.println(deCaptainCrunch(coded, x));
	}

}
