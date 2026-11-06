import java.util.*;

public class Ej54 {

	public static void main(String[] args) {
		Random  r = new Random();
		Scanner s = new Scanner(System.in);
		int dimensiones = 0 , num = 0  ;
		do {
			System.out.println("Imtroduze dimensiones");
			dimensiones = s.nextInt();
		}while (dimensiones <= 0 );
		int[] lista = new int[dimensiones];
		int[] lista2 = new int[dimensiones];
		System.out.println("Tu vector es");
		for (int i = 0; i < lista.length; i++) {
			num = (int)(r.nextDouble()*100+1);
			lista[i] = num;
			lista2[i]= num;
			System.out.print(" "+ num );
		}
		System.out.println("");
		Arrays.sort(lista2);
		if (Arrays.equals(lista, lista2)) {
			System.out.println("Esta ordenada ");
		}else {
			System.out.println("NO esta organizado ");
		}

	}

}
