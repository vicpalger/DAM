import java.util.Scanner;

public class Ej26 {

	public static void main(String[] args) {
		double total = 0, altura = 0, anchura = 0, m2 = 0;
		boolean bordado = false;
		short respuesta = 'q';
		
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Introduzca la altura deeseada:");
			altura = s.nextDouble();
			System.out.println("Introduzca la anchura deeseada:");
			anchura = s.nextDouble();
			if (altura <= 0 || anchura <= 0)
				System.out.println("Medidas incorrectas (<= 0 )");

		} while (altura <= 0 || anchura <= 0);
		s.nextLine();
		do {
		System.out.println("Desea usted el escudo bordado (s/n)");
		respuesta  = s.nextShort();
		System.out.println(respuesta != 's');
		} while (respuesta != 's' && respuesta != 'S' && respuesta != 'n' && respuesta != 'N'); 
	
}
}


