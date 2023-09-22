import java.util.Scanner;
import java.time.LocalDate;
public class AnoNasc {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); {
		
		int anoAtual, anoNasc, anoIdade, i, novo = 1000, velho = -1000;
		
		anoAtual =LocalDate.now().getYear() ;
		
			
		for(i=1; i<=4; i++){
			System.out.println("qual é o seu ano de nascimento");
			anoNasc = in.nextInt();
			
			anoIdade = anoAtual - anoNasc;
			if(velho<anoIdade) {
				velho = anoIdade;
			}
			if(novo > anoIdade) {
				novo = anoIdade;
			}
			
		}
		System.out.println("o mais velho tem "+velho);
		System.out.println("o mais novo tem "+novo);
		
		}
	}
}
