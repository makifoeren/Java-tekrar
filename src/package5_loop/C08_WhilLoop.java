package package5_loop;

import java.util.Scanner;

public class C08_WhilLoop {
    public static void main(String[] args) {

    // kullanicidan kac sayi toplamak istedgini alin
    // ve bu sayilarin toplamini ekrana yazdirin

    int sayiAdedi=4;
    Scanner scan=new Scanner(System.in);
    int sayi=0;
    int toplam=0;

    for (int i=1; i<=sayiAdedi; i++) {
        System.out.println("lütfen bir sayi giriniz");
        sayi= scan.nextInt();
        toplam+=sayi;
    }
     System.out.println("Girilen " + sayiAdedi + " sayinin toplami  = " + toplam);


    // While ile yapimi

        sayi=0;
        toplam=0;
        int sayac=1;

        while(sayac<sayiAdedi){
            System.out.println("Lütfen sayi yaziniz");
            System.out.println("lütfen bir sayi giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;
            sayac++;
        }
        System.out.println("Girilen " + sayiAdedi + " sayinin toplami  = " + toplam);


    }
}