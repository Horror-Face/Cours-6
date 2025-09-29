//Raphaël Desjardins
//2025-09-24
//TP 2
package Java6.Exercice2;

import java.util.Scanner;

public class Exer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        String choix;
        do {
            choix = "";
            System.out.printf(
                    "%na. Périmètre et diametre d'un cercle\nb. Périmetre d'un triangle rectangle\nc. Ciao, bye! C'est le temps de faire le sommaire final%n");
            System.out.print("Votre choix : ");
            choix = scanner.next(); // la variable de contrôle est mise à jour
            switch (choix) {
                case "a":
                    // double ray;
                    do {
                        System.out.print("Entré un rayon: ");
                        double ray = sc.nextDouble();
                        if (saisie.hasNextDouble) {

                        }
                        double dia = ray * 2;
                        double peri = (double) (2 * Math.PI * ray);
                        Math.round(peri);
                        System.out.printf("Le prérimètre est de %.3f et le diamètre est de %.2f", peri, dia);
                    }

                    while (sc.hasNextDouble());

                case "b":

            }

        }

        while (choix != "c");
        System.out.println("merci d'avoir quitter");
        sc.close();
        scanner.close();
    }
}