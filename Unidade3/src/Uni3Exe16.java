import java.util.Scanner;

public class Uni3Exe16 {

    public static void main(String[] args) {

        Scanner caixa_troco = new Scanner(System.in);

        System.out.println("Inserir o valor da compra = ");
        int valor_total = caixa_troco.nextInt();

        System.out.println("Inserir o valor dado pelo cliente =  ");
        int valor_client = caixa_troco.nextInt();

        int valor_compra = valor_client - valor_total;

        int nota_100 = valor_compra / 100;
        valor_compra = valor_compra % 100;

        int nota_10 = valor_compra / 10;
        valor_compra = valor_compra % 10;

        int nota_1 = valor_compra / 1;
        valor_compra = valor_compra % 1;

        int total_notas = nota_100 + nota_10 + nota_1;

        System.out.println("O número mínimo de notas de troco é: " + total_notas + " ,sendo notas de 100 necessárias é " + nota_100 + 
        " ,notas de 10 necessárias é: " + nota_10 + " ,notas de 1 necessárias é: " + nota_1);
        caixa_troco.close();
        
    }
    
}
