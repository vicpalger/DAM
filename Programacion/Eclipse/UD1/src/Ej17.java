import java.util.Scanner;

public class Ej17 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String nombre = "";
		int ID = 0;
		double nota1 = 0 ,nota2 = 0 , nota3 =0 , total_notas = 0 ;
		System.out.println("Introduzca Id de alumno");
		ID = s.nextInt();
		s.nextLine();
		System.out.println("Introduzca Nombre de alumno");
		nombre= s.nextLine();
		System.out.println("Introduzca Nota1 de alumno");
		nota1 = s.nextDouble();
		total_notas = total_notas+ nota1;
		System.out.println("Introduzca Nota2 de alumno");
		nota2 = s.nextDouble();
		total_notas = total_notas+ nota2;
		System.out.println("Introduzca Nota3 de alumno");
		nota3 = s.nextDouble();
		total_notas = total_notas+ nota3;
		System.out.println("Alumno: "+ ID+"-"+nombre+"\tex.1\tex.2\tex.3\tmedia");
		System.out.println("Notas 1ª Evaluacion\t\t"+nota1+"\t"+nota2+"\t"+nota3+"\t"+(total_notas/3));
		
	}

}
