package exercicios0209;
import java.util.Scanner;
public class ExercicioF {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
			int n, res1 = 0, res2 = 0, res3 = 0;
			
			int div;
		
		
				
		System.out.println("Digite o número que deseja-se saber se é primo:");
			n = ler.nextInt();
				
			div = n;
	
		while(div>1) {
		
	
			res1 =	(n%1) +	(n%n);
			
			res2 =  (n%2);	
		
			res3 = (n%3);
				
			div--;
		
}//fim while
		
	if(res1==0 && res2>0 && res3>0) {
		
			System.out.println("é primo");
		
}
	else {
			System.out.println("não é");
}
		ler.close();
}
}
