package Java6.Exercice2;

import java.util.Scanner;

public class Exer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pie = 3.14;
         Scanner scanner = new Scanner(System.in);
        int choix;
        do {
            choix = 0;
            System.out.println("1. Périmètre et diametre d'un cercle\n2. Périmetre d'un triangle rectangle\n3. Ciao, bye! C’est le temps de faire le sommaire final");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt(); // la variable de contrôle est mise à jour
            if (choix == 1)   
            {
                System.out.print("Entrer un rayon:");
                
            }

        } while (choix != 3);
        System.out.println("merci d'avoir quitter");      
    }
}