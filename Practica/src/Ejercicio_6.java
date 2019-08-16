
public class Ejercicio_6 {

	public static void verificar(double x) {
		System.out.println("x = " + x + "\t" + Math.exp(x) + "\t" + miExp(x, 12));

	}

	public static double miExp(double x, int n) {
		double e = 0;
		double y = 1;
		int f = 1;
		int i = 0;
		while (n > i) {
			e = e + (y / f);
			y = y * x;
			i = i + 1;
			f = f * i;
		}
		return e;
	}

	public static double gauss(double x, int n) {
		double e = 0;
		double y = 1.0;
		int f = 1;
		int i = 0;
		while (n > i) {
			System.out.println(e + "\t" + (i + 1) + "*" + y + "/" + f + "\t" + (i + 1) * y / f);
			e = e + ((i + 1) * y / f);
			y = y * x;
			i = i + 1;
			f = f * i;
		}
		return e;
	}

	public static void main(String[] arg) {
		verificar(0.1);
		verificar(1.0);
		verificar(10.0);
		verificar(100.0);
		verificar(-0.1);
		verificar(-1.0);
		verificar(-10.0);
		verificar(-100.0);
		System.out.println(gauss(2, 12));
	}

}
