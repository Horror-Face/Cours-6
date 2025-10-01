//Raphaël Desjardins
//2025-09-24
//TP 2
package Java6.Exercice2;

import java.util.Scanner;

public class Exer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Scanner scanner = new Scanner(System.in);
        String choix;
        do {
            choix = "";
            System.out.printf(
                    "%na. Périmètre et diametre d'un cercle\nb. Périmetre d'un triangle rectangle\nc. Ciao, bye! C'est le temps de faire le sommaire final%n");
            System.out.print("Votre choix : ");
            choix = sc.nextLine(); // la variable de contrôle est mise à jour
            switch (choix) {
                case "a":
                    // double ray;
                    boolean valid = false;
                    double ray = 0;
                    do {
                        // boolean valid = false;
                        System.out.print("Entré un rayon: ");
                        if (sc.hasNextDouble()) {
                            ray = sc.nextDouble();
                            sc.nextLine();

                            if (ray > 0) {
                                valid = true;
                            }
                        } else {
                            System.out.println("mauvaise entrer");
                            sc.nextLine();
                        }
                    }

                    while (!valid);

                    double dia = ray * 2;
                    double peri = (double) (2 * Math.PI * ray);
                    // Math.round(peri);
                    System.out.printf("Le prérimètre est de %.3f et le diamètre est de %.2f", peri, dia);
                    break;
                case "b":
                    // double ray;
                    boolean correct = false;
                    double base = 0;
                    double haut = 0;
                    do {
                        // boolean correct = false;
                        System.out.print("Entré un nombre entier positive comme base: ");
                        if (sc.hasNextDouble()) {
                            base = sc.nextDouble();
                            sc.nextLine();

                            if (base > 0) {
                                correct = true;
                            }
                        } else {
                            System.out.println("mauvaise entrer");
                            sc.nextLine();
                        }
                    } while (!correct);

                    System.out.print("Entrez un nombre entier positif comme hauteur: ");
                    if (sc.hasNextDouble()) {
                        haut = sc.nextDouble();
                        sc.nextLine();

                        if (haut > 0) {
                            correct = true;
                        }
                    } else {
                        System.out.println("mauvaise entrer");
                        sc.nextLine();
                    }
                    while (!correct)
                        ;
                    double top = haut * haut + base * base;
                    double vtop = Math.sqrt(top);
                    double trp = vtop + haut + base;
                    System.out.printf("Le périmètre du triangle rectangle est de %.2f", trp);
                    break;
            }

        }

        while (choix.equalsIgnoreCase("c"));
        System.out.println("merci d'avoir quitter");
        sc.close();
        // scanner.close();
    }
}