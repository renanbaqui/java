import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Objects;

public class Ex1nX
{

  public static void main (String[]args)
  {

    Scanner input = new Scanner (System.in); 

    int location, index;
    char letter;

    int[] letterCount = new int[26];    // vetor do tipo int para contagem das letras

    
    System.out.println ("Digite uma string:");
    String line = input.nextLine ();    // string de leitura da linha
    
    while (line != null)    // loop de enquando houver linhas a serem lidas
    {
	    for (location = 0; location < line.length (); location++)   // loop para a contagem das letras
	    {
	        letter = line.charAt (location);
	        if ((letter >= 'A' && letter <= 'Z') || (letter >= 'a' && letter <= 'z'))
	        {
		        // 2o truque
		        index = (int) Character.toUpperCase (letter) - (int) 'A';
		        letterCount[index]++;
	        }
	    }
	    for (index = 0; index < letterCount.length; index++) // loop para imprimir a contagem das letras
        {
	        if(letterCount[index]>0)    // somente imprime o numero total de letras caso seja maior que zero
	        {   
	            System.out.println ("O numero total de " +
			    (char) (index + (int) 'A') + "'s é " +
			    letterCount[index]);
	        }
        }

        System.out.println ("Digite uma string:");  // pede novamente outra string
        line = input.nextLine ();
	    if (Objects.equals(line, ""))   // caso o usuario tecle 'enter' sem digitar outros caracteres 
	    {
	        line = null;    // atribui 'null' a linha e assim encerra o loop
	    }	    
    }
  }
}
