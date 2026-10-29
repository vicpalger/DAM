import java.util.Scanner;

public class Ej45 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		final char P = 'P', A = 'a', C = 'c', O = 'o';
		final double precioLetra = 5, precioMay = 10;
		int escritura = 1, ancho = 5, alto = 6, contP = 0, contA = 0, contC = 0, contO = 0;
		double precio = 0;
		do {
			System.out.println("Intrduzca Altura de la bandera");
			alto = s.nextInt();
			System.out.println("Intrduzca Anchura de la bandera");
			ancho = s.nextInt();
			if (alto < 4) {
				System.out.println("La altura deve de ser mayor o igual a 4");
			}
			;
			if (ancho < 4) {
				System.out.println("La anchura deve de ser mayor o igual a 4");
			}
			;
		} while (alto < 4 || ancho < 4);

		
		
		
		for (int i = 0; i < alto + 2; i++) {
			System.out.print("@");
			for (int j = 0; j < ancho; j++) {
				if (i == 0 || i == alto + 1) {
					System.out.print("@");
				} else {
					switch (escritura) {
					case 1:
						System.out.print(P);
						contP++;
						break;
					case 2:
						System.out.print(A);
						contA++;
						break;
					case 3:
						System.out.print(C);
						contC++;
						break;
					case 4:
						System.out.print(O);
						contO++;
						break;
					default:
						break;
					}
					if (escritura == 4) {
						escritura = 0;
					}
					escritura++;

				}
				;

			}

			System.out.print("@\n");
		}
		;
		precio = contP * precioMay + contA * precioLetra + contC * precioLetra + contO * precioLetra;
		System.out.println("Imprimir esta bandera costaria " + precio + "€ ya que hay que imprimir :");
		System.out.println("- " + contP + "letras P Por valor de :" + contP * precioMay);
		System.out.println("- " + contA + "letras a Por valor de :" + contA * precioLetra);
		System.out.println("- " + contC + "letras c Por valor de :" + contC * precioLetra);
		System.out.println("- " + contO + "letras o Por valor de :" + contO * precioLetra);

	}
}
