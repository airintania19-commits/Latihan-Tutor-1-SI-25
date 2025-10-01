import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;

        a = Integer.parseInt(input.nextLine());
        b = Integer.parseInt(input.nextLine());
        if (a % 2 == 0) {
            System.out.println("bilangan pertama:genap");
        } else {
            System.out.println("bilangan pertama:ganjil");
        }
        if (b % 2 == 0) {
            System.out.println("bilangan kedua:genap");
        } else {
            System.out.println("bilangan kedua:ganjil");
        }
        if (a > b) {
            System.out.println("Bilangan pertama lebih besar");
        } else {
            if (b > a) {
                System.out.println("Bilangan kedua lebih besar");
            } else {
                System.out.println("keduanya sama besar");
            }
        }
        if (a % 2 == 0 && b % 2 == 0) {
            System.out.println("keduanya genap hasil penjumlahan=" + a + b);
        } else {
            if (a % 2 != 0 && b % 2 != 0) {
                System.out.println("keduanya ganjil hasil perkalian=" + a * b);
            } else {
                System.out.println("berbeda jenis");
            }
        }
    }
}
