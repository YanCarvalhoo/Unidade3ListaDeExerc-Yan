import java.util.Scanner;

public class Uni3Exe06 {
    public static void main(String[] args) {
        Scanner restaurante = new Scanner(System.in);

        double kilo = 25.0;
        double prato = 0.75;

        System.out.println("coloque o prato na balança, informe o peso (kg)");
        double peso = restaurante.nextDouble();

        double prato_montado = (peso - prato) * kilo;

        System.out.println("O valor do prato do cliente é de R$ " + prato_montado + " pesando kg " + peso );

        restaurante.close();
    }
}
