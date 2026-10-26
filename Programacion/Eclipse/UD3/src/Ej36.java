import java.util.Scanner;

public class Ej36 {

	public static void main(String[] args) {
		final int matric_A = 150, matric_B = 325, matric_C = 520, matric_D = 610, prect_A = 15, prect_B = 21,
				prect_C = 36, prect_D = 50;
		String tipo = "A";
		int total = 0, cant_prac = 0;
		Scanner s = new Scanner(System.in);

		do {
			System.out.println("Tipo De Carnet");
			tipo = s.nextLine();
		} while (!tipo.equalsIgnoreCase("A") && !tipo.equalsIgnoreCase("B") && !tipo.equalsIgnoreCase("C")
				&& !tipo.equalsIgnoreCase("D"));
do {
		System.out.println("Cantidad de practicas");
		cant_prac = s.nextInt();}while(cant_prac < 0);
		tipo = tipo.toUpperCase();
		switch (tipo) {
		case "A":
			total = +matric_A + prect_A * cant_prac;
			break;
		case "B":
			total = +matric_B + prect_B * cant_prac;
			break;
		case "C":
			total = +matric_C + prect_C * cant_prac;
			break;
		case "D":
			total = +matric_D + prect_D * cant_prac;
			break;

		default:
			break;
		}
		System.out.println(total);
	}

}
