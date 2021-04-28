public class FuncionarioExct extends FuncCntrd
{
 
    private float gratificacao; // campo privativo float
    
    public FuncionarioExct(String a, String b, float d, int i, float g)
    {
        
        super(a, b, d, i);
        this.gratificacao = g;
        
    }
    
    float calculaSalario() // metodo que acrescenta ao calculo do salario liquido da supercalsse o valor do campo gratificacao
    {
        
        float adiciona = super.calculaSalario();
        return adiciona + this.gratificacao;
        
    }
    
    // metodo getXXX para cada campo da classe
    
    public float getGratificacao() { return this.gratificacao; }
    
    public String toString() // acrescenta a versao do metodo toString da classe pai, um “*” ao lado do codigo e exibe tambem o valor da gratificacao
    {
    
        return super.toString() + "*" + "\n" +
        this.gratificacao;
        
    }
    
}
