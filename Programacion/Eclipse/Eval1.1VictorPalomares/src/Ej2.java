import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// Scaner
	Scanner s = new Scanner(System.in);

		// Declaracion de Variables Fijas
		final char caractaer = '1';

		// Declaracion de Variables
		int altura = 5, cantUnos = 0, cantUnosT = 1, cont = 0;

		// Pedida de altura de la torre 
		System.out.println("Introduzca altura ");
		do {
		altura = s.nextInt();
		}while(altura <= 0 );
		// pintado de la escalera
		for (int i = 1; i <= altura; i++) {
			while (cantUnos < i) {
				do {
					System.out.print("1");
					cont++;
				} while (cont != cantUnosT);
				System.out.print(" ");
				cont = 0;
				cantUnosT++;
				cantUnos++;
			}
			;
			
			cantUnosT = 1 ;
			cantUnos = 0;
			System.out.println("");
		}

	}

}
