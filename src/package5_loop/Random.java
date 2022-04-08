package package5_loop;

import java.util.Scanner;

public class Random {

    public static void main(String[] args) {

        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

        java.util.Random rnd=new java.util.Random(); // rasgele
        int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur

        Scanner scan= new Scanner(System.in);
        int tahmin=0;
        int sayac=1;

        while(sayi!= tahmin){
            System.out.println("Lütfen bir sayi giriniz");
            tahmin=scan.nextInt();

            if (tahmin>sayi){
                System.out.println("daha kücük bir sayi soylemelisin");
                sayac++;
            }else if (tahmin<sayi){
                System.out.println("Daha büyük bir sayi söylemelisin");
                sayac++;
            }

        }
        System.out.print(" Tuttugum sayiyi " + sayac + " tahminde buldunuz ");








    }
}
