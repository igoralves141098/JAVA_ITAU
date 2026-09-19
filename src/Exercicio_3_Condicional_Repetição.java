import java.util.Scanner;

public class Exercicio_3_Condicional_Repetição {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("Deseja ver os pares ou impares? (Digite 'par' ou 'impar'): ");
        String opcao = sc.next();

        System.out.println("numeros " + opcao + "es no intervalo (decrescente): ");

        for(int i = num2; i >= num1; i--) {
            if(opcao.equals("par") && i % 2 == 0) {
                System.out.println(i);
            } else if(opcao.equals("impar") && i % 2 != 0) {
                System.out.println(i);
            }
        }

    }
}
