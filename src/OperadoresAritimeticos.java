import java.util.Scanner;

public class OperadoresAritimeticos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        float value1 = sc.nextFloat();
        System.out.println("Digite 0 segundo número: ");
        double value2 = sc.nextFloat();

        System.out.printf("%s + %s = %s\n", value1,value2,value1 + value2);
        System.out.println(value1 + " + " + value2 + " = " + (value1 + value2) );

        System.out.println("==============================");

        System.out.printf("%s - %s = %s\n", value1,value2,value1 - value2);
        System.out.println(value1 + " - " + value2 + " = " + (value1 - value2) );

        System.out.println("==============================");

        System.out.printf("%s / %s = %s\n", value1,value2,value1 / value2);
        System.out.println(value1 + " / " + value2 + " = " + (value1 / value2) );

        System.out.println("==============================");

        System.out.printf("%s %% %s = %s\n", value1,value2,value1 % value2);
        System.out.println(value1 + " % " + value2 + " = " + (value1 % value2) );

        System.out.println("==============================");

        System.out.printf("%s * %s = %s\n", value1,value2,value1 * value2);
        System.out.println(value1 + " * " + value2 + " = " + (value1 * value2) );

        System.out.println("===============================");

        int value = 50;
        int value3 = 50;
        System.out.println(value++);
        System.out.println(value);
        // Aqui com "++" depois ele imprime valor da variavél e na proxima linha incrementa +1

        System.out.println("=================");

        System.out.println(++value3);
        System.out.println(value);
        // Aqui com "++" antes ele imprime valor da variavél +1 de encremento e o valor da variavél


    }
}
