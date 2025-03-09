import java.util.Scanner;

public class Uni3Exe09 {

    public static void main(String[] args) {
        Scanner volume_oleo = new Scanner(System.in);

        System.out.println("informa o valor do raio = ");
        double valor_raio = volume_oleo.nextDouble();

        System.out.println("informa o valor da altura = ");
        double valor_altura = volume_oleo.nextDouble();

        double volume = Math.PI*(valor_raio*valor_raio)*valor_altura;

        System.out.println("O volume da lata de oleo é de " + volume);

        volume_oleo.close();
    }
    
}
