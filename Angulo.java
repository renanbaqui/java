
import java.lang.Math.*;

import java.math.RoundingMode;	// arredondamento de casas decimais
import java.text.DecimalFormat;	// arredondamento de casas decimais

public class Main
{
	
	private static DecimalFormat df2 = new DecimalFormat("#.##"); // objeto de formato de duas casas decimais
	
	private static double cvtAngulo(double graus)	// metodo de calculo da area do circulo
	{
	    double radianos = (graus * Math.PI)/180;
	    return radianos;
	}
	
	private static double fSeno(double graus)	// metodo de calculo da area do circulo
	{
	    double radianos = (graus * Math.PI)/180;
	    double seno = Math.sin(radianos);
	    return seno;
	}
	
	private static double fCoseno(double graus)	// metodo de calculo da area do circulo
	{
	    double radianos = (graus * Math.PI)/180;
	    double coseno = Math.cos(radianos);
	    return coseno;
	}
	
	private static double fTangente(double graus)	// metodo de calculo da area do circulo
	{
	    double radianos = (graus * Math.PI)/180;
	    double tangente = Math.tan(radianos);
	    return tangente;
	}
	
	private static double fCotangente(double graus)	// metodo de calculo da area do circulo
	{
	    double radianos = (graus * Math.PI)/180;
	    double cotangente = (Math.cos(radianos))/(Math.sin(radianos));
	    return cotangente;
	}
	
	public static void main(String[] args) {
		System.out.println(df2.format(fSeno(30)));
	}
}
