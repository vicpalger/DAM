import java.util.Random;
import java.util.Scanner;

public class Ej55 {
	public static void main(String[] args) {
		Random r= new Random();
		Scanner s = new Scanner(System.in);
		int opcion = 0, tamano = 0;
		System.out.println("Introduzca tamaño del array");
		tamano = s.nextInt();
		int[] array = new int[tamano];
		while (true) {
			System.out.println(
					"------------- Pulse una opción del menú:-------------\n 1-Rellenar vector por teclado\n 2-Rellenar vector de forma aleatoria (nums de 1 a 100)\n 3-Modificar una posición del vector\n 4-Consultar una posición del vector\n 5-Mostrar todo el vector\n 6-Ordenar ascendentemente el vector\n 9-Salir\n ----------------------------------------------------");
			opcion = s.nextInt();
			if (opcion == 9)break;
			switch (opcion) {
			case 1:
				for (int i = 0; i < array.length; i++) {
					System.out.print("Caracter " +(i+1)+ "/"+ array.length+"\t:");
					array[i] = s.nextInt();
				}
				break;
			case 2:
				for (int i = 0; i < array.length; i++) {
					array[i] = s.nextInt();
				}
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				
				break;
			case 8:
				
				break;

			default:
				System.out.println("NO es una opcion");
				break;
			}
		}
	}
}
