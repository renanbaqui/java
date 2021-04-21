public class FuncCntrd extends Funcionario
{
    int dependentes;
    double salarioFamilia;
    final double valorPorDep = 9.58, aliquotaIR = 0.15;
    
    public FuncCntrd(String a, String b, double d, int i)
    {
        Funcionario(a, b, d);
        this.dependentes = i;
    }
    
    public void calculaSalario()
    {
        
    }
    
    
}
