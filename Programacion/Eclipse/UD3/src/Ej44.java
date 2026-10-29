import java.util.Scanner;

public class Ej44 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String nombre = "", mynombre = "", nombresmisma = "", nombresmayor = "", nombresmenor = "";
		int DD = 16, MM = 8, AA = 0, MYDD = 16, MYMM = 8, MYAA = 2007, mimaEdad = 0, mayor = 0, menor = 0, total = 0;
		boolean valido = false;
//		System.out.println("Deme su nombre:");
//		mynombre = s.nextLine();
//		do {
//			System.out.println("Dame tu fecha (AA / MM / AAAA)");
//			MYDD = s.nextInt();
//			MYMM = s.nextInt();
//			MYAA = s.nextInt();
//			if (MYMM > 12 || MYMM <= 0) {
//				System.out.println("Mes no valido");
//			} else if (MYMM == 2 && (MYDD < 1 || MYDD > 28)) {
//				System.out.println("Dia no valido (1-28)");
//			} else if (MYMM % 2 == 0 && (MYDD < 1 || MYDD > 31)) {
//				System.out.println("Dia no valido (1-31)");
//			} else if (MYMM % 2 != 0 && (MYDD < 1 || MYDD > 30)) {
//				System.out.println("Dia no valido (1-30)");
//			} else
//				valido = true;
//		} while (!valido);
//		s.nextLine();
		while (true) {
			System.out.println("Deme nombre:");
			nombre = s.nextLine();
			if (nombre.equalsIgnoreCase("exit")) {
				break;
			}
			;
			do {
				System.out.println("Dame fecha (AA / MM / AAAA)");
				DD = s.nextInt();
				MM = s.nextInt();
				AA = s.nextInt();
				if (MM > 12 || MM <= 0) {
					System.out.println("Mes no valido");
				} else if (MM == 2 && (DD < 1 || DD > 28)) {
					System.out.println("Dia no valido (1-28)");
				} else if (MM % 2 == 0 && (DD < 1 || DD > 31)) {
					System.out.println("Dia no valido (1-31)");
				} else if (MM % 2 != 0 && (DD < 1 || DD > 30)) {
					System.out.println("Dia no valido (1-30)");
				} else
					valido = true;
			} while (!valido);
			s.nextLine();
			if (MM == MYMM && DD == MYDD) {
				if (AA == MYAA) {
					System.out.println("Tengo un amigo nuevo! Cumples años igual que "+nombre +"y teneis la misma edad!.");
					nombresmisma += nombre + ", ";
					mimaEdad++;
				} else if (AA < MYAA) {
					System.out.println("Tengo un amigo nuevo! Cumples años igual que "+nombre +" pero "+nombre+ " es "+(MYAA- AA) +"años más joven.");
					nombresmenor += nombre + ", ";
					menor++;
				} else if (AA > MYAA) {
					System.out.println("Tengo un amigo nuevo! Cumples años igual que "+nombre +" pero "+nombre+ " es "+(AA- MYAA) +"años más mayor.");
					nombresmayor += nombre + ", ";
					mayor++;
				}
				;
			}
			
			
		}
		System.out.println(nombresmayor);
		System.out.println(nombresmenor);
		System.out.println(nombresmisma);
	}

}
