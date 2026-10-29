import java.util.Scanner;

public class Ej42 {

	public static void main(String[] args) {
		int altura = 0, anchura = 0;
		Scanner s = new Scanner(System.in);
		String nom= "";
		do {
			System.out.println("Introduzca altura");
			altura = s.nextInt();
			System.out.println("Introduzca anchura");
			anchura = s.nextInt();
			s.nextLine();
			
			if (anchura < 4)
				System.out.println("La anchura minima es de 4 ");
			;
			if (altura < 4)
				System.out.println("La altura minima es de 4 ");
		} while (altura < 4 || anchura < 4);
		System.out.println("Introduzca Nombre ");
		nom = s.nextLine();
		System.out.println("");
		System.out.println("\n \t "+nom);
		for (int i = 1; i <= altura; i++) {
			for (int j = 1; j <= anchura; j++) {
				if (i % 2 == 0)
					System.out.print("=");
				else
					System.out.print("*");
				;
			}
			;
			System.out.println("");
		}
		;
	}

}
