import java.util.Scanner;

public class Ej25 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int rango = 0, casado = 0, IRPF = 0;
		double sueldo_bruto = 0, viajes = 0 ,sueldo_neto = 0;
		do {
			System.out.println("Junior : 1\nSenior : 2\nJefe de Poyecto : 3");
			System.out.println("Que rango eres:");
			rango = s.nextInt();
			if (rango != 1 && rango != 2 && rango != 3) {
				System.out.println("\t!Carracter no valido¡");
			}
			;

		} while (rango != 1 && rango != 2 && rango != 3);
		do {
			System.out.println("Cuantos viajes has realizado visitando clientes ");
			viajes = s.nextDouble();
			if (viajes < 0) {
				System.out.println("\t!Carracter no valido¡");
			}
			;

		} while (viajes < 0);
		do {
			System.out.println("Si : 1 \nNo : 0 ");
			System.out.println("Estas Casado :");
			casado = s.nextInt();
			if (casado != 1 && casado != 0) {
				System.out.println("\t!Carracter no valido¡");
			}
			;

		} while (casado != 1 && casado != 0);
		switch (rango) {
		case 1:
			sueldo_bruto = 950;
			break;
		case 2:
			sueldo_bruto = 1200;
			break;
		case 3:
			sueldo_bruto = 1600;
			break;
		default:
			sueldo_bruto= 1600;
			break;
		}
		switch (casado) {
		case 1:
			IRPF = 20;
			break;
		case 0:
			IRPF = 25;
			break;
		default:
			IRPF= 25;
			break;
		}
		sueldo_neto = sueldo_bruto + viajes * 30 ;
		System.out.println("=========================================");
		System.out.println("= Sueldo Inicial \t:\t" + sueldo_bruto + "\t=");
		System.out.println("= Dietas (" + viajes + "Viajes) \t:\t" + (viajes * 30) + "\t=");
		System.out.println("=========================================");
		System.out.println("Sueldo \t:\t"+sueldo_neto+ "\t=");
		

	}

}
