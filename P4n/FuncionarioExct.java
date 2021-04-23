public class FuncionarioExct extends FuncCntrd
{
 
    private float gratificacao;
    
    public FuncionarioExct(float g)
    {
        this.gratificacao = g;
    }
    
    float calculaSalario()
    {
        return Funcionario.FuncCntrd.calculaSalario() += this.gratificacao;
    }
    
    public String toString()
    {
    
        return FuncCntrd.toString() + "\n" +
        this.gratificacao;
    }
    
}
