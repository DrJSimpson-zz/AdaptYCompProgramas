import java.util.Scanner;

public class Arreglos {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamanio = sc.nextInt();
		//
		int[] ejemplo2 = new int[tamanio];
		//itero para cargar
		//nombreDelArreglo.length me retorna el tamaño del arreglo
		for (int i = 0; i < ejemplo2.length; i++) {
			ejemplo2[i] = sc.nextInt();
		}

		//por lógica, lo mas sencillo es iterar desde 0
		//hasta 1 antes del tamaño del arreglo
		//itero para mostrar
		System.out.println("-------------------------");

		for (int i = 0; i < ejemplo2.length; i++) {
			System.out.println(ejemplo2[i]);
		}
	}

	public static void arreglosEj1() {
		//es imposible enumerar variables
		//y acceder de forma indexada
		//int a, b, c, d, e;
		Scanner s = new Scanner(System.in);

		//la solución son los arreglos
		int[] array = new int[5];
		//tipo de dato y [] dimensiones
		//accediendo a los índices con un literal
		array[0] = 10;
		array[1] = 45;
		array[2] = s.nextInt();
		array[3] = 78;
		array[4] = s.nextInt();

		//accedo utilizando valores literales
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
	}

}
