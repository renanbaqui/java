

abstract class PessoaIMC 
{
    private String nome;    // campo nome adicionado que anteriormente herdava da classe Pessoa
    private double peso, altura;
    
    PessoaIMC(String n, double p, double a) // construtor da classe
    {
        this.nome = n;
        this.peso = p;
        this.altura = a;
    }
    
    public String getNome(){ return this.nome; }
    
    public double getPeso(){ return this.peso; }
    
    public double getAltura(){ return this.altura; }
    
    double calculaIMC(double a, double p)
    {
        double imc = p / (a * a);
        return imc;
    }
    
    public String toString()
    {
        return  "Nome: " + this.nome + " " +
                "Peso: " + this.peso + " " +
                "Altura: " + this.altura + " ";
    }
}   