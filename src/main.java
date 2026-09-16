// MODULO: Fundamentos da Linguagem de Programação Java

import javax.management.MBeanAttributeInfo;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String name = sc.next();
        System.out.println("Digite sua idade: ");
        int age = sc.nextInt();
        System.out.println("Olá " + name + " sua idade é: " + age + "\n");

        // TRABALHANDO COM OPERADORES DE ATRIBUIÇÃO E LOGICOS:

        System.out.println("Quanto é 2 + 2: ");
        int result = sc.nextInt();
        var isRight = result == 4;
        System.out.println("O resultado é 4, você acertou? " + isRight);


    }
}






