package tpa;
public class exercicio1 {
	public static void main(String[] args) {
		
		double jo = 1.34, pe = 1.45;
		int i = 0;
		
	
			while(jo<pe) {
		
		jo = jo + 0.025;
		pe = pe + 0.02;
			System.out.println(jo+" " + pe);
		
		i++;
			}
			System.out.println("Demorar� " +i+ " anos para Jo�o ser maior que Pedro.");
  }
}


//1 la�o pra tabuada, uma de fora pra controlar o n