import java.lang.Math.*;	// matematica

import java.math.RoundingMode;	// arredondamento de casas decimais
import java.text.DecimalFormat;	// arredondamento de casas decimais

public class Angulo
{
	
	public static DecimalFormat df2 = new DecimalFormat("#.##"); // objeto de formato de duas casas decimais
	
	public static double cvtAngulo(double graus)	// metodo de conversao de graus para radianos
	{
	    double radianos = (graus * Math.PI)/180;
	    return radianos;
	}
	
	public static double fSeno(double graus)	// metodo de calculo do seno
	{
	    double radianos = (graus * Math.PI)/180;
	    double seno = Math.sin(radianos);
	    System.out.println("Seno : " + df2.format(seno));
	    return seno;
	}
	
	public static double fCoseno(double graus)	// metodo de calculo do cosseno
	{
	    double radianos = (graus * Math.PI)/180;
	    double coseno = Math.cos(radianos);
	    System.out.println("Coseno : " + df2.format(coseno));
	    return coseno;
	}
	
	public static double fTangente(double graus)	// metodo de calculo da tangente
	{
	    double radianos = (graus * Math.PI)/180;
	    double tangente = Math.tan(radianos);
	    System.out.println("Tangente : " + df2.format(tangente));
	    return tangente;
	}
	
	public static double fCotangente(double graus)	// metodo de calculo da cotangente
	{
	    double radianos = (graus * Math.PI)/180;
	    double cotangente = (Math.cos(radianos))/(Math.sin(radianos));
	    System.out.println("Cotangente : " + df2.format(cotangente) + "\n");
	    return cotangente;
	}

}
