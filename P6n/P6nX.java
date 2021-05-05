import java.util.*;

public class Main
{
	static String f;
    static int m, n;
	
	
	public static void verificaInt(String s)   // metodo de verificacao de numero inteiro
	{
		
		boolean numeric = true;

		try {	// verifica se e' numero inteiro
		  Integer num = Integer.parseInt(s);
		} catch (NumberFormatException e) {
		  numeric = false;
		}

		if (!numeric)	// se nao e' numero imprime a linha abaixo e sai do programa
		{
		  	System.out.println("O argumento “"+ s +"” nao eh numero inteiro.");
		  	System.exit(0);
		}
		
	}
	
	public static void main(String[] args) {
		
		if (args.length>=1) // se o numero de argumentos for igual ou maior a um
	    {
	        System.out.println("Numero de argumentos excessivo.");
		    System.exit(0);
	    }	
		
		Scanner input = new Scanner(System.in);
		
		// objeto da classe MinhaListaOrdenavel
		MinhaListaOrdenavel objeto = new MinhaListaOrdenavel(); 
		
		
		// 10 objetos da classe PessoaIMC (Homem e/ou Mulher) inseridos no objeto MinhaListaOrdenavel
		Homem p1 = new Homem(70, 1.65);
        objeto.adi(p1);
 
        Mulher p2 = new Mulher(55, 1.63);
     	objeto.adi(p2);
     	
     	Mulher p3 = new Mulher(81, 1.67);
     	objeto.adi(p3);
		
		Homem p4 = new Homem(85, 1.79);
        objeto.adi(p4);
        
		Homem p5 = new Homem(91, 1.83);
        objeto.adi(p5);
        
        Mulher p6 = new Mulher(69, 1.61);
     	objeto.adi(p6);

		Homem p7 = new Homem(71, 1.75);
        objeto.adi(p7);
        
		Homem p8 = new Homem(82, 1.71);
        objeto.adi(p8);
        
        Mulher p9 = new Mulher(63, 1.64);
     	objeto.adi(p9);
     	
        Mulher p10 = new Mulher(76, 1.66);
     	objeto.adi(p10);

        
        System.out.println( "1. Imprimir Lista\n" +
                            "2. Sair\n" +
                            "Digite sua opcao:");
        f = input.nextLine();                            
        verificaInt(f);
        m = Integer.parseInt(f);	// converte para tipo de dados int
        
        
        
    	switch(m) {
	    	case 1:
                System.out.println( "Escolha seu modo de ordenacao:\n" +
                                    "3.Menor Peso - crescente\n" +
                                    "4.Maior Peso - decrescente\n" +
                                    "5.Menor Altura - crescente\n" +
                                    "6.Maior Altura - decrescente\n" +
                                    "7.Menor IMC - crescente\n" +
                                    "8.Maior IMC - decrescente");
                                    
                System.out.println("Digite sua opcao:");
                f = input.nextLine();                            
                verificaInt(f);
                n = Integer.parseInt(f);	// converte para tipo de dados int
                
                objeto.ordena(n);
                for(int i=0; i<10; i++)
                System.out.println(objeto.geti(i).toString());
                
                /*System.out.println("--------");
            	System.out.println(objeto.geti(0).getPeso());
            	System.out.println("--------");
            	System.out.println(objeto.geti(1).getAltura());
            	System.out.println("--------");
                break;*/
		    case 2:
		        System.exit(0);
		    	break;
	    	}
        
        
        // Na sequência crie um menu para o usuário imprimir a lista de produtos ou sair do
        // programa. Se o usuário optar por listar, pergunte qual o critério e liste os produtos.
		
	}
}