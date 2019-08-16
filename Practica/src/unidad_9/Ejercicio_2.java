package unidad_9;

	class Fecha{
		int anio, mes, dia;
		
		public Fecha() {
			this.anio = 0;
			this.mes = 0;
			this.dia = 0;
		}
		
		public Fecha(int anio, int mes, int dia) {
			this.anio = anio;
			this.mes = mes;
			this.dia = dia;
		}
		
		public static void imprimirFecha(Fecha imp) {
			System.out.println(imp.dia + ":" + imp.mes + ":" + imp.anio);
		}
		
	}

public class Ejercicio_2 {

	public static void main(String[] args) {
		Fecha nacimiento1 = new Fecha(1997, 06, 25);
		Fecha.imprimirFecha(nacimiento1);
		Fecha nacimiento2 = new Fecha();
		nacimiento2.anio = 1997;
		nacimiento2.mes = 06;
		nacimiento2.dia = 25;
		Fecha.imprimirFecha(nacimiento2);

	}

}
