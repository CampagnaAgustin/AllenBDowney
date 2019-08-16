
public class Testing {

	public static void imprimirLogaritmo(double x) {
		if (x <= 0.0) {
			System.out.println("Solo numeros positivos, por favor.");
			return;
		}
		double resultado = Math.log(x);
		System.out.println("El logaritmo de x es " + resultado);
	}
	
	public static int factorial (int n) {
		if (n == 0) {
		return 1;
		} else {
		return n * factorial (n-1);
		}
		}

	public static void main(String[] args) {
		imprimirLogaritmo(0);
		System.out.println(factorial(12));
		String a = "Paralelipipedo";
		System.out.println(a.indexOf('a', 4));
		int i = 1;
		System.out.println (i++);
		System.out.println (i++);
		char c = '`';
		int d = c;
		c = (char)d;
		System.out.println(d);
	}
}
