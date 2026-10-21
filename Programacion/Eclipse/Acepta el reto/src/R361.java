import java.util.Scanner;

public class R361 {
	public static void main(String[] args) {
		int cant = 0 ;
		Scanner s = new Scanner(System.in);
		String r = "";
		cant = s.nextInt();
		s.nextLine();
		for (int i = 1 ; i <= cant; i++) {
			r= s.nextLine();
			if (r.equalsIgnoreCase("25 12")) {
				System.out.println("SI");
			}else System.out.println("NO");;
		};
	};
	
}
