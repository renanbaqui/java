import java.lang.Math.*;    // matematica
import java.util.Scanner;
import java.util.Objects;

import java.math.RoundingMode;	// arredondamento de casas decimais
import java.text.DecimalFormat;	// arredondamento de casas decimais

public class P1nX
{
 
  private static DecimalFormat df2 = new DecimalFormat("#.##"); // objeto de formato de duas casas decimais
  
  private static double calcula(double r)	// metodo de classe de calculo da area do circulo
  {
    double resultado = Math.PI * r * r;
    System.out.println ("A area do circulo e': " + df2.format(resultado) + " unidades de area.");  
    return resultado;
  }
  
  private static double calcula(double b, double a)	// metodo de classe de calculo da area do retangulo
  {
    double resultado = a * b;
    System.out.println ("A area do retangulo e': " + df2.format(resultado) + " unidades de area.");
    return resultado;     
  }
  
  private static double calcula(double l1, double l2, double l3)    // metodo de classe de calculo da area do triangulo
  {
    double s, area = 0;
    int ok;
		
    if (l1 + l2 <= l3 || l1 + l3 <= l2 || l2 + l3 <= l1) // verifica se e' triangulo
    {    
      ok = 0; // triangulo invalido
      System.out.println("Nao forma um triangulo.");
    }
    else
    {
      ok = 1; // triangulo valido
    }
	 
    if(ok==1)
    {
      s = (l1+l2+l3)/2;
	  area = Math.sqrt(s*(s-l1)*(s-l2)*(s-l3));
	  System.out.println("A area do triangulo e': "+ df2.format(area) +" unidades de area.");
    }
	return area;
  }
  
  private static void classifica(double l1, double l2, double l3)   // metodo de classe de classificacao do triangulo
  {
	int ok;
	
	if (l1 + l2 <= l3 || l1 + l3 <= l2 || l2 + l3 <= l1) // verifica se e' triangulo
    {    
      ok = 0; // triangulo invalido
    }
    else
    {
      ok = 1; // triangulo valido
    }
	 
    if(ok==1)
    {
	   // Verifica triangulo equilatero
      if (l1 == l2 && l2 == l3 )
      System.out.println("O triangulo e' equilatero.");
 
      // Verifica triangulo isosceles
      else if (l1 == l2 || l2 == l3 || l3 == l1 )
      System.out.println("O triangulo e' isosceles.");
 
      // Senao e' triangulo escaleno
      else
      System.out.println("O triangulo e' escaleno.");
	}      
  }
  
  public static void main (String[]args)
  {
    if (args.length==0)	// se nao houver argumentos
    {
      System.out.println("Numero de argumentos insuficiente");	
    }
    
    if (args.length>=4) // se o numero de argumentos for igual ou maior a quatro
    {
      System.out.println("Numero de argumentos excessivo");
    }	  
    
    boolean valido = true;
    
    for (int i = 0; i < args.length; i++)	// loop de verificacao de validade dos argumentos
    {
      boolean numeric = true;
      try {	// verifica se e' numero
        Double num = Double.parseDouble(args[i]);
      } catch (NumberFormatException e) {
        numeric = false;
        valido = false;
      }
      
      if (!numeric)	// se nao e' numero imprime a linha abaixo
      {
        System.out.println((i+1)+"o argumento, “"+ args[i] +"”, nao eh numero");
      }
    }

    if(valido)
    {
    
      if (args.length==1)   // se ha um argumento, e' um circulo
      {
        double a1 = Double.parseDouble(args[0]); 	// conversao de string para double
	    calcula(a1);	     
      }	
      if (args.length==2)   // se ha dois argumentos, e' um retangulo
      {
        double b1 = Double.parseDouble(args[0]);	// conversoes de string para double
	    double b2 = Double.parseDouble(args[1]);
	    calcula(b1, b2);
      }
      if (args.length==3)   // se ha tres argumentos e' um triangulo
      {  
        double c1 = Double.parseDouble(args[0]);	// conversoes de string para double
	    double c2 = Double.parseDouble(args[1]);
	    double c3 = Double.parseDouble(args[2]);		
	    calcula(c1, c2, c3);
	    classifica(c1, c2, c3);
      }
    }
  }
}
