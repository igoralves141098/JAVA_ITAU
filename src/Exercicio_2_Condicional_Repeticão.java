import java.util.Scanner;

public class Exercicio_2_Condicional_Repeticão {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();
        System.out.println("Digite sua peso: ");
        double peso = sc.nextDouble();
        double imc = peso / (altura * altura);

        if(imc <= 18.5){
            System.out.println("Abaixo o peso!");
            System.out.println("IMC: " + imc);
        } else if(imc >= 18.6 && imc <= 24.9){
            System.out.println("Peso ideal!");
            System.out.println("IMC: " + imc);
        } else if(imc >= 25 && imc <= 29.9){
            System.out.println("levemente acima do peso!");
            System.out.println("IMC: " + imc);
        } else if(imc >= 30 && imc <= 34.9){
            System.out.println("Obesidade Grau 1!");
            System.out.println("IMC: " + imc);
        } else if(imc >= 35 && imc <= 39.9){
            System.out.println("Obesidade Grau 2, Severa!");
            System.out.println("IMC: " + imc);
        } else {
            System.out.println("Obesidade Grau 3, Morbida!");
            System.out.println("IMC: " + imc);
        }

    }
}
