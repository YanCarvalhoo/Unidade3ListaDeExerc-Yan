import java.util.Scanner;

public class Uni3Exe10 {
    public static void main(String[] args) {
        Scanner comprimento_hipotenusa = new Scanner(System.in);

        System.out.println("Inserir o valor do cateto oposto = ");
        double cateto_oposto = comprimento_hipotenusa.nextDouble();

        System.out.println("Inserir o valor do cateto adjacente = ");
        double cateto_adjacente = comprimento_hipotenusa.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(cateto_adjacente, 2) + Math.pow(cateto_oposto,2));

        System.out.println("O resuldado da hipotenusa é " +  hipotenusa);

        comprimento_hipotenusa.close();  

    }
}
