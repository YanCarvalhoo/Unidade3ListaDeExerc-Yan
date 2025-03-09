import java.util.Scanner;

public class Uni3Exe15 {
    public static void main(String[] args) {
        Scanner numero_inteiro = new Scanner(System.in);

        System.out.println("insira o numero = ");
        int numero_valor = numero_inteiro.nextInt();

        int centena = numero_valor / 100;
        numero_valor = numero_valor % 100;

        int dezena = numero_valor / 10;
        numero_valor = numero_valor % 10;

        int unidade = numero_valor / 1;
        numero_valor = numero_valor % 1;

        System.out.println("saída : " + centena + " centenas(s), " + dezena + " dezenas(s), " + unidade + " unidade(s).");

        numero_inteiro.close();
    }
    
}
