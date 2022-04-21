package package22_maps;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C02_ListeyiDuzenliYazdirma {


    public static void main(String[] args) {

        // Sinif listesini düzenli yazdir

      Map<Integer,String> sinif=  MapOlustur.myMap();

        System.out.println(sinif); //{101=Ali, Can, Dev, 102=Veli, Yan, QA, 103=Ali, Yan, C#}

        sinifListYazdir(sinif);


    }

    private static void sinifListYazdir(Map<Integer,String> sinif) {

        System.out.println("Numara isim Soyisim Brans");
        System.out.println("==========================");

        // Map yapisinda yazdirdigimizda kullanicilar bir sey anlamayabilir
        // bunun icin once map yapisini kodlarla manipule edip
        // map'deki datalari, istedigimiz formata sokmamiz gerekir
        // 1. adim key ve value'lari map'den alip
        // iki farkli collection uyesine atadik

        Set<Integer> keySet=sinif.keySet();
        Collection<String > valueSet=sinif.values();
       // Set<String > valueSet=(Set)sinif.values();

        System.out.println(keySet); //[101, 102, 103]
        System.out.println(valueSet); //[Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, C#]
        System.out.println(valueSet.size()); //3

        for (String each:valueSet
             ) {
            System.out.println(each); //Ali, Can, Dev
            // Veli, Yan, QA
            // Ali, Yan, C#
        }


    }


}
