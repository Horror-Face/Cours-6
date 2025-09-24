//Raphaël Desjardins
//2025-09-24
//TP 2
package Java6.Exercice2;

import java.util.Scanner;

public class Exer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14;
        Scanner scanner = new Scanner(System.in);
        String choix;
        do {
            choix = "";
            System.out.println(
                    "a. Périmètre et diametre d'un cercle\nb. Périmetre d'un triangle rectangle\nc. Ciao, bye! C'est le temps de faire le sommaire final");
            System.out.print("Votre choix : ");
            choix = scanner.next(); // la variable de contrôle est mise à jour
            switch (choix) {
                case "a":
                    System.out.print("Entré un rayon: ");
                    double ray = sc.nextDouble();
                    double dia = ray * 2;
                    double peri = (double) (2 * pi * ray);
                    Math.round(peri);
                    System.out.printf("Le prérimètre est de %f et le diamètre est de %f", peri, dia);

            }

        }

        while (choix != "c");
        System.out.println("merci d'avoir quitter");
        sc.close();
        scanner.close();
    }
}