import java.util.Scanner;

public class Ej24 {

	public static void main(String[] args) {
		int puntos = 0;
		char rest = ' ';
		Scanner s = new Scanner(System.in);
		System.out.println("Contesta con v o f ");
		System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
		rest = s.nextLine().charAt(0);
		if (rest == 'v') {
			puntos = puntos + 3;
		}
		;
		System.out.println("2. Ha aumentado sus gastos de vestuario.");
		rest = s.nextLine().charAt(0);
		if (rest == 'v') {
			puntos = puntos + 3;
		}
		;
		System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti.");
		rest = s.nextLine().charAt(0);
		if (rest == 'v') {
			puntos = puntos + 3;
		}
		;
		System.out.println("4. Ahora se asea con más frecuencia.");
		rest = s.nextLine().charAt(0);
		if (rest == 'v') {
			puntos = puntos + 3;
		}
		;
		System.out.println("5. No te deja que mires la agenda de su teléfono móvil.");
		rest = s.nextLine().charAt(0);
		if (rest == 'v') {
			puntos = puntos + 3;
		}
		;
		System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante.");
		rest = s.nextLine().charAt(0);
		if (rest == 'v') {
			puntos = puntos + 3;
		}
		;
		System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.");
		rest = s.nextLine().charAt(0);
		if (rest == 'v') {
			puntos = puntos + 3;
		}
		;
		System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.");
		rest = s.nextLine().charAt(0);
		if (rest == 'v') {
			puntos = puntos + 3;
		}
		;
		System.out.println("9. Has notado que últimamente se perfuma más.");
		rest = s.nextLine().charAt(0);
		if (rest == 'v') {
			puntos = puntos + 3;
		}
		;
		System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.");
		rest = s.nextLine().charAt(0);
		if (rest == 'v') {
			puntos = puntos + 3;
		}
		;
		if (puntos < 10)
			System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel");
		else if (puntos > 10 && puntos < 22)
			System.out.println(" Quizás exista el peligro de otra persona en su vida o en su mente, aunque\n"
					+ "seguramente será algo sin importancia. No bajes la guardia.");
		else
			System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra\n"
					+ "persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");

	}

}
