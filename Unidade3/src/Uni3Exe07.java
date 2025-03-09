import java.util.Scanner;

public class Uni3Exe07 {

    public static void main(String[] args) {
        Scanner compra = new Scanner (System.in);

        double ml35 = 0.35;
        double ml60 = 0.60;
        double l2 = 2.00;

        System.out.println("Quantidade de  refrigerantes de 350ml = ");
        int q35 = compra.nextInt();

        System.out.println("Quantidade de  refrigerantes de 600ml = ");
        int q60 = compra.nextInt();

        System.out.println("Quantidade de  refrigerantes de 2L = ");
        int q2 = compra.nextInt();

        double quantidade_litros = ml35*q35 + ml60*q60 + l2*q2;

        System.out.println("Quantidade de litros de refigerantes comprados são de " + quantidade_litros +"L");

        compra.close();
    }
    
}
