public class FuncionarioExct extends FuncCntrd
{
    private float gratificacao;
    
    public FuncionarioExct(float g)
    {
        this.gratificacao = g;
    }
    
    public void calculaSalario()
    {
        this.salarioLiquido += this.gratificacao;
    }
    
    public String toString()
    {
    
        return "acrescenta à versão do método toString da classe pai, um “*” ao lado do
código e exibe também o valor da gratificação (planeje direitinho a “cadeia” de toString para
ficar modular, ao invés de ficar repetindo código – reuso é fundamental.";
    }
    
}
