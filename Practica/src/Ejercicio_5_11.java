
public class Ejercicio_5_11 {
	
	public static int mcd(int a, int b) {
		System.out.println("mcd(" + a + "," + b + ")");
		int r;
		if (a%b == 0) {
			return b;
		}else {
			r = a%b;
			a = b;
			b = r;
			return mcd(a, b);
		}
	}

	public static void main(String[] args) {
		System.out.println(mcd(125, 120));
	}
}