Este es un ejemplo de sentencias usando pseudocódigo

int, float = numero
String = string

if = si() {}
!= <- Distinto
== <- igual
mayor, menor, mayor igual, menor igual = >, <, >=, <=
for = para() {}
while = mientras() {}
do while = hacer {} mientras ()

nextInt, nextFloat, etc = leerNumero()
nextLine = leerString()

Ejemplos:

numero i = leerNumero();
//esto itera empezando por 0, incrementa el contador de a 1
//es decir 0, 1, 2, 3... hasta i, que es ingresado por teclado
para (0 hasta i) {
	mostrar("Iteracion numero " + i)
}

//leer un numero mientras no sea par
hacer {
	int a = leerNumero()
} mientras (a mod 2 != 0)
