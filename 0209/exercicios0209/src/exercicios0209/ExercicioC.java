package exercicios0209;
import java.util.Scanner;
public class ExercicioC { 
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n, i;
		
		System.out.println("Digite o número que se deseja saber o fatorial:");
			n = ler.nextInt();
			ler.next();
			
	i = n - 1 ;
	
		while(i > 1){
		
		n = n*i;	
			
		i = i--;

} 
		System.out.println(n + "! tem como resultado: "+ n );
		

		ler.close();
	
		}}
