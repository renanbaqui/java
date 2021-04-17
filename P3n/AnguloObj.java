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
	    radianos = (this.arcoRad * Math.PI)/180;
	    seno = Math.sin(radianos);
	    return seno;
	}
	
	public double fCoseno()	// metodo de calculo da area do circulo
	{
	    radianos = (this.arcoRad * Math.PI)/180;
	    coseno = Math.cos(radianos);
	    return coseno;
	}
	
	public double fTangente()	// metodo de calculo da area do circulo
	{
	    radianos = (this.arcoRad * Math.PI)/180;
	    tangente = Math.tan(radianos);
	    return tangente;
	}
	
	public double fCotangente()	// metodo de calculo da area do circulo
	{
	    radianos = (this.arcoRad * Math.PI)/180;
	    cotangente = (Math.cos(radianos))/(Math.sin(radianos));
	    return cotangente;
	}

    // construtor
    public AnguloObj(double g)
    {
        this.arcoRad = (g * Math.PI)/180;
    }
    
    public String toString(AnguloObj AnguloObj)
    {
        System.out.println("Arco: "+this.df2.format(arcoRad)+" rad\n"+fSeno()+fCoseno()+fTangente()+fCotangente());
    }
	
/*	public static void main(String[] args) {
	//	System.out.println(df2.format(fSeno(30)));
*/	}
}
