import java.util.Scanner;

public class Ej37 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int dia = 1, hora = 00, min = 00;
		String tdia = "", frase = "";

		do {
			System.out.println("En que dia de la semana te encuentras");
			dia = s.nextInt();
		} while (!(dia >= 1 && dia <= 7));
		do {
			System.out.println("En que hora te encuentras ahora ");
			hora = s.nextInt();
		} while (!(hora >= 0 && hora <= 24));
		do {
			System.out.println("En que minuto te encuentreas ahora");
			min = s.nextInt();
		} while (!(min >= 0 && min <= 60));

		switch (dia) {
		case 1:
			dia = 5 * 24;
			tdia = "Lunes";
			System.out.println("Deste del " + tdia + " a las " + hora + ":" + min + " faltan "
					+ ((((dia - hora) * 60) - min) - 600) + "min");

			break;
		case 2:
			dia = 4 * 24;
			tdia = "Martes";
			System.out.println("Deste del " + tdia + " a las " + hora + ":" + min + " faltan "
					+ ((((dia - hora) * 60) - min) - 600) + "min");

			break;
		case 3:
			dia = 3 * 24;
			tdia = "Miercoles";
			System.out.println("Deste del " + tdia + " a las " + hora + ":" + min + " faltan "
					+ ((((dia - hora) * 60) - min) - 600) + "min");

			break;
		case 4:
			dia = 2 * 24;
			tdia = "Jueves";
			System.out.println("Deste del " + tdia + " a las " + hora + ":" + min + " faltan "
					+ ((((dia - hora) * 60) - min) - 600) + "min");

			break;
		case 5:
			dia = 1 * 24;
			tdia = "Viernes";
			if (((((dia - hora) * 60) - min) - 600) <= 0) {
				System.out.println("Ya estas de Finde Semana");
			}else  {
				System.out.println("Deste del " + tdia + " a las " + hora + ":" + min + " faltan "
						+ ((((dia - hora) * 60) - min) - 600) + "min");
			};
			
			break;

		default:
			System.out.println("Ya estas de Finde Semana");
			break;
		}

	}

}
