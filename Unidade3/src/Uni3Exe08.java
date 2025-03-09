import java.util.Scanner;

public class Uni3Exe08 {

    public static void main(String[] args) {
        Scanner casa_cambio = new Scanner(System.in);

        double cotação_dolar = 5.65;

        System.out.println("Quantos doláres deseja trocar? = ");
        double quantidade_dolar = casa_cambio.nextDouble();

        double reais_dolar = quantidade_dolar*cotação_dolar;

        System.out.println("O atedente deve devolver R$" + reais_dolar + "para o cliente." );

        casa_cambio.close();

    }
    
}
