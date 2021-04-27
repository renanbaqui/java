//import java.util.Scanner;
//import java.util.Objects;
import java.util.*;

import java.math.RoundingMode;	// arredondamento de casas decimais
import java.text.DecimalFormat;	// arredondamento de casas decimais

public class Main
{
    //static ArrayList<Funcionario> teste2 = new ArrayList<Funcionario>();
    
    static ArrayList<Funcionario> teste;
    static String f;
    static int m;
    
    public static DecimalFormat df2 = new DecimalFormat("#.##"); // objeto de formato de duas casas decimais
    
    //ArrayList<Funcionario> teste;
    
    //ArrayList<Funcionario> teste = new ArrayList<Funcionario>(); // Funcionarios ??? 
    
    public Main(int numeroFuncionarios) // criar uma instância da classe principal (sim, isso mesmo!).
    {
        
        teste = new ArrayList<Funcionario>(numeroFuncionarios); // ?? teste = new ArrayList(numeroFuncionarios)
        
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
	
	public static void verificaNumero(int n)
	{
	    if (n<1 || n>10)
	    {
	        System.out.println("Numero de funcionarios invalido. Numero deve ser entre 1 e 10 inclusive.");
		    System.exit(0);
	    }
	}
    
    public static void verificaCE(String s)
    {
        if(!s.equals("c") && !s.equals("e"))
        {
            System.out.println("O argumento “"+ s +"” nao eh valido. Insira 'c' ou 'e'.");
		    System.exit(0);
        }
    }
    
    public static void verificaFloat(String s)   // metodo de verificacao de numero double
	{
    	boolean numeric = true;
    
		try {	// verifica se e' numero double
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
    
    public static void entDados()
    {
        
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
            //  default:
                // code block
            }
            
            //Funcionario f1 = new Funcionario(a, b, c);
            //teste.add(f1);
            //entrada.nextLine(); // consome a proxima linha
        }

    //    verificaFloat(s);
    //    teste.salario.add(s);

    //    System.out.println("Numero de Dependentes:");
    //    int d = input.nextInt();
    //    verificaInt(d);
    //    teste.dependentes.add(d);
        
        // O método entDados é uma rotina onde se pede ao usuário o tipo de funcionário a ser criado, cria a
        // instância do objeto correspondente e coloca no ArrayList
    }
    
    public static void geraFolha()
    {
    //    ArrayList<Funcionario> teste = new ArrayList<Funcionario>();
        
        System.out.println("--- Folha Salarial ---\n");
        Iterator itr=teste.iterator();
        while(itr.hasNext()){  
            FuncCntrd st=(FuncCntrd)itr.next();
            System.out.println("Nome:");
            System.out.println(st.nome);
            System.out.println("Codigo:");
            System.out.println(st.codigo);
            System.out.println("Salario-Base:");
            st.calculaSalario(st.dependentes);
        //    System.out.println(st.calculaSalario(st.dependentes)); // ao rodar o metodo atribui novo valor ao campo salario
            System.out.println(df2.format(st.salario));
            System.out.println("Salario-Liquido:");
            System.out.println(df2.format(st.calculaSalario()));
            System.out.println("----");
        }  
    /*    System.out.println("Nome:");
        teste.nome.get(i);
        System.out.println("Codigo:");
        teste.codigo.get(i);
        System.out.println("Salario:");
        teste.salario.get(i);
     */   
        // Lista os objetos criados exibindo os detalhes de cada tipo (FuncCntrd e FuncExct), incluindo seu tipo, 
        // dependentes, salário base e salário líquido.
        
    }
    
    public static void main(String[] args) {
    
        if (args.length>=1) // se o numero de argumentos for igual ou maior a um
	    {
	        System.out.println("Numero de argumentos excessivo.");
		    System.exit(0);
	    }	
        
        Scanner input = new Scanner(System.in);
        
       // String ce;
      //  ArrayList<FuncionarioExct> teste = new ArrayList<FuncionarioExct>(); // Funcionarios ??? 
        
        System.out.println("Quantos Funcionarios?");        // pedir ao usuário o número de objetos (FuncCntrd e FuncExct) 
        f = input.nextLine();                               // para os quais o salário vai ser calculado;
        verificaInt(f);
        m = Integer.parseInt(f);	// converte para tipo de dados int
        verificaNumero(m);
        
        Main p = new Main(m);   // objeto instanciado da classe principal
        
        System.out.println("--- Cadastro de Funcionarios");
//        
        p.entDados();   //b. Invocar o método entDados no objeto instanciado da classe principal;           
        p.geraFolha();  //c. Invocar o método geraFolha no objeto instanciado da classe principal.
        // calculaSalarios(); //???
    }
}
