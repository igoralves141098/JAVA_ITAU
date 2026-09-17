// MODULO: Fundamentos da Linguagem de Programação Java

import javax.management.MBeanAttributeInfo;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*

        System.out.println("Digite seu nome: ");
        String name = sc.next();
        System.out.println("Digite sua idade: ");
        int age = sc.nextInt();
        System.out.println("Olá " + name + " sua idade é: " + age + "\n");

        */

        // TRABALHANDO COM OPERADORES DE ATRIBUIÇÃO E LOGICOS:

        System.out.println("Quantos anos você tem? ");
        int age = sc.nextInt();
        System.out.println("Você é emancipado? ");
        boolean emancipated = sc.nextBoolean();
        boolean canDrive = age >= 18 || (emancipated && age >= 16);
        System.out.println("Você pode dirigir? " + canDrive);

    }
}






