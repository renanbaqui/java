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
    
    double calculaSalario(double desconto)
    {
        this.salarioLiquido = this.salario * (100 - desconto)/100;
    }
    
    public String toString()
    {
    
        return "retorna o nome, código e o salário-base do empregado";
    }
    
}
