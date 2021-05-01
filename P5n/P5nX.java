import java.util.*;

public class Main
{
	static ArrayList<Pessoa> lista;
	static String f;
    static int m;
    
	public Main(int numeroFuncionarios)	// construtor da classe principal, que recebe como argumento o numero de funcionarios a ser entrado
	{
    
    	lista = new ArrayList<Pessoa>(numeroFuncionarios); 
    
	}    
    
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
	
	public static void verificaDouble(String s)   // metodo de verificacao de numero float
	{
    		
		boolean numeric = true;
    
		try {	// verifica se e' numero float
		  Double num = Double.parseDouble(s);
		} catch (NumberFormatException e) {
		  numeric = false;
		}
        
		if (!numeric)	// se nao e' numero imprime a linha abaixo e sai do programa
		{
		  	System.out.println("O argumento “"+ s +"” nao eh numero valido.");
		  	System.exit(0);
		}
		
	}
	
	
	public static void verificaNumero(int n)	// metodo de verificacao do numero de funcionarios (objetos)
	{
		
		if (n<1 || n>10)
	    	{
	        	System.out.println("Numero de pessoas invalido. Numero deve ser entre 1 e 10 inclusive.");
		    	System.exit(0);
	    	}
		
	}
	
	public static void verificaHM(String s)		// metodo de verificacao de entrada de contratado ou executivo
	{
    	
	if(!s.equals("h") && !s.equals("m"))
    	{
        		System.out.println("O argumento “"+ s +"” nao eh valido. Insira 'h' ou 'm'.");
	    	System.exit(0);
    	}
	
	}	
	
	public static void entDados()	// o metodo entDados e' uma rotina onde se pede ao usuario o tipo de funcionario a ser criado, 
	{				                // cria a instancia do objeto correspondente e coloca no ArrayList
    
    	Scanner entrada = new Scanner(System.in);
                
		for (int i = 0; i < m; i++)
		{
			    System.out.println("Inserir homem(h) ou mulher(m)?");
		    	String hm = entrada.nextLine();
		    	verificaHM(hm);
		    	System.out.println("Digite o nome:");
		    	String a = entrada.nextLine();
		    	System.out.println("Digite a data de nascimento:");
		    	String b = entrada.nextLine();
		    	System.out.println("Peso:");
		    	String x = entrada.nextLine();
		    	verificaDouble(x);
		    	double c = Double.parseDouble(x);
		    	System.out.println("Altura:");
		    	String y = entrada.nextLine();
		    	verificaDouble(y);
		    	double d = Double.parseDouble(y);
		    	
		    	Homem p1 = new Homem(a, b, c, d);
		    	lista.add(p1);
		    	
		    	/*
		    	System.out.println("Salario:");
		    	String x = entrada.nextLine();
		    	verificaFloat(x);
		    	float c = Float.parseFloat(x);
		    	System.out.println("Numero de Dependentes:");
		    	String y = entrada.nextLine();
		    	verificaInt(y);
		    	int d = Integer.parseInt(y);
            
            		switch(ce) {
              			case "c":
                			FuncCntrd f1 = new FuncCntrd(a, b, c, d);
                			teste.add(f1);
                			break;
              			case "e":
					System.out.println("Gratificacao:");
					String z = entrada.nextLine();
					verificaFloat(z);
					float e = Float.parseFloat(z);
					FuncionarioExct f2 = new FuncionarioExct(a, b, c, d, e);
					teste.add(f2);
					break;
           		}
           		*/
   		}
		
    }

	public static void geraFolha()	// o metodo geraFolha lista os objetos criados exibindo os detalhes de cada tipo (FuncCntrd e FuncExct), incluindo seu tipo,
	{				                // dependentes, salario base e salario liquido
       
    	System.out.println("--------\n");
    	
    	Iterator itr=lista.iterator();	// objeto Iterador 
    	
    	while(itr.hasNext()){  
    		Pessoa st=(Pessoa)itr.next();
    		System.out.println(st.toString());
    		/*
    		System.out.println("Salario-Base:");
    		st.calculaSalario(st.dependentes);	// ao chamar o metodo, este atribui novo valor calculado ao campo salario			 
    		System.out.println(df2.format(st.salario));
    		System.out.println("Salario-Liquido:");
    		System.out.println(df2.format(st.calculaSalario()));
    		System.out.println("----");
    		*/
    	}
	
    }
	
	
	
	public static void main(String[] args) {
		    
		    if (args.length>=1) // se o numero de argumentos for igual ou maior a um
	    	{
	        	System.out.println("Numero de argumentos excessivo.");
		    	System.exit(0);
	    	}	
        
        	Scanner input = new Scanner(System.in);
        	
        	System.out.println("Digite o numero de pessoas:");	// pede ao usuario o numero de objetos (FuncCntrd e FuncExct) para os quais o salario vai ser calculado
        	f = input.nextLine();                            
        	verificaInt(f);
        	m = Integer.parseInt(f);	// converte para tipo de dados int
        	verificaNumero(m);
        	
        	Main objeto = new Main(m);   // objeto instanciado com construtor da classe principal com o numero de funcionarios como argumento
        
        	System.out.println("--- Cadastro de Funcionarios");
        
        	objeto.entDados();   // invocado o metodo entDados no objeto instanciado da classe principal           
        	objeto.geraFolha();  // invocado o metodo geraFolha no objeto instanciado da classe principal 
	}
}
