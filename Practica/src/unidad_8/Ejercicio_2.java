package unidad_8;

import java.awt.*;

public class Ejercicio_2 {

	public static double distancia(Point p1, Point p2) {
		int dx = p1.x - p2.x;
		int dy = p1.y - p2.y;
		return Math.sqrt(dx * dx + dy * dy);
	}

	public static Point buscarCentro(Rectangle caja) {
		int x = caja.x + caja.width / 2;
		int y = caja.y + caja.height / 2;
		return new Point(x, y);
	}

	public static void main(String[] args) {
		Point nada = new Point(5, 8);
		Rectangle rect = new Rectangle(0, 2, 4, 4);
		Point centro = buscarCentro(rect);
		double dist = distancia(centro, nada);
		System.out.println(dist);
	}

}
