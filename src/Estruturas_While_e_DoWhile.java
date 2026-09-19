import java.util.Scanner;

public class Estruturas_While_e_DoWhile {
    public static void main(String[] args) {

        var i = 1;
        while (i <= 10){
            System.out.println(i);
            i++;
        }

        i = 1;

        System.out.println("===============");


        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}


/*

  WHILE: testa a condição antes de executar o bloco e depois executa!

  DO WHILE: Executa pelo menos 1 vez, mesmo a condição sendo falsa!

 */