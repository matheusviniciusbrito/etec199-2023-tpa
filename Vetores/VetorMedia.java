import java.util.*;
public class VetorMedia {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 5;
		int a[], i;
		double media = 0, soma = 0;
		a = new int[TAM];
		
		//la�o para leitura do vetor A
		for(i=0; i<TAM; i++) { 
			System.out.print("Digite o "+(i+1)+" valor do vetor A: "); 
			a[i]= in.nextInt();
			soma += a[i];
		}

		media = soma / TAM;
		//Apresentar a m�dia
		System.out.println("A m�dia dos valores inseridos �: "+media);
	}
}
