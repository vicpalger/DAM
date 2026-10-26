import java.util.Scanner;

public class Ej39 {

	public static void main(String[] args) {
		final String rojo = "\u001B[31m", amarillo = "\u001B[33m", verde = "\u001B[32m", reset = "\u001B[0m";
		final int intentos = 15, num1 = 5, num2 = 6, num3 = 7, num4 = 8;
		int int1 = 6, int2 = 6, int3 = 7, int4 = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Bienvenido al ejercicio de la caja fuerte!");
		for (int i = 1; i <= intentos; i++) {
			System.out.println("Este es tu intento numero "+ i +":");
			System.out.println("Introduzca digito 1:");
			int1 = s.nextInt();
			System.out.println("Introduzca digito 2:");
			int2 = s.nextInt();
			System.out.println("Introduzca digito 3:");
			int3 = s.nextInt();
			System.out.println("Introduzca digito 4:");
			int4 = s.nextInt();
			
			if (num1 == int1 && num2 == int2 && num3 == int3 && num4 == int4) {
				System.out.println(verde + "Todo Correcto" + reset + " Pasa");
				break;
			} else {
				System.out.println(rojo + "Codigo Incorrecto" + reset);
				switch (int1) {
				case num1:
					System.out.print(verde + num1 + reset);
					break;
				case num2:
					System.out.print(amarillo + int1 + reset);
					break;
				case num3:
					System.out.print(amarillo + int1 + reset);
					break;
				case num4:
					System.out.print(amarillo + int1 + reset);
					break;
				default:
					System.out.print(rojo + int1 + reset);
					break;
				}

				switch (int2) {
				case num2:
					System.out.print(verde + num2 + reset);
					break;
				case num3:
					System.out.print(amarillo + int2 + reset);
					break;
				case num4:
					System.out.print(amarillo + int2 + reset);
					break;
				case num1:
					System.out.print(amarillo + int2 + reset);
					break;
				default:
					System.out.print(rojo + int2 + reset);
					break;
				}

				switch (int3) {
				case num3:
					System.out.print(verde + num3 + reset);
					break;
				case num2:
					System.out.print(amarillo + int3 + reset);
					break;
				case num1:
					System.out.print(amarillo + int3 + reset);
					break;
				case num4:
					System.out.print(amarillo + int3 + reset);
					break;
				default:
					System.out.print(rojo + int3 + reset);
					break;
				}

				switch (int4) {
				case num4:
					System.out.print(verde + num4 + reset);
					break;
				case num2:
					System.out.print(amarillo + int4 + reset);
				case num3:
					System.out.print(amarillo + int4 + reset);
					break;
				case num1:
					System.out.print(amarillo + int4 + reset);
					break;
				default:
					System.out.print(rojo + int4 + reset);
					break;
				}
				
			}
			;
			System.out.println("");
		}
		;
	}

}
