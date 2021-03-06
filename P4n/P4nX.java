import java.util.*;

import java.math.RoundingMode;	// arredondamento de casas decimais
import java.text.DecimalFormat;	// arredondamento de casas decimais

public class P4nX
{
    
	static ArrayList<Funcionario> teste;	// objeto Arraylist Funcionario
    	static String f;
    	static int m;
    
    	public static DecimalFormat df2 = new DecimalFormat("#.##");	// objeto de formato de duas casas decimais
  
    	public P4nX(int numeroFuncionarios)	// construtor da classe principal, que recebe como argumento o numero de funcionarios a ser entrado
    	{
        
        	teste = new ArrayList<Funcionario>(numeroFuncionarios); 
        
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
	
	public static void verificaNumero(int n)	// metodo de verificacao do numero de funcionarios (objetos)
	{
		
		if (n<1 || n>10)
	    	{
	        	System.out.println("Numero de funcionarios invalido. Numero deve ser entre 1 e 10 inclusive.");
		    	System.exit(0);
	    	}
		
	}
    
    	public static void verificaCE(String s)		// metodo de verificacao de entrada de contratado ou executivo
    	{
        	
		if(!s.equals("c") && !s.equals("e"))
        	{
            		System.out.println("O argumento “"+ s +"” nao eh valido. Insira 'c' ou 'e'.");
		    	System.exit(0);
        	}
		
    	}
    
    	public static void verificaFloat(String s)   // metodo de verificacao de numero float
	{
    		
		boolean numeric = true;
    
		try {	// verifica se e' numero float
		  Float num = Float.parseFloat(s);
		} catch (NumberFormatException e) {
		  numeric = false;
		}
        
		if (!numeric)	// se nao e' numero imprime a linha abaixo e sai do programa
		{
		  	System.out.println("O argumento “"+ s +"” nao eh numero valido.");
		  	System.exit(0);
		}
		
	}
    
    	public static void entDados()	// o metodo entDados e' uma rotina onde se pede ao usuario o tipo de funcionario a ser criado, 
    	{				// cria a instancia do objeto correspondente e coloca no ArrayList
        
        	Scanner entrada = new Scanner(System.in);
                
		for (int i = 0; i < m; i++)
		{
			System.out.println("Contratado ou Executivo (c/e)?");
		    	String ce = entrada.nextLine();
		    	verificaCE(ce);
		    	System.out.println("Nome do Empregado:");
		    	String a = entrada.nextLine();
		    	System.out.println("Codigo:");
		    	String b = entrada.nextLine();
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
   		}
		
    	}
    
    	public static void geraFolha()	// o metodo geraFolha lista os objetos criados exibindo os detalhes de cada tipo (FuncCntrd e FuncExct), incluindo seu tipo,
    	{				// dependentes, salario base e salario liquido
           
		System.out.println("--- Folha Salarial ---\n");
		
		Iterator itr=teste.iterator();	// objeto Iterador 
		
		while(itr.hasNext()){  
			FuncCntrd st=(FuncCntrd)itr.next();
			System.out.println("Nome:");
			System.out.println(st.nome);
			System.out.println("Codigo:");
			System.out.println(st.codigo);
			System.out.println("Salario-Base:");
			st.calculaSalario(st.dependentes);	// ao chamar o metodo, este atribui novo valor calculado ao campo salario			 
			System.out.println(df2.format(st.salario));
			System.out.println("Salario-Liquido:");
			System.out.println(df2.format(st.calculaSalario()));
			System.out.println("----");
		}
		
        }
    
    	public static void main(String[] args) {
    
        	if (args.length>=1) // se o numero de argumentos for igual ou maior a um
	    	{
	        	System.out.println("Numero de argumentos excessivo.");
		    	System.exit(0);
	    	}	
        
        	Scanner input = new Scanner(System.in);    
       
        	System.out.println("Quantos Funcionarios?");	// pede ao usuario o numero de objetos (FuncCntrd e FuncExct) para os quais o salario vai ser calculado
        	f = input.nextLine();                            
        	verificaInt(f);
        	m = Integer.parseInt(f);	// converte para tipo de dados int
        	verificaNumero(m);
        
        	P4nX objeto = new P4nX(m);   // objeto instanciado com construtor da classe principal com o numero de funcionarios como argumento
        
        	System.out.println("--- Cadastro de Funcionarios");
        
        	objeto.entDados();   // invocado o metodo entDados no objeto instanciado da classe principal           
        	objeto.geraFolha();  // invocado o metodo geraFolha no objeto instanciado da classe principal        	
    	}
}
