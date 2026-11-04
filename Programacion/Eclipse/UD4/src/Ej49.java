import java.util.Scanner;

public class Ej49 {

	public static void main(String[] args) {
		int dni = 0 , calc = 0;
		char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
				'L', 'C', 'K', 'E' };
		Scanner s = new Scanner(System.in);

		System.out.println("Dame el numero de tu DNI");
		dni = s.nextInt();
		calc = dni % 23;
		System.out.println("La letra de tu DNI es " + letras[calc]);
		System.out.println("Ti DNI quedaria "+dni + letras[calc]);

	}

}
