import java.util.Scanner;

public class Uni3Exe11 {
    public static void main(String[] args) {
        Scanner temperatura_conversao = new Scanner(System.in);

        System.out.println("informe uma temperatura em °C");
        double temperatura_celsius = temperatura_conversao.nextDouble();

        double temperatura_convertida = temperatura_celsius*9/5 + 32;

        System.out.println("Seu valor em °F será de : " + temperatura_convertida);

        temperatura_conversao.close();
    }
    
}
