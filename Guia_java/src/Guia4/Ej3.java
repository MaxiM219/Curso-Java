package Guia4;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		/*
		3. Tome el ejercicio B de la clase 3 y que por parámetro se pueda elegir si es una
		codificación o decodificación, el valor del desplazo, y 2 archivos, uno para la entrada y
		otro para la salida. Que por pantalla solo indique si terminó o no correctamente, los
		resultados deben estar en el archivo de salida
		*/
		
		String rutaArchivo = "C:\\Users\\Max\\Documents\\GitHub\\Curso-Java\\Guia_java\\bin\\Guia4\\texto.txt";
		String rutaCodificada = "C:\\Users\\Max\\Documents\\GitHub\\Curso-Java\\Guia_java\\bin\\Guia4\\texto_codificado.txt";
		String rutaDescodificada = "C:\\Users\\Max\\Documents\\GitHub\\Curso-Java\\Guia_java\\bin\\Guia4\\texto_decodificado.txt";
		String letras = "abcdefghijklmnñopqrstuvwxyz ";
		char opcion = elegirAccion();
		//System.out.println(opcion); //Imprime la letra elegida.
		int desplaz = valor_desplaz();
		//System.out.println(desplaz);
		if(opcion == 'c') {
			codificarCadena(desplaz, letras, rutaArchivo, rutaCodificada);
		}
		else if(opcion == 'd') {
			decodificarCadena(desplaz, letras, rutaCodificada, rutaDescodificada);
		}
		System.out.println("Todo OK.");
	}
	
	static char elegirAccion() {
		char opcion = '\0';
		boolean noEsLetra = true;
		while(noEsLetra) {
			System.out.println("Elige una letra 'c' codificar / 'd' decodificar: ");
			Scanner letra = new Scanner(System.in);
			opcion = letra.next().charAt(0);
			if(opcion == 'c' || opcion == 'd') {
				noEsLetra = false;
			}	
		}
		return opcion;	
	}
	
	static int valor_desplaz() {
		System.out.println("Elige un numero para desplazar: ");
		Scanner numero = new Scanner(System.in);
		int valor = numero.nextInt();
		return valor;
	}
	
	static void codificarCadena(int desplaz, String letras, String rutaArchivo, String rutaDestino) {
		int cantLetras = letras.length();
		boolean estaEscrito = false;
		
		try {
			for(String lineas :  Files.readAllLines(Paths.get(rutaArchivo))) {
				String nuevaCadena = "";
				for(int c = 0; c < lineas.length(); c++) {
					int nuevoIndice = (letras.indexOf(lineas.charAt(c)) + desplaz) % cantLetras;
					nuevaCadena += letras.charAt(nuevoIndice);
				}
				if(estaEscrito == false) {
					Files.writeString(Paths.get(rutaDestino), nuevaCadena + "\n");
					estaEscrito = true;	
				}
				else if(estaEscrito == true) {
					Files.writeString(Paths.get(rutaDestino), nuevaCadena + "\n", StandardOpenOption.APPEND);
				}	
			}
		} catch(Exception e) {
			System.out.println("Algo salio mal");
			}
	}
	
	static void decodificarCadena(int desplaz, String letras, String rutaArchivo, String rutaDestino) {
		int cantLetras = letras.length();
		boolean estaEscrito = false;
		
		try {
			for(String lineas :  Files.readAllLines(Paths.get(rutaArchivo))) {
				String nuevaCadena = "";
				for(int c = 0; c < lineas.length(); c++) {
					int nuevoIndice = (letras.indexOf(lineas.charAt(c)) + (cantLetras - desplaz)) % cantLetras;
					nuevaCadena += letras.charAt(nuevoIndice);
				}
				if(estaEscrito == false) {
					Files.writeString(Paths.get(rutaDestino), nuevaCadena + "\n");
					estaEscrito = true;	
				}
				else if(estaEscrito == true) {
					Files.writeString(Paths.get(rutaDestino), nuevaCadena + "\n", StandardOpenOption.APPEND);
				}	
			}
		} catch(Exception e) {
			System.out.println("Algo salio mal");
			}
	}
	
	/*static String decodificarCadena(int desplaz, String cadena, String letras) {
		String viejaCadena = "";
		int cantLetras = letras.length();
		
		for(int c = 0; c < cadena.length(); c++) {
			int nuevoIndice = (letras.indexOf(cadena.charAt(c)) + (cantLetras - desplaz)) % cantLetras;
			viejaCadena += letras.charAt(nuevoIndice);
		}
		return viejaCadena;*/
	

}
