
public class Suma {

	//Aumenta el primer valor ingresado para igualarlo al seguno
	public static int igualarMAN(int m, int n) {
		System.out.println("Para metUno el valor de m es: " + m + ", y el valor de n es: " + n);
		if (m == n) {
			return n;
		} else {
			return m + igualarMAN(m + 1, n);
		}
	}
	
	//Decrece el segundo valor ingresado para igualarlo al primero
	public static int igualarNAM(int m, int n) {
		System.out.println("Para metDos el valor de m es: " + m + ", y el valor de n es: " + n);
		if (m == n) {
			return n;
		} else {
			return n * igualarNAM(m, n - 1);
		}
	}

	public static void main(String[] args) {
		int m=1,n=5;
		igualarMAN(m,n);
		igualarNAM(m,n);

	}

}
