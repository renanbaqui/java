// ************ falta completar
import java.lang.Math.*;
import java.util.Scanner;
import java.util.Objects;

import java.math.RoundingMode;	// arredondamento de casas decimais
import java.text.DecimalFormat;	// arredondamento de casas decimais

public class P1nX
{
 
  private static DecimalFormat df2 = new DecimalFormat("#.##"); // objeto de formato de duas casas decimais
	
  public static void main (String[]args)
  {
    if (args.length==0)	// se nao houver argumentos
    {
      System.out.println("Numero de argumentos insuficiente");	
    }
    
    if (args.length<=4) // se o numero de argumentos for igual ou maior a quatro
    {
      System.out.println("Numero de argumentos excessivo");
    }	  

    for (int i = 0; i < args.length; i++)	// loop de verificacao dos argumentos
    {
      boolean numeric = true;
      try {	// verifica se e' numero
        Double num = Double.parseDouble(args[i]);
      } catch (NumberFormatException e) {
        numeric = false;
      }
      
      if (!numeric)	// se nao e' numero imprime a linha abaixo
      {
        System.out.println((i+1)+"o argumento, “"+ args[i] +"”, nao eh numero");
      }
     
    private static double calcula(double r){
        double resultado = Math.PI * r * r;
        System.out.println ("A area do circulo e': " + df2.format(resultado) + " unidades de area.");  
        return resultado;
    }
    private static double calcula(double b, double a){
        double resultado = a * b;
        System.out.println ("A area do retangulo e': " + df2.format(resultado) + " unidades de area.");
        return resultado;     
    }
    private static double calcula(double l1, double l2, double l3)
    {
        // check condition
		int a, b, c, ok;
		a = 4;
		b = 5;
		c = 5;
        if (a + b <= c || a + c <= b || b + c <= a){
            ok = 0; // triangulo invalido
        }
        else{
            ok = 1; // triangulo valido
        }
	   
	// Verifica triangulo equilatero
        if (a == b && b == c )
        System.out.println("O triangulo e' equilatero.");
 
          // Verifica triangulo isosceles
          else if (a == b || b == c || c == b )
          System.out.println("O triangulo e' isosceles.");
 
          // Else triangulo escaleno
          else
          System.out.println("O triangulo e' escaleno.");
	  p= (l1+l1+l3)/2;
	  area = Math.sqrt(p*(p-l1)(p-l2)(p-l3))			
		    
	  System.out.println(ok);
    }
    if (args.length==1)
    {
        double conv = Double.parseDouble(args[0]); 	// conversao de string para double
	calcula(conv);	     
    }	
    if (args.length==2)
    {
        double conv1 = Double.parseDouble(args[0]);	// conversao de string para double
	double conv2 = Double.parseDouble(args[1]);
	calcula(conv1, conv2);
    }
    if (args.length==2)
    {  
        double conv1 = Double.parseDouble(args[0]);	// conversao de string para double
	double conv2 = Double.parseDouble(args[1]);
	double conv3 = Double.parseDouble(args[2]);		
	calcula(conv1, conv2, conv3);
    }	        
  }
}
