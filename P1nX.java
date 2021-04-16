// ************ falta completar
import java.lang.Math.*;
import java.util.Scanner;
import java.util.Objects;

public class Main
{
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
    
    private static double calcula(float r){
        double resultado = Math.PI * r * r
        System.out.println ("A area do círculo é: " + resultado);  
        return resultado;
    }
    private static double calcula(float b, float a){
        doble resultado = a * b;
        System.out.println ("A area do retângulo é: " + resultado);
        return resultado;     
    }
    private static double calcula(float l1, floatl2, floatl3){
        // check condition
		int a, b, c, ok;
		a = 1;
		b = 10;
		c = 12;
        if (a + b <= c || a + c <= b || b + c <= a){
            ok = 0; // triangulo invalido
        }
        else{
            ok = 1; // triangulo valido
        }
	   
	// Verifica triangulo equilatero
        if (a == b && b == c )
        System.out.println("Triangulo equilatero");
 
        // Verifica triangulo equilatero
        else if (a == b || b == c || c == b )
        System.out.println("Triangulo Isosceles");
 
        // Else triangulo escaleno
        else
        System.out.println("Triangulo Escaleno");
		
	System.out.println(ok);
        }
    }    
  }
}
