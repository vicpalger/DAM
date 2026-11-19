import java.util.Random;
import java.util.Scanner;

public class IESVictor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		String teclado = "", descomposicion = "";
		boolean esta = false, estaPASO1 = false, estaPASO2 = false, estaPASO3 = false;
		int cantidades = 0;
		System.out.println("BIENVENIDO A IES PACO PEREZ\n");
		System.out.println("PASO1 : Intoduzca numero de asinaturas ");
		cantidades = s.nextInt();
		s.nextLine();
		String[] asignaturas = new String[cantidades];
		for (int i = 0; i < asignaturas.length; i++) {
			asignaturas[i] = "";
		}

		System.out.println(asignaturas[0]);
		for (int i = 0; i < asignaturas.length; i++) {
			System.out.println("\nIntroduzca nueva asignatura " + (i + 1) + " de " + asignaturas.length + " :");
			teclado = s.nextLine();
			for (int j = 0; j < asignaturas.length; j++) {
				if (asignaturas[j].equalsIgnoreCase(teclado)) {
					esta = true;
				}
			}
			if (esta) {
				System.out.println(teclado + " ye estaba dada de alta");
				i--;
			} else {
				asignaturas[i] = teclado;
			}
			esta = false;
		}
		esta = false;
		System.out.println("Se han dado de alta las asignaturas siquientes :");
		for (int i = 0; i < asignaturas.length; i++) {
			System.out.print(asignaturas[i]);
			if (i != asignaturas.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("\nPASO2 Introduzca numero de alumnos");
		cantidades = s.nextInt();
		s.nextLine();
		String[][] alumnos = new String[cantidades][4];
		// 0 = NIA
		// 1 = Nombre
		// 2 = Email
		// 3 = asignturas
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println("\nIntroduzca nuevo alumnos" + (i + 1) + " de " + alumnos.length + " :");
			System.out.println("Introduzca el nombre:");
			teclado = s.nextLine();
			alumnos[i][1] = teclado;
			do {
				System.out.println("Introduzca el email:");
				teclado = s.nextLine();
				for (int j = 0; j < teclado.length(); j++) {
					if (teclado.charAt(j) == '@') {
						estaPASO1 = true;
					}
					if (teclado.charAt(j) == '@' && j == 0) {
						estaPASO2 = true;
					}
					if ((teclado.charAt(j) == '@' && j <= 3)) {
						estaPASO3 = true;
					}
					if (teclado.charAt(j) == '.' || esta) {
						descomposicion += teclado.charAt(j);
						esta = true;
					}
				}
				if (!estaPASO1) {
					System.out.println("ERROR : El Mail no contiene el caracter @");
					estaPASO1 = false;
					estaPASO2 = false;
					estaPASO3 = false;
					esta = false;
					descomposicion = "";
					continue;
				}
				if (estaPASO2) {
					System.out.println("ERROR: El mail no puede comenzar por el caracter @");
					estaPASO1 = false;
					estaPASO2 = false;
					estaPASO3 = false;
					esta = false;
					descomposicion = "";
					continue;
				}
				if (estaPASO3) {
					System.out.println("ERROR: El nombre del mail deve de contenra almenos 4 caracteres");
					estaPASO1 = false;
					estaPASO2 = false;
					estaPASO3 = false;
					esta = false;
					descomposicion = "";
					continue;
				}
				if (!descomposicion.equalsIgnoreCase(".es") && !descomposicion.equalsIgnoreCase(".com")) {
					System.out.println(" no contiene ni .com ni .es");
					estaPASO1 = false;
					estaPASO2 = false;
					estaPASO3 = false;
					esta = false;
					descomposicion = "";
					continue;
				}
				estaPASO1 = false;
				estaPASO2 = false;
				estaPASO3 = false;
				esta = false;
				descomposicion = "";
				alumnos[i][2] = teclado;
				break;
			} while (true);
			cantidades = (int) (r.nextDouble() * (500 - 100 + 1) + 100);
			alumnos[i][0] = Integer.toString(cantidades);
		}
		System.out.println("Se han dado de alta los alumnos siguientes:");
		for (int j = 0; j < alumnos.length; j++) {
			System.out.println(alumnos[j][0] + " : " + alumnos[j][1] + ", emali: " + alumnos[j][2]);
		}
		esta = false;
		estaPASO1 = true;
		System.out.println("\nPASO3: Vamos a matricular a los alumnos");
		do {
			System.out.println("Introduzca nombre del alumno o salir");
			teclado = s.nextLine();
			if (teclado.equalsIgnoreCase("salir")) {
				break;
			}
			for (int j = 0; j < alumnos.length; j++) {
				if (alumnos[j][1].equalsIgnoreCase(teclado)) {
					estaPASO1= false;
					do {
						System.out.println("Introduzca nombre de la asignatura");
						teclado = s.nextLine();
						for (int j2 = 0; j2 < asignaturas.length; j2++) {
							if (asignaturas[j2].equalsIgnoreCase(teclado)) {
								esta = true;
							}
						}
						if (esta) {
							alumnos[j][3] += " " + teclado + " ";
							esta = false;
							System.out.println("Se ha matriculado a " + alumnos[j][1] + " de " + teclado);
							break;
						} else {
							System.out.println("La asignatura "+teclado+" no existe!");
						}
					} while (true);
				}
			}
			if (estaPASO1) {
				System.out.println("El alumno "+ teclado +"no existe!");
				estaPASO1 = true;
			}else {
				estaPASO1 = true;
			}
		} while (true);
		for (int j = 0; j < alumnos.length; j++) {
			System.out.println(alumnos[j][0] + " : " + alumnos[j][1] + ", emali: " + alumnos[j][2] + alumnos[j][3]);
		}

	}
}
