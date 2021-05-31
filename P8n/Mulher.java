package my_package;

import java.math.RoundingMode;	// arredondamento de casas decimais
import java.text.DecimalFormat;	// arredondamento de casas decimais

public class Mulher extends PessoaIMC
{
    
    public static DecimalFormat df2 = new DecimalFormat("#.##");	// objeto de formato de duas casas decimais
    
    Mulher(String n, double p, double a)
    {
        super(n, p, a);
    }
    
    public String resultIMC()
    {
        double imc = super.calculaIMC(super.getAltura(), super.getPeso());
        
        if(imc<19)
            return "Abaixo do peso ideal.";
        
        else if(imc>=19 && imc<=25.8)
            return "Peso ideal.";
            
        else
            return "Acima do peso ideal.";
    }
    
    public String toString()
    {
        return  super.toString() + "\n" +
                "IMC: " + df2.format(super.calculaIMC(super.getAltura(), super.getPeso())) + "\n" + 
                resultIMC(); 
    }
}