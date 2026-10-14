import java.util.Scanner;

public class Ej19 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double  a = 0, b = 0, c = 0 ; 
		System.out.println("Dame a ");
		a = s.nextDouble();
		System.out.println("Dame b ");
		b = s.nextDouble();
		c = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		System.out.println("La Hipotenusa es "+c);
		
	}
}
