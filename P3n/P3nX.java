import java.util.Scanner;
import java.util.Objects;

public class P3nX
{
	public static void verifica(String s)   // metodo de verificacao de numero
	{
    	boolean numeric = true;
    
		try {	// verifica se e' numero
		  Double num = Double.parseDouble(s);
		} catch (NumberFormatException e) {
		  numeric = false;
		}
        
		if (!numeric)	// se nao e' numero imprime a linha abaixo e sai do programa
		{
		  System.out.println("O argumento “"+ s +"” nao eh numero");
		  System.exit(0);
		}    
	}
	
	
	public static void main(String[] args) {
	    
	   if (args.length>=1) // se o numero de argumentos for igual ou maior a um
	   {
	     System.out.println("Numero de argumentos excessivo");
		 System.exit(0);
	   }	
	   
	   Scanner input = new Scanner(System.in);
	   String n;
	   AnguloObj medidas[] = new AnguloObj[10];	// criacao de array de objetos da classe AnguloObj, onde serao armazenados os objetos criados
	   
	   System.out.println("Digite o numero de angulos:");
	   n = input.nextLine();
	   verifica(n);	// verifica se o angulo inserido e' numero
	   int m = Integer.parseInt(n);	// converte para tipo de dados int
	   if(m<1 || m>10)	// tratamento de numero invalido de angulos
	   {
	     System.out.println("Numero de angulos invalido. Numero deve ser entre 1 e 10 inclusive.");	
		 System.exit(0);
	   }
	   
	   System.out.println("");
	   
	   for (int i = 0; i < m; i++)	// loop para iterar pelo array para atribuir as medidas dos angulos ao array de objetos da classe AnguloObj
	   {
	       System.out.println("Digite a medida em graus do " + (i+1) +"o angulo:");
	       String line = input.nextLine();
	       verifica(line);
	       double convertido = Double.parseDouble(line);   // converte para double
	       medidas[i] = new AnguloObj(convertido);	// atribui ao array 'medidas' no indice i o objeto da classe AnguloObj com a sua respectiva medida em graus
	   }
	   
	   System.out.println("");
	   
	   System.out.println("Resultado =====================");
	   
	   for (int i = 0; i < m; i++)	// loop para iterar a impressao do resultado
	   {
	       System.out.println(medidas[i].toString());	// impressao do resultado de cada indice do array de objetos da classe AnguloObj utilizando toString
	   }
	
	}
}
