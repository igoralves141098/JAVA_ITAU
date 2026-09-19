import java.util.Scanner;

public class EstruturaCondicional_IF_Else {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String name = sc.nextLine();
        System.out.println("Digite sua idade: ");
        int age = sc.nextInt();
        System.out.println("Você é emancipado? (s/n)");
        boolean isEmancipated = sc.next().equalsIgnoreCase("s"); // equalsIgnoreCase considera "S" ou "s" / "n" e "N"
        boolean canDrive = (age >= 18) || (age>=16 && isEmancipated);

        if (canDrive) {
            System.out.println(name + " Você pode dirigir!");
        } else {
            System.out.println("Você não pode dirigir! " + name);
        }
    }
}


/*

        if (age >= 18 ) {

             System.out.println("Você tem " + age + " Anos, você pode dirigir! \n");
        } else if (age >= 16 && isEmancipated) {
             System.out.println(name + " apesar de você ter " + age + " Anos, você pode dirigir, por ser emancipado!");
        } else {
             System.out.println("Você não pode dirigir! " + name);
        }
      }
    }



 */
