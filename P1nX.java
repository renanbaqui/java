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

   /* Scanner input = new Scanner (System.in);

    //String line; //line = dataFile.readLine(); // Le uma linha por vez
    private double peso, idade, altura;
    int location, index;
    char letter;

    int[] letterCount = new int[26];

    //Scanner input = new Scanner(System.in);
    System.out.println ("Digite uma string: ");
    String line = input.nextLine ();*/
    
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
    private static double calcula(double l1, double l2, double l3){
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
    }    
  }
}
