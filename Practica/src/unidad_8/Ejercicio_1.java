package unidad_8;

import java.awt.Point;

public class Ejercicio_1 {

	public static void main(String[] args) {
		int x = 5;
		Point nada = new Point(1, 2);
		System.out.println(pepe(x, nada));
		System.out.println(x);
		System.out.println(nada.x);
		System.out.println(nada.y);
	}

	public static int pepe(int x, Point p) {
		x = x + 7;
		return x + p.x + p.y;
	}

}
