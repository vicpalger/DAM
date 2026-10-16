import java.util.Scanner;

public class Ej27 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double nota1 = 0, nota2 = 0, media = 0;
		boolean apto = true;
		String respuesta = "";
		do {
			System.out.println("Nota 1er Contol");
			nota1 = s.nextDouble();
		} while (nota1 < 0 || nota1 > 10);
		do {
			System.out.println("Nota 2er Contol");
			nota2 = s.nextDouble();
		} while (nota2 < 0 || nota2 > 10);

	}

}
