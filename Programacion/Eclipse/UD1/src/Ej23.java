import java.util.Scanner;

public class Ej23 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double  x = 0, x1= 0 ,x2= 0, x3 = 0 ;
		System.out.println("Deme u numero de 3 digitos ");
		x = s.nextDouble();
		x1 = x / 100;
		x2 = (x % 100)/10;
		
		System.out.printf("El primer digito de %.0f es %.0f\n",x,x1);
		System.out.printf("El primer digito de %.0f es %.0f\n",x,x2);

	}

}
