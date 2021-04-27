public class FuncCntrd extends Funcionario
{
    int dependentes;
    float salarioFamilia;
    final float valorPorDep = 9.58f, aliquotaIR = 15.00f;
    
    public FuncCntrd(String a, String b, float d, int i)
    {
        super(a, b, d);
  //      Funcionario(a, b, d); // this. ??
        this.dependentes = i;
    }
    
    float calculaSalario()
    {
        return super.calculaSalario(aliquotaIR); // this.?
    }
    
    float calculaSalario(int numeroDependentes)
    {
        this.salarioFamilia = numeroDependentes * valorPorDep; 
        float salarioBase = this.salario + this.salarioFamilia;
    //    return calculaSalario();
        this.salario = salarioBase;
    //    return salarioBase;
        return calculaSalario();
    }
    
    // métodos getXXX para cada campo da classe
    
    public int getDependentes() { return this.dependentes; }
    
    public float getSalarioFamilia() { return this.salarioFamilia; }
    
    public float getValorPorDep() { return this.valorPorDep; }
    
    public float getAliquotaIR() { return this.aliquotaIR; }
    
    public String toString()
    {
        return this.nome + "\n" +
        this.codigo + "\n" +
        (this.salario+this.salarioFamilia) + "\n" + // salario base
        calculaSalario(); // salario liquido
    }
    
}
