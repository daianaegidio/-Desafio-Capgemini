import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class questao3 {
	
	static Scanner leitor = new Scanner(System.in);
	
	public static void main(String[] args) {
		  Combinacao combinacao= new  Combinacao();
		  
		  System.out.println("Digite uma palavra: ");
			 String palavra = leitor.next();
			 int tamanho=palavra.length();
			 int teste= Combinacao.analisar(palavra, tamanho);
			 ArrayList<String> lista = new ArrayList<>(); 
			 lista=Combinacao.imprimir(palavra, tamanho);
			 
			 if(teste==0) {System.out.println("A palavra  " + palavra + " n�o tem Anagramas Pares");}else {
					
					System.out.println("A palavra  " + palavra + " cont�m " + teste + " anagramas pares!");
					
					System.out.println("A lista de todos os anagramas pares s�o:");
					
					for(int cont=0; cont<teste; cont++) {
						
						System.out.println("["+lista.get(cont) + "]");
					
					}
				}
			 
			 
    }
}