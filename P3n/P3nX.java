import java.util.Scanner;
import java.util.Objects;

public class Main
{
	public static void main(String[] args) {
	    
	   Scanner input = new Scanner(System.in);
	   int n;
	   AnguloObj medidas[] = new AnguloObj[10];
	   
	   System.out.println("Digite o numero de angulos:");
	   n = input.nextInt();
	   
	   System.out.println("");
	   
	   for (int i = 0; i < n; i++)
	   {
	       System.out.println("Digite a medida em graus do " + (i+1) +"o angulo:");
	       medidas[i] = new AnguloObj(input.nextInt());
	   }
	   
	   System.out.println("");
	   
	   System.out.println("Resultado =====================");
	   
	   for (int i = 0; i < n; i++)
	   {
	       System.out.println(medidas[i].toString());
	   }
	   
/*	   AnguloObj teste = new AnguloObj(120);
	   System.out.println(teste.toString());
*/
	}
}
