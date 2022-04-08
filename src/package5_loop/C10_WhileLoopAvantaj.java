package package5_loop;

import java.util.Scanner;

public class C10_WhileLoopAvantaj {
    public static void main(String[] args) {
        // kullanicidan istedigi kadar sayi girmesini isteyin
        // kullanicinin girdigi sayilarin toplami 500'u gecerse
        // artik yeter cok sayi girdin, toplam.... oldu yazsin

        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        int sayac=0;


        while(toplam<500) {
            System.out.println("Lütfen bir sayi giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;

            sayac++;
        }
        System.out.println("artik yeter " + sayac + " sayi girdin, toplam " + toplam + " oldu yazsin" );


    }
}
