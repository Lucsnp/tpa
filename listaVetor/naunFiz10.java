package listaVetor;
import java.util.Scanner;
public class naunFiz10 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int soma = 0, a[] = new int[10], b[] = new int[10], c[] = new int[20];
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Digite o " + (i + 1) + "° número:");
				a[i] = ler.nextInt();
			}
		
		for (int j = 0; j < 10; j++) {
					
			System.out.println("Digite o " + (j + 1) + "° número:");
				b[j] = ler.nextInt();
				
				for(int k =0; k<10;k++) {
					if(b[j] != a[k] && b[j]!=c[k]) {
						c[soma] = b[j];
						soma++;
					}
				for(int l =0; l<10;l++) {
					if( a[j] != b[l] && a[j] != c[l]) {
						c[soma] = a[j];
						soma++;
					}	
				}
			}
		}
		
		for(int n = 0; n<20;n++) {
			System.out.println(c[n]);
		}
		
		ler.close();
	}
}
