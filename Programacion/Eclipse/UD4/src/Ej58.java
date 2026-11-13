import java.util.Scanner;

public class Ej58 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String palbar = "";
		System.out.println("Dame cadena de texto");
		palbar = s.nextLine();
		char [] array = new char[palbar.length()];
		for (int i = 0; i < palbar.length(); i++) {
			if (palbar.charAt(i) == ' ') {
				array[i] = '@';
			} else {
				array[i] = palbar.charAt(i);
			}
		}
		System.out.println("La cadena queda \n");
		for (int i = 0; i < array.length; i++) {
			System.out.print("["+array[i]+"],");
			
		}
	}
}
