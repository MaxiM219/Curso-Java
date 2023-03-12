package Ej1;

public class Ej1c {
	public static void main(String[] args) throws Exception {
		/*c. dado un vector de números, y un número X, que sume todos los números > X y
		retorne el resultado*/
		int vector[] = {3,4,5,46,2,3,6,0,1,3,55,32};
		int num = 7;
		
		System.out.println(sumatoria(vector, num));
		
	}
	
	private static int sumatoria(int vector[], int num) {
		int sumatoria = 0;
		for(int i = 0; i < vector.length; i++) {
			if(vector[i] > num) {
				sumatoria += vector[i];
			}
		}
		
		return sumatoria;
	}
}
