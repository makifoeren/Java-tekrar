package package8_list;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {

    public static void main(String[] args) {

        // 4. method Remove ArrayList belli bir elemeni silmek icin kullanilir,
        // istenilen elementi kaldirip true veya false döner
        // boolean ile bunun gerceklestigini görebiliriz


        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(45);
        sayilar.add(5);
        sayilar.add(4);
        sayilar.add(415);
        sayilar.add(450);
        System.out.println(sayilar); //[45, 5, 4, 415, 450]

        sayilar.remove(3); // true göremeyiz bir boolean sonuca esitleyecez


        System.out.println(sayilar.remove(1));  // 5   // indexi verip silebiliriz fakat bu sefer sildigini bize döndürür

        System.out.println(sayilar); // [45, 4, 450] en son kalanlar
       // sayilar.remove(5); // rte
      /* sayilardan olusan bir liste de objeyi vererk elemnt silme method u calismaz
        sayi degeri girdigimzde Java otomatik olarak sayiyi index kabul eder
         */

       // int sayi=4;
        //sayilar.remove(sayi); rte hatasi

        Integer sayi=5; // Wrapper class indan obje oldugu icin calisir
        sayilar.remove(sayi);
        System.out.println(sayilar); // [45, 4, 450] farki bunun obj olmasi


    }
}
