import java.util.*;

public class P6nX
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
	
	public static void verificaNumero(int n)	// metodo de verificacao do numero de funcionarios (objetos)
	{
		
		if (n<1 || n>2)
	    	{
	        	System.out.println("Opcao invalida. Digite 1 ou 2.");
		    	System.exit(0);
	    	}
		
	}
	
	public static void verificaNumero2(int n)	// metodo de verificacao do numero de funcionarios (objetos)
	{
		
		if (n<1 || n>9)
	    	{
	        	System.out.println("Opcao invalida. Numero deve ser entre 1 e 9 inclusive.");
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
		Homem p1 = new Homem("Jose", 70, 1.65);
        objeto.add(p1);
 
        Mulher p2 = new Mulher("Maria", 50, 1.63);
     	objeto.add(p2);
     	
     	Mulher p3 = new Mulher("Ana", 81, 1.67);
     	objeto.add(p3);
		
		Homem p4 = new Homem("Joao", 85, 1.79);
        objeto.add(p4);
        
		Homem p5 = new Homem("Antonio", 91, 1.83);
        objeto.add(p5);
        
        Mulher p6 = new Mulher("Francisca", 69, 1.61);
     	objeto.add(p6);

		Homem p7 = new Homem("Carlos", 71, 1.75);
        objeto.add(p7);
        
		Homem p8 = new Homem("Paulo", 82, 1.71);
        objeto.add(p8);
        
        Mulher p9 = new Mulher("Adriana", 63, 1.64);
     	objeto.add(p9);
     	
        Mulher p10 = new Mulher("Paula", 76, 1.66);
     	objeto.add(p10);

        
        System.out.println( "1. Imprimir Lista\n" + // menu para o usuario imprimir a lista de pessoas ou sair
                            "2. Sair\n" +
                            "Digite sua opcao:");
        f = input.nextLine();                            
        verificaInt(f);
        m = Integer.parseInt(f);	// converte para tipo de dados int
        verificaNumero(m);
        
        
    	switch(m) { // Se o usuario optar por listar, pergunta qual o criterio e lista as pessoas
	    	case 1:
                System.out.println( "Escolha seu modo de ordenacao:\n" +    
                                    "1.Alfabetica (A-Z) – nome da pessoa\n" +
                                    "2.Alfabetica (Z-A) – nome da pessoa\n" +
                                    "3.Menor Peso - crescente\n" +
                                    "4.Maior Peso - decrescente\n" +
                                    "5.Menor Altura - crescente\n" +
                                    "6.Maior Altura - decrescente\n" +
                                    "7.Menor IMC - crescente\n" +
                                    "8.Maior IMC - decrescente\n" +
                                    "9.Homem / Mulher – ordenar por genero");
                                    
                System.out.println("Digite sua opcao:");
                f = input.nextLine();                            
                verificaInt(f);
                n = Integer.parseInt(f);	// converte para tipo de dados int
                verificaNumero2(n);
                
                objeto.ordena(n);   // aplica o metodo de ordenacao da classe MinhaListaOrdenavel 
                
                for(int i=0; i<10; i++) // imprime os objetos dentro objeto da classe MinhaListaOrdenavel
                {
                    System.out.println("--------");
                    System.out.println(objeto.get(i).toString());
                    System.out.println("--------");
                }

		    case 2:
		        System.exit(0);
		    	break;
	    }
		
	}
}