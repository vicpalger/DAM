
public class Ej11 {

	public static void main(String[] args) {
		int votos_pesoe = 9;
		int votos_vox = 1000;
		int votos_podemos = 1;
		int votos_pp = 100;
		int votos_ciudadanos = 1500;
		int grupo_derecha = votos_vox + votos_pp + votos_ciudadanos;
		int grupo_izquierda = votos_pesoe + votos_podemos;
		int total = grupo_derecha + grupo_izquierda;
		double porcentajed = (grupo_derecha / (double) total) * 100;
		double porcentajei = (grupo_izquierda / (double) total) * 100;
		System.out.print("Los votos de la izquierda son " + grupo_izquierda + " que constituyen el " + porcentajei
				+ " % del total \n" + " y los votos dela derecha son " + grupo_derecha + "que constituyen el "
				+ porcentajed + " % del total");

	}

}
