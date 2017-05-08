import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		//sabemos de antemano que vamos a iterar dos veces
		for (int i = 1; i <= 5; i++) {
			System.out.println("Iteracion numero: " + i);
			do {
				System.out.println("Ingrese un numero par pls");
				a = s.nextInt();
				if (a % 2 == 0) {
					System.out.println("Bieeeen");
				} else {
					System.out.println("RTFM");
				}
				//las iteraciones van a estar "trabadas" mientras
				//el numero no sea par
			} while (a % 2 != 0);
		}
	}	
}