import java.util.Scanner;

public class treina {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um valor maior que 10: ");
        int valor = scan.nextInt();

        if(valor <10){

            System.out.println("Valor menor que 10");

        }else{

            System.out.println("Valor digitado: " + valor);
        }

    }
}
