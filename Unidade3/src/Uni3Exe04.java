import java.util.Scanner;

public class Uni3Exe04 {

    public static void main(String[] args) {

        Scanner notas_media = new Scanner(System.in);

        double peso3 = 3;
        double peso2 = 2;
        double peso5 = 5;

        System.out.println("inserir nota 1 = ");
        double nota1 = notas_media.nextInt();

        System.out.println("inserir nota 2 = ");
        double nota2 = notas_media.nextInt();

        System.out.println("inserir nota 3 = ");
        double nota3 = notas_media.nextInt();

        double media_final = (nota1 * peso2 + nota2 * peso3 + nota3 * peso5) / 10;

        System.out.println("A média final desse aluno é de " + media_final);

        notas_media.close();
        
    }
}
