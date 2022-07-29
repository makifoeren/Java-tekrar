package tekrar;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi = scan.nextInt();
        int toplam = 0;
        do {

            toplam += sayi % 10;

            sayi = sayi / 10;
            System.out.println("toplam= " + toplam + " sayi " + sayi);


        }
        while (sayi > 0);
        System.out.println("toplam" + toplam);
    }
}
