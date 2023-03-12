package Ej1;

public class Ej1b {
	public static void main(String[] args) throws Exception {
		/*b. Dados 3 números y un orden (ascendente o decreciente) que ordene los
		mismos y los retorne en un vector de 3*/
		int vector[] = {8,1,55, 6, 43, 6};
		int largoVector = vector.length;
		char orden = 'a'; //"d" descendente, "a" ascendente.
		
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
