
import java.util.Scanner;

public class Uni3Exe02 {

    public static void main(String[] args) {
        
        Scanner loja = new Scanner(System.in);

        System.out.println("informe o valor do sapato = ");
        double sapato = loja.nextDouble();

        double desconto = 0.12;
        double desconto_valor = sapato*desconto;
        double desconto_total = sapato - desconto_valor;

        System.out.println("o preço do calçado é  de R$ " + sapato + " com um desconto de R$ " + desconto_valor + " que no total ficara R$ " + desconto_total);

        loja.close();

       
    }
}
