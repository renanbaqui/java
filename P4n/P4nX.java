import java.util.Scanner;
import java.util.Objects;
import java.util.ArrayList;

public class P4nX
{
    ArrayList<FuncionarioExct> teste = new ArrayList<FuncionarioExct>(); // Funcionarios ??? 
    
    public P3nX(int numeroFuncionarios) // criar uma instância da classe principal (sim, isso mesmo!).
    {
        //b. Invocar o método entDados no objeto instanciado da classe principal;
        //c. Invocar o método geraFolha no objeto instanciado da classe principal.
    }
    
    public static void entDados()
    {
        System.out.println("Contratado ou Executivo (c/e)?");
        ce = input.nextLine();
        // O método entDados é uma rotina onde se pede ao usuário o tipo de funcionário a ser criado, cria a
        // instância do objeto correspondente e coloca no ArrayList
    }
    
    public static void geraFolha()
    {
        // Lista os objetos criados exibindo os detalhes de cada tipo (FuncCntrd e FuncExct), incluindo seu tipo, 
        // dependentes, salário base e salário líquido.
        
    }
    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        int f;
        String ce;
        ArrayList<FuncionarioExct> teste = new ArrayList<FuncionarioExct>(); // Funcionarios ??? 
        
        System.out.println("Quantos Funcionarios?");    // pedir ao usuário o número de objetos (FuncCntrd e FuncExct) 
                                                        // para os quais o salário vai ser calculado;
        f = input.nextInt();
        
        System.out.println("--- Cadastro de Funcionarios");
        
        for (int i = 0; i < f; i++){
        
            System.out.println("Contratado ou Executivo (c/e)?");
            ce = input.nextLine();
            System.out.println("Nome do Empregado:");
            teste.nome.add(input.nextLine());
            System.out.println("Codigo:");
            teste.codigo.add(input.nextLine());
            System.out.println("Salario:");
            float s = input.nextFloat();
            verificaFloat(s);
            teste.salario.add(s);
            System.out.println("Numero de Dependentes:");
            int d = input.nextInt();
            verificaInt(d);
            teste.dependentes.add(d);
            
        }
        
        calculaSalarios(); //???
    }
}
