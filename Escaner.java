import java.util.Scanner;
//importar el scanner, de otra manera no van a poder usarlo

public class Escaner {
	public static void main(String[] args) {
		//el nombre del scanner puede ser cualquiera
		Scanner pepe = new Scanner(System.in);

		//int se utiliza para enteros

		System.out.println("Ingrese un entero");
		int a = pepe.nextInt();
		//float se utiliza para numeros con coma
		System.out.println("Ingrese un numero con coma");
		float b = pepe.nextFloat();
		//String se utiliza para palabras
		System.out.println("Ingrese un string (palabra)");
		String s = pepe.nextLine();

		System.out.println("Vemos el contenido");
		System.out.println(a);
		System.out.println(b);
		System.out.println(s);

	}
}

