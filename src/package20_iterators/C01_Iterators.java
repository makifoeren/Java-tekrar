package package20_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_Iterators {
    /*
    Java Iterator collection elemanlarimizin arasinda gezinmemize ve elemanlari degistirmemize yarar.
    Collections da her element index yapisini desteklemez, indey olmadan elemntlere ulasmak icin
    for-each loop kullanabiliriz ancak for-each loop ile elemntleri kalici olarak degistirme veya silme imkani
    olmadigi icin Iterator kullanimi tercih ederiz.
    Iterator nasil calisir


     */

    public static void main(String[] args) {


        List<Integer> liste = new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);


        System.out.println(liste); //[5, 7, 8, 6, 9]

        // for each kullanarak her elemani 2 artiralim

        for (Integer each:liste
        ) {
            each=each+2;

        }
        System.out.println(liste); // geerceklesmez [5, 7, 8, 6, 9]
        // each for loop icinde olustugu icin orada kalir


        Iterator itr= liste.iterator(); // Iterator dolasip istenileni yapacak
        /*
        liste obj uzerinden bagli oldugu class taki iteretor method unu cagircaz
        obj bagli oldugu data türünde List iterator method u arar
        ArrayList te override eilmisse onu calisitiri
         */
        /*
        Iterator nasil calisir
        bir iterator obj olusturmak icin collection üyesi bir obje kullanmaliyiz
        Iterator itr = liste.iterator();
        yani biz bu iterator obj bizim örnegimizde liste obj üzerinde calismak
        icin olusturmus olduk.
        Biz iterator obj olusturdugumuda itrator collection in ilk elemntinin öncesine gidip bekler

        [ (itr)5, 7, 8, 6, 9]

        itr.hasNext() =====> Iterator a yaninda elemnt var mi dye sorar true/false
        itr.next() ====> iterator bir sonraki elemntin yanina gecer,
                            ve üzerinden gectigi elementi bize döndürür.
                             [ 5, (itr) 7, 8, 6, 9] ===> 5
          itr.remove() ===> Iterator in elide olan elemnti sildi
                            üst üste iki kere kullanilamaz
                            önce   itr.next()    yapip bir elemnt yakalatip silebiliriz

         */

        System.out.println(itr.hasNext()); //true
        System.out.println(itr.next()); // 5
        System.out.println(itr.next()); // 7
        itr.remove(); // 7 yi sildi
        System.out.println(liste); // [5, 8, 6, 9]





    }
}
