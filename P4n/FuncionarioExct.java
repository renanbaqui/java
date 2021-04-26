public class FuncionarioExct extends FuncCntrd
{
 
    private float gratificacao;
    
    public FuncionarioExct(String a, String b, float d, int i, float g)
    {
        super(a, b, d, i);
        this.gratificacao = g;
    }
    
    float calculaSalario()
    {
        float ok = super.calculaSalario();
        return ok + this.gratificacao;
    }
    
    public String toString()
    {
    
        return super.toString() + "*" + "\n" +
        this.gratificacao;
    }
    
}
