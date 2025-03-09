import java.util.Scanner;

public class Uni3Exe14 {
    public static void main(String[] args) {
        Scanner viagem = new Scanner(System.in);

        double km_litro = 12;

        System.out.println("Qual distância percorrida? ");
        double distância = viagem.nextDouble();

        System.out.println("Quanto tempo levou pra percorrer a distância? ");
        double tempo = viagem.nextDouble();

        double velocidade_media = distância / tempo;
        double litros_consumidos = distância/km_litro;

        System.out.println("A velocidade média foi de " + velocidade_media + "km/h e a quantidade de combustível "+ litros_consumidos +" litros.");

        viagem.close();
    } 
    
}
