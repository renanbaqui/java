import java.util.Scanner;

public class Main{

     public static void main(String []args){
        
        String line;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a linha");
        line = input.nextLine();
        System.out.println("Essa é a linha: \n" + line);
     }
}
