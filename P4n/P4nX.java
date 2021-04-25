import java.util.Scanner;
import java.util.Objects;
import java.util.*;

public class Main
{
    static ArrayList<Funcionario> teste = new ArrayList<Funcionario>();
    
    //ArrayList<Funcionario> teste;
    
    //ArrayList<Funcionario> teste = new ArrayList<Funcionario>(); // Funcionarios ??? 
    
/*    public Main(int numeroFuncionarios) // criar uma instância da classe principal (sim, isso mesmo!).
    {
        
        teste = new ArrayList(numeroFuncionarios);
        //b. Invocar o método entDados no objeto instanciado da classe principal;
        //c. Invocar o método geraFolha no objeto instanciado da classe principal.
    }*/
    
/*    public static void entDados()
    {
        ArrayList<Funcionario> teste = new ArrayList<Funcionario>();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Contratado ou Executivo (c/e)?");
        String ce = entrada.nextLine();
        System.out.println("Nome do Empregado:\n");
        String a = entrada.nextLine();
        System.out.println("Codigo:");
        String b = entrada.nextLine();
        System.out.println("Salario:");
        float c = entrada.nextFloat();
    //    verificaFloat(s);
    //    teste.salario.add(s);
        Funcionario f1 = new Funcionario(b, b, c);
        teste.add(f1);
    //    System.out.println("Numero de Dependentes:");
    //    int d = input.nextInt();
    //    verificaInt(d);
    //    teste.dependentes.add(d);
        
        // O método entDados é uma rotina onde se pede ao usuário o tipo de funcionário a ser criado, cria a
        // instância do objeto correspondente e coloca no ArrayList
    }*/
    
    public static void geraFolha()
    {
    //    ArrayList<Funcionario> teste = new ArrayList<Funcionario>();
        Iterator itr=teste.iterator();
        while(itr.hasNext()){  
            Funcionario st=(Funcionario)itr.next();
            System.out.println("Nome:");
            System.out.println(st.nome);
            System.out.println("Codigo:");
            System.out.println(st.codigo);
            System.out.println("Salario:");
            System.out.println(st.salario);
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
        int f;
       // String ce;
      //  ArrayList<FuncionarioExct> teste = new ArrayList<FuncionarioExct>(); // Funcionarios ??? 
        
        System.out.println("Quantos Funcionarios?");    // pedir ao usuário o número de objetos (FuncCntrd e FuncExct) 
                                                        // para os quais o salário vai ser calculado;
        f = input.nextInt();
        
    //    Main p = new Main(f);
        
        
        System.out.println("--- Cadastro de Funcionarios");
        
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Contratado ou Executivo (c/e)?");
        String ce = entrada.nextLine();
        System.out.println("Nome do Empregado:\n");
        String a = entrada.nextLine();
        System.out.println("Codigo:");
        String b = entrada.nextLine();
        System.out.println("Salario:");
        float c = entrada.nextFloat();
        Funcionario f1 = new Funcionario(b, b, c);
        teste.add(f1);

        
        
        System.out.println("--- Folha Salarial ---\n");
        
        
      //  for (int i = 0; i < f; i++){
        
            geraFolha();
            
    //    }
        
        // calculaSalarios(); //???
    }
}
