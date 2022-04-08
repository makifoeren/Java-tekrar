package package7_arrays;

import java.util.Arrays;

public class C08_Splitsoru {

    public static void main(String[] args) {

        //verilen bir cümlede istenen harfin kac defa kullanildigini yazdiran bir method olusturun

        String cümle="Nerede o 'hello world' yazdiramayan ögrenciler ?";
        String harf="o";

        kacKereKullanilmis(cümle,harf);




    }

    private static void kacKereKullanilmis(String cümle, String harf) {

        int sayac=0;

        String karakterler[]=cümle.split(""); // harflerine ayirmak icin kullendik cüleyi böylece arr cevirdik
        System.out.println(Arrays.toString(karakterler)); // sonra for Loop la bu parcalananlari aliyorz
        // [N, e, r, e, d, e,  , o,  , ', h, e, l, l, o,  , w, o, r, l, d, ',
        // , y, a, z, d, i, r, a, m, a, y, a, n,  , ö, g, r, e, n, c, i, l, e, r,  , ?]
        for (int i = 0; i < karakterler.length; i++) { // o dan baslasin arr uzunlugu kadar
            if (karakterler[i].equals(harf)) { // egeer karakterlerin i. indexsteki elementi equel harfe esitse sayac i 1 artir
                sayac++;
            }
        }
        System.out.println("Aradiginiz  " + harf + " verieln cümlede " + sayac + " adet kullanilmis ");
        //Aradiginiz  o verieln cümlede 3 adet kullanilmis

    }
}
