import java.util.Scanner;

public class Ej38 {

	public static void main(String[] args) {
		int filas = 7;
		Scanner s = new Scanner(System.in);
		do {
		System.out.println("Dame numero de filas (Mayor que 5 y tine que ser impar )");
		filas = s.nextInt();
		}while( filas%2 == 0 || filas < 5 );
		
		
		for (int f = 0; f <= filas; f++) {
			for (int c = 0; c <= 6; c++) {
				if (f == 0 || f == filas - 1 || f == filas / 2 || c == 0 && f != filas|| c == 6 && f != filas)
					System.out.print("M");
				else
					System.out.print(" ");
			}
			;
			System.out.println("");
		}

		;

	}

}
