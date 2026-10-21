
public class Ej35 {
	public static void main(String[] args) {
		int filas = 5;
		for(int i = 1; i<= filas/ ;i++) {
			
			for(int c = 1; c<= filas ;c++) {
				if (c==i) {
					System.out.print("*");
				}else {
					System.out.print("0");
				};
				
			};
			System.out.println("*");
		};
	};
}
