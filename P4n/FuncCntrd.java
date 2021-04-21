public class FuncCntrd extends Funcionario
{
    int dependentes;
    float salarioFamilia;
    final float valorPorDep = 9.58, aliquotaIR = 15.00;
    
    public FuncCntrd(String a, String b, double d, int i)
    {
        Funcionario(a, b, d);
        this.dependentes = i;
    }
    
    public void calculaSalario()
    {
        Funcionario.calculaSalario(aliquotaIR); // this.?
    }
    
    public void calculaSalario(int numeroDependentes)
    {
        this.salarioFamilia = numeroDependentes * valorPorDep; 
        this.salario - this.salario + this.salarioFamilia;
        calculaSalario();
    }
    
    public String toString()
    {
    
        return "contendo o nome, código, salário-base e salário líquido do Empregado.";
    }
    
}
