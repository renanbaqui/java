public class Funcionario
{
    
    String nome, codigo;
    float salario, salarioLiquido;
    
    public Funcionario(String n, String c, float s)
    {
        this.nome = n;
        this.codigo = c;
        this.salario = s;
        this.salarioLiquido = s;
    }
    
    float calculaSalario(float desconto)
    {
        return this.salario * (100 - desconto)/100;
    }
    
    public String toString()
    {
    
        return this.nome + "\n" +
        this.codigo+ "\n" +
        this.salario; // salarioBase?
    }
    
}
