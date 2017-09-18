import java.util.Scanner;

public class OOPAlumno {

	public static void main(String[] args) {
		//creo un arreglo de variables de tipo Alumno
		Alumno[] arreglo = new Alumno[4];
		//Itero y llamo al metodo que crea un alumno
		for(int i = 0; i < arreglo.length; i++) {
			arreglo[i] = Alumno.crearAlumno();
		}
		for(int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
	}

}

//Esta clase va a estar afuera de la clase main

/*
Crear un método que se llame obtener apodo, este método tiene que devolver
las dos primeras letras del nombre, y las tres primera del apellido.

Crear un método que devuelva la dirección de correo que tendría esta persona
por ejemplo, para: "Pepe Potamo" sería pepe.potamo@simonEET24.com.ar

Crear un arreglo con 10 alumnos cargados al azar, mostrar el nombre y apellido
de la persona mas alta, y de la persona mas baja.
*/
class Alumno {
	//Atributos de la clase
	String nombre;
	String apellido;
	double estatura;

	//IMPORTANTE si hacen un metodo como este
	//tiene que ser si o si "static"
	public static Alumno crearAlumno() {
		Scanner s = new Scanner(System.in);
		String nombre, apellido;
		double estatura;
		
		System.out.println("Ingresando datos del Alumno");
		System.out.println("Ingrese el nombre");
		nombre = s.nextLine();
		System.out.println("Ingrese el apellido");
		apellido = s.nextLine();
		System.out.println("Ingrese la estatura");
		estatura = s.nextDouble();
		
		return new Alumno(nombre,apellido,estatura);
	}
	
	//Los constructores devuelven objetos nuevos
	//creados usando como molde la clase
	//Este metodo se llama constructor parametrizado
	//y se puede generar con la IDE
	public Alumno(String nombre, String apellido, double estatura) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.estatura = estatura;
	}
	
	//constructor por defecto, crea un objeto Alumno vacío
	public Alumno() {
		super();
	}

	//Este metodo muestra el estado de un objeto en forma
	//de cadena de caracteres
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", estatura=" + estatura + "]";
	}
}
