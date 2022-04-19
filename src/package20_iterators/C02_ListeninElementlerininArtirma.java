package package20_iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C02_ListeninElementlerininArtirma {
    public static void main(String[] args) {
        // verilen listedeki her elementi 3 artirin

        List<Integer> liste= new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);

        System.out.println(liste); // [5, 7, 8, 6, 9]

        /* listenin tum elementlerini bize getirmesi icin
           iterator'un hasNext() ve next() methodlarini kullanacagiz
         */

        // Iterator itr=liste.iteretor() itr olusturma neyin üzerinden istiyorsak onun obj ile olusturuyoru

         ListIterator itr = liste.listIterator();

        while(itr.hasNext()){ // yaninda element oldugu muddetce calisacak listeyi bitirinceye kadar
            // hem yazdirip hemde basa gidecek
            // System.out.println(itr.next());


            // 3 artirmak icin
            // itr de set olmadigi icin degistirme öz. olmuyor itr.next ile sadece gezinme yapabiliri

            Object sayi= itr.next();
            itr.set((Integer)sayi+3);

        }

        System.out.println(liste); // [8, 10, 11, 9, 12]

    }
}
