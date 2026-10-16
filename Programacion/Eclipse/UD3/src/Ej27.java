import java.util.Scanner;

public class Ej27 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double nota1 = 0, nota2 = 0, media = 0;
		boolean apto = false;
		String respuesta = "";
		do {
			System.out.println("Nota 1er Contol");
			nota1 = s.nextDouble();
		} while (nota1 < 0 || nota1 > 10);
		do {
			System.out.println("Nota 2er Contol");
			nota2 = s.nextDouble();
		} while (nota2 < 0 || nota2 > 10);
		media = (nota1 + nota2) / 2;
		s.nextLine();
		do {
			if (media < 5) {
				System.out.println("¿Cual ha sido el resultado de la recuperacion? (Apto / no apto )");
				respuesta = s.nextLine();
				if (respuesta.equalsIgnoreCase("apto")) {
					apto = true;
					media = 5;
				}
				;
			}
			;
		} while (!respuesta.equalsIgnoreCase("apto") && !respuesta.equalsIgnoreCase("no apto"));
		System.out.println("Tu nota media es " + media);
	}

}
