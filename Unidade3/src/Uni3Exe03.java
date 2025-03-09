import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe03 {

    public static void main(String[] args) {

        Scanner frentista = new Scanner(System.in);

        double gasolina = 5.75;

        System.out.println("Quantos litros de gasolina, senhor gostaria?");
        double litros = frentista.nextDouble();

        double dinheiro = gasolina*litros;

        DecimalFormat df = new DecimalFormat(); df.applyPattern("#,##0.00");  // ao inserir o litro use ","
 
        System.out.println("Senhor colocou " + litros +" Litros de gasolina e ficou no total de " + dinheiro);

        frentista.close();

    }
    
}
