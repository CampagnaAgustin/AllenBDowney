package unidad_9;

public class Testing {

	class Tiempo {
		int hora, minuto;
		double segundo;

		public Tiempo() {
			this.hora = 0;
			this.minuto = 0;
			this.segundo = 0.0;
		}

		public Tiempo(int hora, int minuto, double segundo) {
			this.hora = hora;
			this.minuto = minuto;
			this.segundo = segundo;
		}

		public void main(String[] args) {
			// una forma de crear e inicializar un objeto Tiempo
			Tiempo t1 = new Tiempo();
			t1.hora = 11;
			t1.minuto = 8;
			t1.segundo = 3.14159;
			System.out.println(t1);
			// otra manera de hacer lo mismo
			Tiempo t2 = new Tiempo(11, 8, 3.14159);
			System.out.println(t2);
		}
	}

}
