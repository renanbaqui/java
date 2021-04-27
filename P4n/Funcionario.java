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
        this.salarioLiquido = salario * (100 - desconto)/100;
        return salarioLiquido;
    }
    
    // métodos getXXX para cada campo da classe
    
    public String getNome() { return this.nome; }
    
    public String getCodigo() { return this.codigo; }
    
    public float getSalario() { return this.salario; }
    
    public float getSalarioLiquido() { return this.salarioLiquido; }
    
    public String toString()
    {
        return this.nome + "\n" +
        this.codigo + "\n" +
        this.salario; // salarioBase?
    }
    
}
