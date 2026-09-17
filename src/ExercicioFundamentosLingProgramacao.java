import java.util.Scanner;

public class ExercicioFundamentosLingProgramacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String name = sc.next();

        System.out.println("Digite seu ano de nascimento: ");
        int year = sc.nextInt();
        int baseYear = 2026;
        int age = baseYear - year;
        System.out.println("Olá " + name + " Você tem " + age + " anos!");


        System.out.println("======================= \n");

        System.out.println("Digite tamanho do lado do quadrado: ");
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("A aréa do quadrado é: " + area);


        System.out.println("======================= \n");


        System.out.println("Digite valor da base do retângulo: ");
        int base = sc.nextInt();
        System.out.println("Digite valor da altura do retângulo: ");
        int height = sc.nextInt();

        int area2 = base * height;
        System.out.println("A aréa do retângulo é: " + area2);

        System.out.println("======================= \n");

        System.out.println("Digite nome da 1 pessoa: ");
        String name1 = sc.next();
        System.out.println("Digite idade da 1 pessoa: ");
        int age1 = sc.nextInt();

        System.out.println("Digite nome da 2 pessoa: ");
        String name2 = sc.next();
        System.out.println("Digite idade da 2 pessoa: ");
        int age2 = sc.nextInt();

        int ageGap;
        if(age1 > age2) {
            ageGap = age1 = age2;
        } else {
            ageGap = age2 - age1;
        }

        System.out.println("A diferença de idade entre as duas pessoas é : " + ageGap + " anos!");



    }
}
