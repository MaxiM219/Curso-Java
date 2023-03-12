package Guia4;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ejemplo_archivo {

	public static void main(String[] args) {
		String archivo = "C:\\Users\\Max\\Documents\\GitHub\\Curso-Java\\Guia_java\\src\\Guia4\\Ejemplo 4.txt";
		try {
		for (String linea : Files.readAllLines(Paths.get(archivo))){

			if(linea.startsWith("*")){

			System.out.println(linea);

			}

			}
		}
		catch(Exception e){
			System.out.println("Something went wrong.");
		}

	}

}
