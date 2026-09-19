import java.util.Scanner;

public class Repetição_FOR {
    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);

        // 1 condição : inicialização . 2 condição: condição de parada, 3 condiçaõ: incremento ou decremento
        for(var i = 1;i <= 5;i++) {
            System.out.println("Digite um nome: ");
            String name = sc.next();
            System.out.println("nome: " + i + " : " + name);
        }
    }
}
