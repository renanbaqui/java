import java.util.Scanner;
import java.util.Objects;
import java.util.*;

public class Main
{
    //static ArrayList<Funcionario> teste2 = new ArrayList<Funcionario>();
    
    static ArrayList<Funcionario> teste;
    static int f;
    
    //ArrayList<Funcionario> teste;
    
    //ArrayList<Funcionario> teste = new ArrayList<Funcionario>(); // Funcionarios ??? 
    
    public Main(int numeroFuncionarios) // criar uma instância da classe principal (sim, isso mesmo!).
    {
        
        teste = new ArrayList<Funcionario>(numeroFuncionarios); // ?? teste = new ArrayList(numeroFuncionarios)
        
    }
    
    public static void entDados()
    {
        
        Scanner entrada = new Scanner(System.in);
        
        
        for (int i = 0; i < f; i++)
        {
            System.out.println("Contratado ou Executivo (c/e)?");
            String ce = entrada.nextLine();
            System.out.println("Nome do Empregado:");
            String a = entrada.nextLine();
            System.out.println("Codigo:");
            String b = entrada.nextLine();
            System.out.println("Salario:");
            float c = entrada.nextFloat();
            Funcionario f1 = new Funcionario(a, b, c);
            teste.add(f1);
            entrada.nextLine(); // consome a proxima linha
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
            Funcionario st=(Funcionario)itr.next();
            System.out.println("Nome:");
            System.out.println(st.nome);
            System.out.println("Codigo:");
            System.out.println(st.codigo);
            System.out.println("Salario:");
            System.out.println(st.salario);
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
    
        Scanner input = new Scanner(System.in);
        
       // String ce;
      //  ArrayList<FuncionarioExct> teste = new ArrayList<FuncionarioExct>(); // Funcionarios ??? 
        
        System.out.println("Quantos Funcionarios?");    // pedir ao usuário o número de objetos (FuncCntrd e FuncExct) 
        f = input.nextInt();                            // para os quais o salário vai ser calculado;
        //verifica(f);
        
        Main p = new Main(f);   // objeto instanciado da classe principal
        
        System.out.println("--- Cadastro de Funcionarios");
//        
        p.entDados();   //b. Invocar o método entDados no objeto instanciado da classe principal;           
        p.geraFolha();  //c. Invocar o método geraFolha no objeto instanciado da classe principal.
        // calculaSalarios(); //???
    }
}
