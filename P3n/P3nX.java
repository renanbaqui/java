import java.util.Scanner;
import java.util.Objects;

public class Main
{
	public static void main(String[] args) {
	    
	   Scanner input = new Scanner(System.in);
	   int n;
	   AnguloObj medidas[] = new AnguloObj[10];	// criacao de array de objetos da classe AnguloObj, onde serao armazenados os objetos criados
	   
	   System.out.println("Digite o numero de angulos:");
	   n = input.nextInt();
	   
	   System.out.println("");
	   
	   for (int i = 0; i < n; i++)	// loop para iterar pelo array para atribuir as medidas dos angulos ao array de objetos da classe AnguloObj
	   {
	       System.out.println("Digite a medida em graus do " + (i+1) +"o angulo:");
	       medidas[i] = new AnguloObj(input.nextInt());	// atribui ao array 'medidas' no indice i o objeto da classe AnguloObj com sua respectiva medida em graus
	   }
	   
	   System.out.println("");
	   
	   System.out.println("Resultado =====================");
	   
	   for (int i = 0; i < n; i++)	// loop iterar a impressao do resultado
	   {
	       System.out.println(medidas[i].toString());	// impressao do resultado de cada indice do array de objetos da classe AnguloObj
	   }
	}
}
