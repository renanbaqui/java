abstract class PessoaIMC 
{
    private double peso, altura;
    
    PessoaIMC(double p, double a)
    {
        this.peso = p;
        this.altura = a;
    }
    
    public double getPeso(){ return this.peso; }
    
    public double getAltura(){ return this.altura; }
    
    double calculaIMC(double a, double p)
    {
        double imc = p / (a * a);
        return imc;
    }
    
    //  Abstract method (does not have a body)
    //  public abstract String resultIMC(); // esta certo?
    
        public String toString()
    {
        return  "Peso: " + this.peso + "\n" +
                "Altura: " + this.altura;
    }
}   