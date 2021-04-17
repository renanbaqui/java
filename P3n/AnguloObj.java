import java.lang.Math.*;

import java.math.RoundingMode;	// arredondamento de casas decimais
import java.text.DecimalFormat;	// arredondamento de casas decimais

public class AnguloObj
{
	
	public static DecimalFormat df2 = new DecimalFormat("#.##"); // objeto de formato de duas casas decimais
	
	private double arcoRad;
	
	public double cvtAngulo()	// metodo de calculo da area do circulo
	{
	    double radianos = (graus * Math.PI)/180;
	    return radianos;
	}
	
	public double fSeno()	// metodo de calculo da area do circulo
	{
	    double radianos = (graus * Math.PI)/180;
	    double seno = Math.sin(radianos);
	    System.out.println("Seno : " + df2.format(seno));
	    return seno;
	}
	
	public double fCoseno()	// metodo de calculo da area do circulo
	{
	    double radianos = (graus * Math.PI)/180;
	    double coseno = Math.cos(radianos);
	    System.out.println("Coseno : " + df2.format(coseno));
	    return coseno;
	}
	
	public double fTangente()	// metodo de calculo da area do circulo
	{
	    double radianos = (graus * Math.PI)/180;
	    double tangente = Math.tan(radianos);
	    System.out.println("Tangente : " + df2.format(tangente));
	    return tangente;
	}
	
	public double fCotangente()	// metodo de calculo da area do circulo
	{
	    double radianos = (graus * Math.PI)/180;
	    double cotangente = (Math.cos(radianos))/(Math.sin(radianos));
	    System.out.println("Cotangente : " + df2.format(cotangente) + "\n");
	    return cotangente;
	}

    // construtor
    public AnguloObj(double g)
    {
        this.arcoRad = (g * Math.PI)/180;
    }
    
    public String toString(AnguloObj AnguloObj)
    {
        System.out.println("Arco: "+this.arcoRad+" rad\n")
    }
	
/*	public static void main(String[] args) {
	//	System.out.println(df2.format(fSeno(30)));
*/	}
}
