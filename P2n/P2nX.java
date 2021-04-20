import java.util.Scanner;
import java.util.Objects;

public class Main
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
	
	public static void calcula(String t)    // metodo de calculo das funcoes trigonometricas
	{
		// utiliza os metodos da classe Angulo para converte-lo para radianos e calcular o valor de suas funcoes trigonometricas, imprimindo estes valores
		Angulo objeto = new Angulo();

		double convertido = Double.parseDouble(t);   // converte para double
		double rad = objeto.cvtAngulo(convertido);  // converte de graus para radianos
		objeto.fSeno(rad);      // calcula e imprime seno
		objeto.fCoseno(rad);    // calcula e imprime cosseno
		objeto.fTangente(rad);  // calcula e imprime tangente
		objeto.fCotangente(rad);   // calcula e imprime cotangente
	    
	}	
	
	public static void main(String[] args) {	// metodo main que aceita como argumento da linha de comando a medida em graus de um angulo
	    
        Scanner input = new Scanner (System.in);
	
		if (args.length>=2) // se o numero de argumentos for igual ou maior a dois
		{
		  System.out.println("Numero de argumentos excessivo");
		  System.exit(0);
		}	

		if(args.length==1)  // se houve somente um argumento
		{
		    verifica(args[0]);
		    calcula(args[0]);
		}        
	
	    System.out.println ("Digite a medida em graus do angulo:");
		String line = input.nextLine ();    // string de leitura da linha
		if (Objects.equals(line, ""))   // caso o usuario tecle 'enter' sem digitar outros caracteres 
		{
		    System.exit(0);    // A entrada de uma String vazia (simplesmente pressionando ENTER) encerra a leitura de valores e a aplicacao
		}	 
        
        verifica(line);
        
		while (line != null)    // loop de enquando houver linhas a serem lidas
		{
			calcula(line);

			System.out.println ("Digite a medida em graus do angulo:");  // pede novamente outra string
			line = input.nextLine ();
			if (Objects.equals(line, ""))   // caso o usuario tecle 'enter' sem digitar outros caracteres 
			{
				System.exit(0);    // A entrada de uma String vazia (simplesmente pressionando ENTER) encerra a leitura de valores e a aplicacao
			}
			verifica(line);
        	}
	}
}
