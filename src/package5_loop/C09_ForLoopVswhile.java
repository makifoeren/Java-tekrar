package package5_loop;

import java.util.Scanner;

public class C09_ForLoopVswhile {

    public static void main(String[] args) {

        //Kullanicidan toplamak istedigi sayiyi alin kullanici 0 a basincaya kadar devam edin
        // kullanici o0 a bastiginda girdigi tüm sayilarin toplamini yazdirn

        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        /*
        for (int i = 1; i <1000000 ; i++) {
            System.out.println("lutfen bir sayi giriniz");
            sayi= scan.nextInt();
            if (sayi==0){
             break;
            } else {
                toplam+=sayi;
            }
        }

        System.out.println(toplam); */
        // baslangic bitis ve degisim degerleri net olan durumlarda for loop daha avantajlidir
        // belirsizlik varsa while loop daha avantajlidir
        sayi=1;
        toplam =0;
        while(sayi!=0){
            System.out.println("lutfen bir sayi giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;
        }
        System.out.println( toplam );


        }

    }
