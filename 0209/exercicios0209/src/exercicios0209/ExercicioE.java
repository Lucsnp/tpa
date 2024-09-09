package exercicios0209;
import java.util.Scanner;
public class ExercicioF {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
			int n, divisor, resto;
		
		System.out.println("Digite o número que deseja-se saber se é primo:");
			n = ler.nextInt();
	
	while(div<n) {

			
			
	     if(n%div == 0){
			resto++;
				}
			div++;
}
		
	     if(resto == 2) {
		
		System.out.println("é primo");
		
}
	     else {
		System.out.println("não é");
}
ler.close();
}
}
