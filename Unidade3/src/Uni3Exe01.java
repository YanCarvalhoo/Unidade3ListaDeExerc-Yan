import java.util.Scanner;

public class Uni3Exe01 {
    public static void main(String[] args) throws Exception {
        Scanner dimensoes_terreno = new Scanner(System.in);

        System.out.println("informe a altura do terreno = ");
        int altura_terreno = dimensoes_terreno.nextInt();

        System.out.println("informe a base do terreno = ");
        int base_terreno = dimensoes_terreno.nextInt();

        int area_terreno = base_terreno*altura_terreno;

        System.out.println("A area total do terreno é de " + area_terreno );

        dimensoes_terreno.close();

        
    }
}
