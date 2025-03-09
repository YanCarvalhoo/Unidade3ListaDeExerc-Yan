
import java.util.Scanner;

public class Uni3Exe05 {

    public static void main(String[] args) {
        Scanner frango = new Scanner(System.in);

        double pe_direito = 4.0;
        double pe_esquerdo = 3.5;

        System.out.println("Quantos frangos possuem na granja =");
        int granja = frango.nextInt();

        double gasto_granja = (pe_direito + (2*pe_esquerdo))*granja;

         System.out.println("O gasto da granja é de um total de R$" + gasto_granja + " com " + granja + " galinhas marcadas. ");

        frango.close();
       
    }
    
}
