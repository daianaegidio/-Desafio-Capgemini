import java.util.ArrayList;
import java.util.Arrays;

public class Combinacao {

static ArrayList<String> lista = new ArrayList<>(); 
	
	public static int analisar(String palavra, int tamanho) {
		
		
		 int anagramas = 0;
	        ArrayList<String> vetor = new ArrayList();
	    
	    	String au1;
	    	String au2;
	    	String conc;
	       
	        for(int i=0;i<=palavra.length()-tamanho;i++){
	            vetor.add(palavra.substring(i, i+tamanho));
	        }
	       
	        
	        for(int i =0;i<vetor.size();i++){
	            for(int j = i+1;j<vetor.size();j++){
	                if(comparacao(vetor.get(i), vetor.get(j))){
	                au1=vetor.get(i);
	                au2= vetor.get(j);	
	                	conc= au1+"," + au2;
	                	lista.add(conc);
	             
	                    anagramas++;
	                }
	            }
	        }
	        
	        if(tamanho == 1){
	            return anagramas;
	        }else{
	            return anagramas + analisar(palavra, tamanho-1);
	        }
	        
	    }
	 public static boolean comparacao(String palavra1, String palavra2){
	        
	     
	        char[] string1 = palavra1.toCharArray();
	        char[] string2 = palavra2.toCharArray();
	        
	       
	        Arrays.sort(string1);
	        Arrays.sort(string2);
	        
	       
	        return Arrays.equals(string1, string2);
	    }
	 
	 
	 
	public static ArrayList<String> imprimir(String palavra, int tamanho) {
	          
		
		return lista;
		
		
	}
	}
