package Java6;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 10;
// démo while
        while (a > 0) {
            System.out.printf(" La valeur A est %d %n", a);
            a = a - 1;
        }
        int b = 0;
        do{
            System.out.printf("La valeur de b est %d%n", b);
            b = b + 1;
        }while(b<=100);
            sc.close();
        }
        
    }
