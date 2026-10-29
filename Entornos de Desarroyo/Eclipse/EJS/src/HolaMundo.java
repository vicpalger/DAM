
public class HolaMundo {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int colmna = 0, fila = 0, numero  = 10, altura = 11 ;
		fila = numero;
		colmna = numero;
		
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < altura; j++) {
				if (j ==  altura/2) {
					System.out.print(colmna);
					colmna --;
				}else if (i ==  altura/2) {
					System.out.print(""+fila+"");
					fila --;
				}else {
					System.out.print("0");
				}
			}
			System.out.println("");
		}
		
	}

}
