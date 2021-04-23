public class FuncCntrd extends Funcionario
{
    int dependentes;
    float salarioFamilia;
    final float valorPorDep = 9.58, aliquotaIR = 15.00;
    
    public FuncCntrd(String a, String b, float d, int i)
    {
        Funcionario(a, b, d); // this. ??
        this.dependentes = i;
    }
    
    float calculaSalario()
    {
        return Funcionario.calculaSalario(aliquotaIR); // this.?
    }
    
    float calculaSalario(int numeroDependentes)
    {
        this.salarioFamilia = numeroDependentes * valorPorDep; 
        float salarioBase = this.salario + this.salarioFamilia;
        return calculaSalario();
        return salarioBase;
    }
    
    public String toString()
    {
    
        return this.nome + "\n" +
        this.codigo + "\n" +
        (this.salario+this.salarioFamilia) + "\n" + // salario base
        calculaSalario(); // salario liquido
        
    }
    
}
