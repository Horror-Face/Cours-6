package Java6;

import java.util.Scanner;

public class Exercice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int a = 0;
        // while (a <= 10) {
        // System.out.printf("%d%n", a);
        // a = a + 1;
        // }

        // String mdp = "java123";

        // String a = "";
        // do {
        // System.out.print("entrez un mots de passe :");
        // a = sc.nextLine();
        // } while (!a.equals(mdp));
        // System.out.println(" Tu as enfin entrez dans ton compte !!!");
        Scanner scanner = new Scanner(System.in);
        int choix; // variable de contrôle

        do {
            choix = 0;
            System.out.println("1. Afficher un message\n2. Date\n3. quitter");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt(); // la variable de contrôle est mise à jour
            if (choix == 1)   
            {
                System.out.println("Choix 1 en contruction");
            }

        } while (choix != 3);
        System.out.println("merci d'avoir quitter");

    }
}
