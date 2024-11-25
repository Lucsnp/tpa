package listaVetor;
//mostrar divisores dos num
import java.util.Scanner;

public class fizErrado5 {
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
			
		System.out.println();	
			
	for (int k = 0; k < a.length; k++) {

		System.out.println();
		
		System.out.print("Divisores de "+a[k]+": ");	
		
		  for(int l = 1; l <= a[k]; l++) {
			
			if(a[k] % l == 0) {
				System.out.print(l + " ");
			}
		  }
	   }	
		ler.close();
	}
}
