package capgemini2;
import java.util.Scanner;

public class questao2 {
	static Scanner leitor= new Scanner(System.in);
	public static void main(String[] args) {
	    boolean validacao;
		String senha;
		
		
		
		do {
		System.out.println("Digite sua Senha:");
		senha=leitor.next();
		
		validacao=false;
		
		// Verifica tamanho da senha
		if(senha.length() <6) {
		int cont = 6- senha.length();
        System.out.println("Senha Inv?lida!Faltam"+ cont +" Caracteres " );
        
        validacao=true;
		}
		
		
		// Verifica se tem numeros
		boolean digito = senha.chars().anyMatch(x -> Character.isDigit(x));
		 if (!digito) {
	           
	           System.out.println("Obrigat?rio possuir no m?nimo 1 digito! ");
	           validacao=true;
	       }
	
		 //Verfica se tem maiusculo
		 boolean maiusculo = senha.chars().anyMatch(x -> Character.isUpperCase(x));
		 if (!maiusculo) {
	         
	           System.out.println("Obrigat?rio possuir no m?nimo uma letra mai?scula! ");
	           validacao=true;
		 }
		 
		 //Verfica se tem minusculo
		 
		 boolean minusculo = senha.chars().anyMatch(x -> Character.isLowerCase(x));
	       if (!minusculo) {
	        
	           System.out.println("Obrigat?rio possuir no m?nimo uma letra min?scula!");
	           validacao=true;
	       }
	       //Verifca se tem caractere especial
	       
	       String especial="!@#$%^&*()-+";
	       boolean  validacaoCaractere= false;
	       
	       for (int i=0; i < senha.length(); i++) {
	    	   
	    	   char letra = senha.charAt(i);
	    	   
	    	   if(especial.contains(Character.toString(letra))) {
	               validacaoCaractere = true;
	               break;
	           }
	       }
	       
	       if(!validacaoCaractere) {
	    	   
	    	   System.out.println("Obrigat?rio possuir no m?nimo um caractere especial!");
	    	   validacao=true;
	       }
	       
	       if(!validacao) {
	    	   System.out.println("Sua Senha ? forte!Possui todos os requisitos.");
	       }
		 
		}while(validacao);
	}
}
	
