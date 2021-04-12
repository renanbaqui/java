/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

// ************ falta completar
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;


public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		//String line; //line = dataFile.readLine(); // Le uma linha por vez
		int location, index; char letter;
		
		int[] letterCount = new int[20];
		
		//Scanner input = new Scanner(System.in);
		System.out.println("Digite uma linha: ");
		String line=input.nextLine();
//************ precisa acertar isso na leitura de teclado ...
		while (line != null) // Enquando houver linhas a serem lidas
		{ 
		  for (location =0; location<line.length(); location++) 
		  { 
			letter = line.charAt(location);
			if ((letter  >= 'A' && letter <= 'Z') || (letter  >= 'a' && letter <= 'z'))
			{ 
			   // 2o truque
			   index = (int)Character.toUpperCase(letter) - (int) 'A';	
				letterCount[index]++;
			}
		  }
		  line = input.nextLine(); //dataFile.readLine(); // Lê a próxima linha
		}

		for (index = 0; index < letterCount.length; index++)
		{
		  System.out.println("The total number of"  + (char) (index + (int) 'A') + "’s is" + letterCount[index]);
		}
	}
}
