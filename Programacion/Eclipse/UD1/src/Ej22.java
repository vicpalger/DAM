import java.util.Scanner;

public class Ej22 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double nota = 0 , nota_deseada = 0, sacar_nota = 0 ;
		
		System.out.println("Que nota tienes en el primer examen:");
		nota= s.nextDouble();
		System.out.println("Que nota quieres para la media ");
		nota_deseada= s.nextDouble();
		sacar_nota= -(nota - (nota_deseada+nota_deseada)); 
		System.out.println("Para sacar un "+nota_deseada+"Necesitas un "+sacar_nota);

	}

}
