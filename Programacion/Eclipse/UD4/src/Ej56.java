import java.util.Scanner;

public class Ej56 {

	public static void main(String[] args) {
		String contra = "";

		Scanner s = new Scanner(System.in);
		Boolean pas1 = false, pas2 = false, pas3 = false, pas4 = false, pas5 = true;
		int totMay = 0, totMin = 0, totNum = 0;
		while (true) {
			pas5 = true;
			System.out.println("\n1- Ha de tener, al menos, 8 caracteres.\t\t\t\t"
					+ "\n2- Al menos la mitad del password ha de estar en minúsculas.\t"
					+ "\n3- El password ha de tener, al menos, 2 mayúsculas.\t\t"
					+ "\n4- El password ha de tener, al menos, 3 números.\t\t"
					+ "\n5- El password NO ha de incluir el carácter ‘@’.\t\t");
			System.out.print("Contraseña ;");
			contra = s.nextLine();

			for (int i = 0; i < contra.length(); i++) {
				if (Character.isLowerCase(contra.charAt(i))) {
					totMin += 1;
				} else if (Character.isDigit(contra.charAt(i))) {
					totNum += 1;
				} else if (Character.isUpperCase(contra.charAt(i))) {
					totMay += 1;
				}
				if (contra.charAt(i) == '@') {
					pas5 = false;
					break;
				}
			}
			if (contra.length() >= 8)
				pas1 = true;
			else {
				System.out.println("\tTene que tener como minimo 8 caracteres y tiene " + contra.length());
			}
			if (contra.length() / 2 > totMin)
				pas2 = true;
			else {
				System.out.println(
						"\tDeve de contener al menos " + contra.length() / 2 + " y contine " + totMin + " minusculas");
			}
			if (totMay >= 2)
				pas3 = true;
			else {
				System.out.println("\tTiene que contener 2 Mayusculas y tine " + totMay);
			}
			if (totNum >= 3)
				pas4 = true;
			else {
				System.out.println("\tDeve de contener como minimo 3 numeros y tiene " + totNum);
			}
			if ((pas1 && pas2 && pas3 && pas4 && pas5)) {
				System.out.println("Contraseña valida " + contra);
				break;
			}
		}

	}

}
