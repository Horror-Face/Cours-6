package Java6;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 10;

        while (a > 0) {
            System.out.printf(" La valeur A est %d %n", a);
            a = a - 1;
        }
        System.out.println("A est plus petit");
        sc.close();
    }
}