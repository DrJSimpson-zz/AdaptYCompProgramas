import java.util.Scanner;

public class Condicional {
	public static void main(String[] args) {
		//System.out.println imprime un mensaje al stdout
		//stdout es la salida estandar (consola)
		System.out.println("Condicionales!");
		//Scanner es la clase que vamos a utilizar para leer del
		//teclado
		//s es el nombre de la variable
		Scanner s = new Scanner(System.in);
		//System.in es stdin (que es la entrada por teclado de consola)
		//nextInt nos devuelve un entero leido desde el teclado
		System.out.println("Ingrese un numero entero por teclado");
		int a = s.nextInt();
		System.out.println("Este es el valor leido por teclado");
		System.out.println(a);

		if (a > 10) {
			System.out.println("el valor es mayor a 10");
		} else {
			System.out.println("el valor es menor a 10");
		}
	}
}

