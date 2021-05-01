abstract class PessoaIMC extends Pessoa
{
    private double peso, altura;
    
    PessoaIMC(String n, String d, double p, double a)
    {
        super(n, d);
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
    
    // Abstract method (does not have a body)
//    public abstract String resultIMC(); // esta certo?
    
        public String toString()
    {
        return  super.toString() + "\n" +
                "Peso: " + this.peso + "\n" +
                "Altura: " + this.altura;
    }
}    
