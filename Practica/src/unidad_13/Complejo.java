package unidad_13;

public class Complejo {

	// variables de instancia
	double real, imag;

	// constructor
	public Complejo() {
		this.real = 0.0;
		this.imag = 0.0;
	}

	// constructor
	public Complejo(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	// método de objeto
	public double abs() {
		return Math.sqrt(real * real + imag * imag);
	}

	public Complejo sumar(Complejo b) {
		return new Complejo(real + b.real, imag + b.imag);
	}

	public void conjugar() {
		imag = -imag;
	}

	public String toString() {
		if (imag > 0) {
			return real + " + " + imag + "i";
		} else {
			return real + " " + imag + "i";
		}
	}

	public boolean equals(Complejo b) {
		if (b == null) {
			return false;
		} else
			return (real == b.real && imag == b.imag);
	}

	//public void normalizar() {
		//double d = this.abs();
		//real = real / d;
		//imag = imag / d;
	//}
	
	public Complejo normalizar() {
        return (new Complejo(real/abs(), imag/abs()));
    }
	
	public static void normalizar(Complejo z) {
		z.real = z.real/z.abs();
		z.imag = z.imag/z.abs();
	}
	
	public static boolean equals(Complejo x, Complejo y) {
		if (x.real == y.real && x.imag == y.imag) {
			return true;
		}return false;
	}

	public static void main(String[] args) {
		Complejo x = new Complejo(1, -1);
		System.out.println(x.normalizar());
	}

}
