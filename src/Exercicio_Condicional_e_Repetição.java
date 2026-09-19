import java.util.Scanner;

public class Exercicio_Condicional_e_Repetição {
    public static void main(String[] args) {

        // EXERCICO 1:

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int number = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));

        }

    }
}
