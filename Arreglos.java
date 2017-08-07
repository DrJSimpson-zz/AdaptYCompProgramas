import java.util.Scanner;

public class Arreglos {
	
	public static void main(String[] args) {
		//cargamos puntajes de un juego por turnos
		//si tenemos 2 jugadores, la posicion 0 guarda el puntaje
		//del jugador 1 en el primer turno
		//la posición 1 guarda el puntaje del jugador 2 en el 
		//primer turno, y así sucesivamente
		Scanner s = new Scanner(System.in);
		System.out.println("Cuantos turnos se jugaron");
		//averiguamos cuantos turnos se jugaron
		int t = s.nextInt();
		int[] score = new int[t*2];

		//cargamos el puntaje para cada jugador para cada turno
		//de forma secuencial
		int turno = 1;
		int playersLeft = 2;
		for (int i = 0; i < score.length; i++) {
			if (i % 2 == 0) {
				System.out.println("jugador 1 turno " + turno);
			} else {
				System.out.println("jugador 2 turno " + turno);
			}	
			score[i] = s.nextInt();
			playersLeft--;
			if (playersLeft == 0) {
				turno++;
				playersLeft = 2;
			}
		}

		//averiguar quién ganó
		int jugador1 = 0;
		int jugador2 = 0;
		for (int i = 0; i < score.length; i++) {
			if (i % 2 == 0) {
				jugador1 += score[i];
			} else {
				jugador2 += score[i];
			}
		}

		if (jugador1 > jugador2) {
			System.out.println("Gano el jugador 1");
		} else if (jugador2 > jugador1) {
			System.out.println("Gano el jugador 2");
		} else {
			System.out.println("Perdieron los dos");
		}

		System.out.println("------------------");
		System.out.println("Ingrese el numero de ronda que desea ver");
		int ronda = s.nextInt();
		System.out.println("Score Jugador 1");
		System.out.println("?????");
		System.out.println("Score Jugador 2");
		System.out.println("?????");


	}

	public static void arreglosEj2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el tamaño del arreglo");
		int tamanio = sc.nextInt();
		//creo el arreglo con el tamaño que ingresa el usuario
		int[] ejemplo2 = new int[tamanio];
		System.out.println("A continuación ingrese " + ejemplo2.length + " numeros");
		//itero para cargar
		//nombreDelArreglo.length me retorna el tamaño del arreglo
		for (int i = 0; i < ejemplo2.length; i++) {
			ejemplo2[i] = sc.nextInt();
		}

		//por lógica, lo mas sencillo es iterar desde 0
		//hasta 1 antes del tamaño del arreglo
		//itero para mostrar
		System.out.println("-------------------------");
		System.out.println("Los numeros ingresados fueron");
		

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
