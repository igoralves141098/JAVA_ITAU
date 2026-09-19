import java.util.Scanner;

public class EstruturaCondicional_Switch_Case {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero de 1 até 7: ");
        int option = sc.nextInt();

        switch (option) {
            case 1 -> System.out.println("SEGUNDA-FEIRA");
            case 2 -> System.out.println("TERÇA-FEIRA");
            case 3 -> System.out.println("QUARTA-FEIRA");
            case 4 -> System.out.println("QUINTA-FEIRA");
            case 5 -> System.out.println("SEXTA-FEIRA");
            case 6 -> System.out.println("SABADO");
            case 7 -> System.out.println("DOMINGO");
            default  -> System.out.println("ERRO, OPÇÃO INVALIDA!");

        }
    }
}
