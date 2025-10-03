
//Raphaël Desjardins
//2025-09-24
//TP 2

package Java6;

import java.util.Scanner;

public class Codeia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choix;
        
        
        int nombreCercles = 0;
        int nombreTriangles = 0;
        double perimetreTotal = 0;
        
        do {
            System.out.printf(
                    "%na. Périmètre et diamètre d'un cercle\nb. Périmètre d'un triangle rectangle\nc. Ciao, bye! C'est le temps de faire le sommaire final%n");
            System.out.print("Votre choix : ");
            choix = sc.nextLine();

            switch (choix.toLowerCase()) {
                case "a":
                    
                    double rayon = 0;
                    boolean validRayon = false;
                    do {
                        System.out.print("Entrez un rayon: ");
                        if (sc.hasNextDouble()) {
                            rayon = sc.nextDouble();
                            sc.nextLine();

                            if (rayon > 0) {
                                validRayon = true;
                            } else {
                                System.out.println("Le rayon doit être positif.");
                            }
                        } else {
                            System.out.println("Mauvaise entrée. Veuillez entrer un nombre.");
                            sc.nextLine();
                        }
                    } while (!validRayon);

                    double diametre = rayon * 2;
                    double perimetre = 2 * Math.PI * rayon;
                    System.out.printf("Le périmètre est de %.3f et le diamètre est de %.2f%n", perimetre, diametre);

                    
                    nombreCercles++;
                    perimetreTotal += perimetre;
                    break;

                case "b":
                    
                    double base = 0, hauteur = 0;
                    boolean validBase = false;
                    do {
                        System.out.print("Entrez un nombre entier positif pour la base: ");
                        if (sc.hasNextDouble()) {
                            base = sc.nextDouble();
                            sc.nextLine();

                            if (base > 0) {
                                validBase = true;
                            } else {
                                System.out.println("La base doit être positive.");
                            }
                        } else {
                            System.out.println("Mauvaise entrée. Veuillez entrer un nombre.");
                            sc.nextLine();
                        }
                    } while (!validBase);

                    boolean validHauteur = false;
                    do {
                        System.out.print("Entrez un nombre entier positif pour la hauteur: ");
                        if (sc.hasNextDouble()) {
                            hauteur = sc.nextDouble();
                            sc.nextLine();

                            if (hauteur > 0) {
                                validHauteur = true;
                            } else {
                                System.out.println("La hauteur doit être positive.");
                            }
                        } else {
                            System.out.println("Mauvaise entrée. Veuillez entrer un nombre.");
                            sc.nextLine();
                        }
                    } while (!validHauteur);

                    double hypotenuse = Math.sqrt(base * base + hauteur * hauteur);
                    double perimetreTriangle = base + hauteur + hypotenuse;
                    System.out.printf("Le périmètre du triangle rectangle est de %.2f%n", perimetreTriangle);

                    
                    nombreTriangles++;
                    perimetreTotal += perimetreTriangle;
                    break;

                case "c":
                    
                    System.out.println("\nCiao, bye! Voici le sommaire de votre exécution :");
                    System.out.printf("%-30s%-15s%n", "Nombre de cercles traités", nombreCercles);
                    System.out.printf("%-30s%-15s%n", "Nombre de triangles rectangles traités", nombreTriangles);
                    System.out.printf("%-30s%-15.2f%n", "Périmètre total de toutes les formes", perimetreTotal);
                    
                    
                    int totalFormes = nombreCercles + nombreTriangles;
                    if (totalFormes > 0) {
                        double perimetreMoyen = perimetreTotal / totalFormes;
                        System.out.printf("%-30s%-15.2f%n", "Périmètre moyen de toutes les formes", perimetreMoyen);
                    } else {
                        System.out.println("Aucune forme n'a été traitée, donc aucun périmètre moyen.");
                    }

                    System.out.println("Merci d'avoir utilisé le programme !");
                    break;

                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }

        } while (!choix.equalsIgnoreCase("c"));
        
        sc.close();
    }
}

