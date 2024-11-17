package listaVetor;
//pares e ímpares
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int par = 0, impar = 10, a[] = new int[20], b[] = new int[20];

		for (int i = 0; i <= 19; i++) {

			System.out.println("Digite o " + (i + 1) + "° número:");
			a[i] = ler.nextInt();
		}

		for (int j = 0; j <= 19; j++) {
			if (a[j] % 2 == 0) {
				b[par] = a[j];
				par = par + 1;
			} else {
				b[impar] = a[j];
				impar = impar + 1;
			}
		}

		for (int k = 0; k <= 19; k++) {
			System.out.println(b[k]);
		}

		ler.close();
	}
}
