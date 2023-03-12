package Guia4;

public class Ej1a {

	public static void main(String[] args) {
		int vector[] = {6,9,5};
		int largoVector = vector.length;
		char orden = 'a';
		burbuja(vector, largoVector, orden);
		for(int i = 0; i < largoVector; i++) {
			System.out.println(vector[i]);
		}

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
