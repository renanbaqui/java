import java.lang.Math.*;	// matematica

import java.math.RoundingMode;	// arredondamento de casas decimais
import java.text.DecimalFormat;	// arredondamento de casas decimais

public class AnguloObj
{
	
	public static DecimalFormat df2 = new DecimalFormat("#.##"); // objeto de formato de duas casas decimais
	
	private double arcoRad;	// campo privativo (encapsulado), double, 'arcoRad' que e' a medida em radianos de um angulo
	double radianos, seno, coseno, tangente, cotangente;
	
	public double cvtAngulo()	// metodo de instancia para conversao de angulo em graus para radianos
	{
	    radianos = this.arcoRad;
	    return radianos;
	}
	
	public double fSeno()	// metodo de instancia para calculo do seno
	{
	    seno = Math.sin(this.arcoRad);
	    return seno;
	}
	
	public double fCoseno()	// metodo de instancia para calculo do cosseno
	{
	    coseno = Math.cos(this.arcoRad);
	    return coseno;
	}
	
	public double fTangente()	// metodo de instancia para calculo da tangente
	{
	    tangente = Math.tan(this.arcoRad);
	    return tangente;
	}
	
	public double fCotangente()	// metodo de instancia para calculo da cotangente
	{
	    cotangente = (Math.cos(this.arcoRad))/(Math.sin(this.arcoRad));
	    return cotangente;
	}

    // construtor que recebe um valor do tipo double, que e' a medida de um angulo em graus, e o converte para radianos, e armazena no campo arcoRad
    public AnguloObj(double g)
    {
        this.arcoRad = (g * Math.PI)/180;
    }
    // metodo toString() que retorna uma instancia da classe String no formato de acordo com o requisito
    public String toString()
    {
        return "Arco: "+ this.df2.format(arcoRad) +" rad\n"+
        "Seno: "+ df2.format(fSeno()) + "\n" +
        "Cosseno: " + df2.format(fCoseno()) + "\n" +
        "Tangente: " + df2.format(fTangente()) + "\n" +
        "Cotangente: " + df2.format(fCotangente()) + "\n";
    }
	
}
