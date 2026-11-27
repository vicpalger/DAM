import java.awt.Container;
import java.util.Scanner;

public class AC368 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int c = 0, h = 1, cont = 0 ;
		do {
			cont = 0; 
			h = s.nextInt();
			c = s.nextInt();
			if (c == 0 && h == 0)
				break;
			do {
				cont += 10;
				c -= h;
			} while (c >= h);
			System.out.println(cont);
		} while (true);
	}
}
