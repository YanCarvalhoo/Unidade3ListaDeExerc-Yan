import java.util.Scanner;

public class Uni3Exe12 {
    public static void main(String[] args) {

        Scanner empresa_salario = new Scanner(System.in);

        double valor_hora = 10;
        double valor_depentes = 60;
        double valor_desconto_familia = 0.085;
        double valor_desconto_inss = 0.05; 

        System.out.println("Nome do funcionário = ");
        String funcionario = empresa_salario.nextLine();

        System.out.println("Quantidade de horas trabalhadas no mês = ");
        double horas_trabalhadas = empresa_salario.nextDouble();

        System.out.println("Numero de depedentes = ");
        double depedentes = empresa_salario.nextDouble();

        double calculo_salario = (horas_trabalhadas*valor_hora) + (depedentes*valor_depentes);

        double calculo_desconto = (calculo_salario*valor_desconto_familia) + (calculo_salario*valor_desconto_inss);

        double valor_salario = calculo_salario - calculo_desconto;


        System.out.println("O funcionário " + funcionario + " possui um salário bruto de R$" + calculo_salario + " e um salário líquido de R$" + valor_salario);

        empresa_salario.close();
        
    }
    
}
