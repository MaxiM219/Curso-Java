package Guia4;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		/*2. Haga una main donde por parámetro envíe la ruta de un archivo. Ese archivo debe
		contener números. El programa debe escribir por consola la suma de esos números
		
		a. Al programa anterior agreguele un parámetro para que la operación pueda ser
		suma o multiplicación.*/
		
		String rutaArchivo = "C:\\Users\\Max\\Documents\\GitHub\\Curso-Java\\Guia_java\\bin\\Guia4\\numeros.txt";
		char operacion = elegirOperacion();
		int resultado = opcionElegida(operacion, rutaArchivo);
		
		System.out.println("El resultado es: " + resultado);
	}
	
	static char elegirOperacion() {
		System.out.println("Elige una operacion: 's' sumar / 'm' multiplicar: ");
		Scanner letra = new Scanner(System.in);
		char operacion = letra.next().charAt(0);
		return operacion;	
	}
	
	static int sumarNumeros(String rutaArchivo) {
		//Suma los numeros 
		int resultado = 0;
		try {
		for(String linea : Files.readAllLines(Paths.get(rutaArchivo))) {
			String numeros[] = linea.split(" ");
			for(int i = 0; i < numeros.length; i++) {
				//Integer.parseInt() para pasar de String a Int.  
				//System.out.println(numeros[i]); //Muestra los numeros del archivo.
				//System.out.println(resultado); //Suma de los numeros
				resultado += Integer.parseInt(numeros[i]);
				}
			
			}
		} catch(Exception e) {
			System.out.println("Algo salio mal");
		}
		
		return resultado;
	}
	
	static int multiplicarNumeros(String rutaArchivo) {
		int resultado = 1;
		try {
		for(String linea : Files.readAllLines(Paths.get(rutaArchivo))) {
			String numeros[] = linea.split(" ");
			for(int i = 0; i < numeros.length; i++) { 
				//Integer.parseInt() para pasar de String a Int. 
				//System.out.println(numeros[i]);
				//System.out.println(resultado); //Multiplicacion
				resultado *= Integer.parseInt(numeros[i]);
				}
			
			}
		} catch(Exception e) {
			System.out.println("Algo salio mal");
		}
		
		return resultado;
	}
	
	static int opcionElegida(char operacion, String rutaArchivo) {
		if(operacion == 's') {
			return sumarNumeros(rutaArchivo);
		}
		else if(operacion == 'm') {
			return multiplicarNumeros(rutaArchivo);
		}
		else{
			//Devuelve 0 si no se eligio correctamente la opcion.
			return 0;
		}
	}
}
