import java.util.Scanner;
public class MasculinoOuFeminino {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		
		int i, altura;
		double pesoIdeal;
		String genero, resposta;
		
	
		
		do {
			System.out.print("Qual seu genero? Se feminino digite f, se masculino digite m: ");
			genero = in.next();
			System.out.print("Digite sua altura em cm: ");
			altura = in.nextInt();
		
			
			if(genero.equalsIgnoreCase("f")){
				pesoIdeal = 52+(0.75*(altura - 152.4));
				System.out.println("Se peso ideal �:" +pesoIdeal);
			}else if(genero.equalsIgnoreCase("m")) {
				pesoIdeal = 52+(0.67*(altura - 152.4));
				System.out.println("Seu peso ideal �:" +pesoIdeal+"kg");		
			} else {
				System.out.println("Insira F ou M, masculino ou feminino.");
			}
			System.out.print("Deseja continuar 1 para continuar e 2 para n�o continuar? ");
			resposta = in.next();
		}while(resposta.equalsIgnoreCase("1"));
		
	}
}