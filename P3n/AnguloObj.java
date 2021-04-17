import java.lang.Math.*;

import java.math.RoundingMode;	// arredondamento de casas decimais
import java.text.DecimalFormat;	// arredondamento de casas decimais

public class AnguloObj
{
	
	public static DecimalFormat df2 = new DecimalFormat("#.##"); // objeto de formato de duas casas decimais
	
	private double arcoRad;
	double radianos, seno, coseno, tangente, cotangente;
	
	public double cvtAngulo()	// metodo de calculo da area do circulo
	{
	    radianos = this.arcoRad;
	    return radianos;
	}
	
	public double fSeno()	// metodo de calculo da area do circulo
	{
	    seno = Math.sin(this.arcoRad);
	    return seno;
	}
	
	public double fCoseno()	// metodo de calculo da area do circulo
	{
	    coseno = Math.cos(this.arcoRad);
	    return coseno;
	}
	
	public double fTangente()	// metodo de calculo da area do circulo
	{
	    tangente = Math.tan(this.arcoRad);
	    return tangente;
	}
	
	public double fCotangente()	// metodo de calculo da area do circulo
	{
	    cotangente = (Math.cos(this.arcoRad))/(Math.sin(this.arcoRad));
	    return cotangente;
	}

    // construtor
    public AnguloObj(double g)
    {
        this.arcoRad = (g * Math.PI)/180;
    }
    
    public String toString()
    {
        return "Arco: "+ this.df2.format(arcoRad) +" rad\n"+
        "Seno: "+ df2.format(fSeno()) + "\n" +
        "Coseno: " + df2.format(fCoseno()) + "\n" +
        "Tangente: " + df2.format(fTangente()) + "\n" +
        "Cotangente: " + df2.format(fCotangente()) + "\n";
    }
}
