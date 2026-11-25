import java.util.Scanner;

public class Ej70 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = 0 ;
		System.out.println("Que numaro quiers saber ");
		num = s.nextInt();
		if (primo(num)) {
			System.out.println("No es primo ");
		}else {
			System.out.println("Es primo");
		};
		
	}
	public static boolean primo(int x) {
		if (x%2 == 0) {
			return true;
		}else if (x%3 == 0 ) {
			return true;
		}else if (x%5 == 0 ) {
			return true ;
		}else {
			return false;
		}
		
	}
}
