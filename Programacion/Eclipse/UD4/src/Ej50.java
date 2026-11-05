import java.util.Scanner;

public class Ej50 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int menu = 0;
		String palabra = "", palabra2 = "";
		do {
			System.out.println(
					"\n1.- Longitud de una cadena\n2.- Comparación de dos cadenas\n3.- Concatenación de dos cadenas\n4.- Obtener subcadenas\n5.- Invertir cadenas\n6.- Es palíndromo\n9.- Salir ");
			menu = s.nextInt();
			s.nextLine();
			if (menu == 9)
				break;

			switch (menu) {
			case 1:
				System.out.println("Dame palabra");
				palabra = s.nextLine();
				System.out.println("La cantidad de letras es " + palabra.length());
				break;
			case 2:
				System.out.println("Dame palabra 1");
				palabra = s.nextLine();
				palabra = palabra.trim();
				System.out.println("Dame palabra 2");
				palabra2 = s.nextLine();
				palabra2 = palabra2.trim();
				if (palabra.equalsIgnoreCase(palabra2))
					System.out.println("Son iguales ");
				else {
					System.out.println("No son iguales ");
				}
				;
				break;
			case 3:
				System.out.println("Dame palabra 1");
				palabra = s.nextLine();
				palabra = palabra.trim();
				System.out.println("Dame palabra 2");
				palabra2 = s.nextLine();
				palabra2 = palabra2.trim();
				System.out.println(palabra + " " + palabra2);

				break;
			case 4:
				System.out.println("Dame palabra");
				palabra = s.nextLine();
				break;
			case 5:
				System.out.println("Dame palabra");
				palabra = s.nextLine();
				break;
			case 6:
				System.out.println("Dame palabra");
				palabra = s.nextLine();
				break;

			default:
				System.out.println("Opcion no valida ");
				break;
			}

		} while (true);
	}
}
