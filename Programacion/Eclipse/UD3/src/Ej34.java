import java.util.Scanner;

public class Ej34 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int horas = 0 , hora = 0 ;
		double salario_hora = 0, total= 0 ;
		do {
			System.out.println("Introduzca horas Trabajadas : ");
			horas = s.nextInt();
			if ( horas < 0) {
				System.out.println("Esa cantidad de oras no es valida ");
			}
			;
		} while (horas < 0);
		do {
			System.out.println("Introduzca salario por hora ");
			salario_hora = s.nextDouble();
			if (salario_hora < 0) {
				System.out.println("Horas no validas");
			}
			;
		} while (salario_hora < 0);
		
		if (horas-40 <= 0 ) {
			total =  (horas * (salario_hora));
		}else {
			hora = horas - 40;
			horas = 40;
			total = (horas * (salario_hora))+((hora *salario_hora)*1.50); 
			
		};
		
		System.out.println("Tu cobro de las horas extars seran; "+ total );
	};
}
