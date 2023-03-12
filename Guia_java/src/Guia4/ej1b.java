package Guia4;
import java.util.Scanner;

public class ej1b {
	public static void main(String[] args) {
		int vector[] = new int[3];
		int largoVector = vector.length;
		
		crear_vector_numeros(vector);
		
		char orden = elegir_orden(); 
		
		burbuja(vector, largoVector, orden);
		
		for(int i = 0; i < 3; i++) {
			System.out.println(vector[i]);
		}
	}

	
	static void crear_vector_numeros(int vector[]) {
		for(int i = 0; i < vector.length; i++) {
			System.out.println("Ingrese un numero (3 numeros en total) " + (i+1));
			Scanner numeros = new Scanner(System.in);
			int numero = numeros.nextInt();
			vector[i] = numero;
			
		}
	}
	
	static char elegir_orden() {
		System.out.println("Elige el orden 'a' ascendente/ 'd' descendente");
		Scanner letra = new Scanner(System.in);
		char orden = letra.next().charAt(0);
		return orden;
	}

	static void burbuja(int vector[], int largoVector, char orden) {
		
		for(int i = 0; i < largoVector; i++) {
			for(int j = 0; j < largoVector - i - 1; j++) {
				if(orden == 'a') {
					if(vector[j + 1] < vector[j]) {
						int aux = vector[j];
						vector[j] = vector[j + 1];
						vector[j + 1] = aux;
					}
				}
				else{
					if(vector[j + 1] > vector[j]) {
						int aux = vector[j];
						vector[j] = vector[j + 1];
						vector[j + 1] = aux;
					}
				}
			}
		}
	}

}
