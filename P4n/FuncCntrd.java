public class FuncCntrd extends Funcionario
{
    
    int dependentes;
    float salarioFamilia;
    final float valorPorDep = 9.58f, aliquotaIR = 15.00f;   // campos de valor constante
    
    public FuncCntrd(String a, String b, float d, int i)    // metodo construtor que recebe parametros para inicializar campos
    {
        
        super(a, b, d); // referencia explicita ao construtor da classe Funcionario, que foi definido antes
        this.dependentes = i;
        
    }
    
    float calculaSalario()  // metodo que calcula o salario liquido do empregado, invocando o metodo calculaSalario da superclasse
    {
        
        return super.calculaSalario(aliquotaIR); 
        
    }
    
    float calculaSalario(int numeroDependentes) // metodo que calcula o valor no salario base do empregado, para empregados que possuam dependentes
    {
        
        this.salarioFamilia = numeroDependentes * valorPorDep; 
        float salarioBase = this.salario + this.salarioFamilia;
        this.salario = salarioBase;
        this.salarioLiquido = calculaSalario(); //  invoca o metodo calculaSalario() para calcular seu salario liquido.
    
        return salarioLiquido;         
        
    }
    
    // métodos getXXX para cada campo da classe
    
    public int getDependentes() { return this.dependentes; }
    
    public float getSalarioFamilia() { return this.salarioFamilia; }
    
    public float getValorPorDep() { return this.valorPorDep; }
    
    public float getAliquotaIR() { return this.aliquotaIR; }
    
    public String toString()    // retorna um objeto String contendo o nome, código, salário base e salário líquido do empregado
    {
        
        return super.toString() + "\n" + // toString da classe pai
        this.salarioLiquido; // salario liquido
        
    }
    
}
