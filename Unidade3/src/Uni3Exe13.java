import java.util.Scanner;

public class Uni3Exe13 {

    public static void main(String[] args) {

        Scanner loja_meterias = new Scanner(System.in);

        double azulejo_estampado = 12.50;

        System.out.println("Informa a altura da parede =");
        double altura_parede = loja_meterias.nextDouble();

        System.out.println("Qual e o comprimento da parede =");
        double comprimento_parede = loja_meterias.nextDouble();

        double metro_quadrado = (9*azulejo_estampado);

        double metro_area = comprimento_parede*altura_parede;

        double metro_resultado = metro_area*metro_quadrado;

        System.out.println("O valor final é de R$" + metro_resultado);

        loja_meterias.close();
        
    }
    
}
