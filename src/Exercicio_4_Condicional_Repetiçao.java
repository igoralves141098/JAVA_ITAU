import java.util.Scanner;

public class Exercicio_4_Condicional_Repetiçao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número inicial: ");
        int primeiroNumero = sc.nextInt();

        int numeroAtual;

        // Loop infinito controlado manualmente com "break"
        while (true) {
            System.out.print("Digite outro número: ");
            numeroAtual = sc.nextInt();

            // Se o número for menor que o primeiro, ignoramos e pedimos outro
            if (numeroAtual < primeiroNumero) {
                System.out.println("Número ignorado (menor que o inicial).");
                continue; // volta para o início do loop, pulando o resto do código abaixo
            }

            // Verifica se a divisão tem resto diferente de 0
            if (numeroAtual % primeiroNumero != 0) {
                System.out.println("Resto diferente de 0! Encerrando o programa.");
                break; // sai do loop
            }

            System.out.println("Número válido, resto igual a 0. Continue.");
        }
    }

}
