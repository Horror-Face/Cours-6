//Raphaël Desjardins
//2025-09-24
//TP 2

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Scanner scanner = new Scanner(System.in);
        String choix;
        int nomcer = 0;
        int nomtri = 0;
        double peritot = 0;
        LocalDate date = LocalDate.now();
        String dateFormatee = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
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

                    System.out.printf("Le prérimètre est de %.3f et le diamètre est de %.2f", peri, dia);
                    nomcer++;
                    peritot += peri;
                    break;
                case "b":

                    boolean correct = false;
                    double base = 0;
                    double haut = 0;
                    do {

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
                    nomtri++;
                    peritot += trp;
                    break;
            }
        } while (!choix.equalsIgnoreCase("c"));
        double moyenne = peritot / (nomcer + nomtri);
        System.out.println("merci d'avoir quitter");
        System.out.printf("|====================================================|%n");
        System.out.printf("|%-35s|%16s|%n", "Nombre de cercle traité", nomcer);
        System.out.printf("|====================================================|%n");
        System.out.printf("|%-35s|%16s|%n", "Nombre de triangle traité", nomtri);
        System.out.printf("|====================================================|%n");
        System.out.printf("|%-35s|%16.2f|%n", "Périmetre total traité", peritot);
        System.out.printf("|====================================================|%n");
        System.out.printf("|%-35s|%16.2f|%n", "Moyenne du périmetre total traité", moyenne);
        System.out.printf("|====================================================|%n");
        System.out.printf("|%-35s|%16s|%n", "Date de la saisie ", dateFormatee);
        System.out.printf("|====================================================|%n");

        sc.close();
        // scanner.close();
    }
}