package Ej1;

public class Ej1a {
	public static void main(String[] args) throws Exception {
		/*a. Dado un String y una letra, que cuente la cantidad de apariciones de la letra en
		el String.*/
        String texto1 = "Hola que tal?";
        char caracter = 'a';
        int contador = 0;
        
        for(int c = 0; c < texto1.length(); c++) {
        	if(texto1.charAt(c) == caracter) {
        		contador += 1;
        	}
        }
        System.out.println(contador); //Tiene que haber 2 "a"
	}
}