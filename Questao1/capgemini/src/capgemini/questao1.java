package capgemini;

import java.util.Scanner;

public class questao1 {
	static Scanner leitor = new Scanner(System.in);
	
	public static void main(String[] args) {
		
			int numero;
			
			System.out.println("Digite um número:");
			 if(leitor.hasNextInt()){
			
			numero= leitor.nextInt();
			
		
			for(int cont = 0;cont < numero;cont++) {
				for(int espaco = 1; espaco <numero - cont;espaco++) {
					System.out.print(" ");
				}
				 for (int caracter = 0; caracter < cont + 1; caracter++) {
		                System.out.print("*");
		            }
				System.out.println();
			}
	
			 }else { System.out.println("Inválido!");}
		
}
}