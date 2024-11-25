package listaVetor;
//de 0 até o num par
import java.util.Scanner;

public class fizErrado4 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

			int a[] = new int[10];

	for (int i = 0; i < a.length; i++) {
		System.out.println("Digite o " + (i + 1) + "° número:");
			a[i] = ler.nextInt();
		}

		System.out.print("Números dados: ");

	for (int j = 0; j < a.length; j++) {
		System.out.print(a[j] + " ");
		}

		System.out.println("");
	
		System.out.print("De 0 até os números pares dados:");

	for (int k = 0; k < a.length; k++) {
		
		System.out.println("");
		
			if (a[k] % 2 == 0) {
				for (int l = 0; l <= a[k]; l++) {
					System.out.print(l + " ");
				}
			}
		}
		
		ler.close();
	}
}
