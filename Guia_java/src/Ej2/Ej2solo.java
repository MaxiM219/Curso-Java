package Ej2;

public class Ej2solo {
	public static void main(String[] args) throws Exception {
		/*Genere una clase que tenga los métodos para realizar la codificación y decodificación
		de un string, dado un número de desplazamiento.*/
		
		String letras = "abcdefghijklmnñopqrstuvwxyz ";
		int desplaz = 1;
		String cadena = "hola que tal";
		
		
		String codificado = codificarCadena(desplaz, cadena, letras);
		System.out.println("Cadena Codificada: " + codificado);
		
		String decodificado = decodificarCadena(desplaz, codificado, letras);
		System.out.println("Cadena Decodificada: " + decodificado);
		}
	
	static String codificarCadena(int desplaz, String cadena, String letras) {
		String nuevaCadena = "";
		int cantLetras = letras.length();
		
		for(int c = 0; c < cadena.length(); c++) {
			int nuevoIndice = (letras.indexOf(cadena.charAt(c)) + desplaz) % cantLetras;
			//Dada la posicion de la letra en la cadena con .charAt() obtenemos la letra,
			//luego con letras.indexOf(letra de la cadena) obtengo el indice de la letra.
			//Con el indice de la letra lo sumo con el desplazamiento y
			//luego obtengo el resto que ese va a ser el nuevo indice de la sig. letra.
			nuevaCadena += letras.charAt(nuevoIndice); //Con la nueva posicion de la letra,
			//con .charAt() obtenemos la nueva letra.
		}
		return nuevaCadena;
	}
	
	static String decodificarCadena(int desplaz, String cadena, String letras) {
		String viejaCadena = "";
		int cantLetras = letras.length();
		
		for(int c = 0; c < cadena.length(); c++) {
			int nuevoIndice = (letras.indexOf(cadena.charAt(c)) + (cantLetras - desplaz)) % cantLetras;
			viejaCadena += letras.charAt(nuevoIndice);
		}
		return viejaCadena;
	}
		
	}
