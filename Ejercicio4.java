/*
	Este ejercicio tiene un problema en la resolucion
	queda para ustedes repararlo ;)
*/

public class Ejercicio4 {
	public static void main(String[] args) {
		//contadores para la cantidad de multiplos
		int cantMult3 = 0;
		int cantMult5 = 0;
		int cantMult7 = 0;
		//iteramos hasta 20
		for (int i = 1; i <= 20; i++) {
			//si mod 3 da 0 es multiplo de 3
			if (i % 3 == 0) {
				cantMult3++;
				//sino si mod 5 da 0
			} else if (i % 5 == 0) {
				cantMult5++;
				//sino si...
			} else if (i % 7 == 0) {
				cantMult7++;
			}
		}
		System.out.println("Cantidad de multiplos de 3 " + cantMult3);
		System.out.println("Cantidad de multiplos de 5 " + cantMult5);
		System.out.println("Cantidad de multiplos de 7 " + cantMult7);
	}
}