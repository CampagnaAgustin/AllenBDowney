package unidad_8;

import java.awt.*;

public class Ejercicio_3 {

	public static void imprimirPunto(Point p) {
		System.out.println("(" + p.x + ", " + p.y + ")");
	}

	public static Point buscarCentro(Rectangle caja) {
		int x = caja.x + caja.width / 2;
		int y = caja.y + caja.height / 2;
		return new Point(x, y);
	}

	public static void main(String[] args) {
		Rectangle caja1 = new Rectangle(2, 4, 7, 9);
		Point p1 = buscarCentro(caja1);
		imprimirPunto(p1);
		caja1.grow(1, 1);
		Point p2 = buscarCentro(caja1);
		imprimirPunto(p2);
	}

}
