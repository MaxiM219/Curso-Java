package Guia4;

public class ejemplo_funcion {

	public static void main(String[] args) {
		String palabras = "";
		char letra = 'a';
		System.out.println(contarLetra(palabras, letra));
		
		
		

	}
	public static int contarLetra(String unaPalabra, char letra){

		int cuenta = 0;

		for (int i = 0; i<unaPalabra.length(); i++){

		if(unaPalabra.charAt(i)  == letra){

		cuenta = cuenta + 1;

		}

		}

		return cuenta;

		}

}
