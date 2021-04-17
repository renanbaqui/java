import java.util.Scanner;
import java.util.Objects;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner (System.in);
	
    	if (args.length==0)	// se nao houver argumentos
        {
          System.out.println("Numero de argumentos insuficiente");
          System.exit(0);
        }
        
        if (args.length>=2) // se o numero de argumentos for igual ou maior a dois
        {
          System.out.println("Numero de argumentos excessivo");
          System.exit(0);
        }	
    	
    	boolean valido = true;
    
        for (int i = 0; i < args.length; i++)	// loop de verificacao dos argumentos
        {
          boolean numeric = true;
          try {	// verifica se e' numero
            Double num = Double.parseDouble(args[i]);
          } catch (NumberFormatException e) {
            numeric = false;
            valido = false;
          }
          
          if (!numeric)	// se nao e' numero imprime a linha abaixo
          {
            System.out.println((i+1)+"o argumento, “"+ args[i] +"”, nao eh numero");
          }
        }
    
        if(valido){
            
            Angulo teste = new Angulo();
            
            double a1 = Double.parseDouble(args[0]);
            teste.fSeno(a1);
            teste.fCoseno(a1);
            teste.fTangente(a1);
            teste.fCotangente(a1);
        }
	
	        System.out.println ("Digite uma medida em graus do angulo:");
            String line = input.nextLine ();    // string de leitura da linha
            if (Objects.equals(line, ""))   // caso o usuario tecle 'enter' sem digitar outros caracteres 
            {
                line = null;    // atribui 'null' a linha e assim encerra o loop
            }	 
            
            while (line != null)    // loop de enquando houver linhas a serem lidas
            {
                    Angulo teste = new Angulo();
                    
                    double a1 = Double.parseDouble(line);
                    teste.fSeno(a1);
                    teste.fCoseno(a1);
                    teste.fTangente(a1);
                    teste.fCotangente(a1);
                    
                    
                    System.out.println ("Digite uma medida em graus do angulo:");  // pede novamente outra string
                    line = input.nextLine ();
            	    if (Objects.equals(line, ""))   // caso o usuario tecle 'enter' sem digitar outros caracteres 
            	    {
            	        line = null;    // atribui 'null' a linha e assim encerra o loop
            	    }	 
            }
	}
}
