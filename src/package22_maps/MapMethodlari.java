package package22_maps;

import java.util.HashMap;
import java.util.Map;

public class MapMethodlari {

    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();

        myMap.put("H", 3);
        myMap.putIfAbsent("K", 5);

        // bir ekleme yapmakistedigimizde Key daha once eklemmemisse Map e
        // eklesin dah once eklenmisse, eskiyi silmemek icin bizi uyarsin

        System.out.println(myMap.putIfAbsent("A", 6)); // null

        //System.out.println(myMap.putIfAbsent("K",20)); // 5 eklemeyip eski degeri gelir
        //System.out.println(myMap); //{A=6, H=3, K=5}

        if (myMap.putIfAbsent("K", 20) != null) {
            System.out.println("Girdiginiz key Map te zaten var");
        }
        System.out.println(myMap);


        myMap.put("A", 10); // a yi bulup 10 yapiyor
        System.out.println(myMap); //{A=10, H=3, K=5}

        myMap.computeIfAbsent("A", v -> 20); // hesaplama demek

        System.out.println(myMap); //{A=10, H=3, K=5} a oldugu icin degistirmiyor

        myMap.computeIfAbsent("C", v -> 20);  // yoksa ekliyor

        System.out.println(myMap); //{A=10, C=20, H=3, K=5}

        myMap.compute("A", (key, value) -> 20); // iki formulle degistiriyor lamda ex

        System.out.println(myMap); //{A=20, C=20, H=3, K=5}

        //H nin degerini 2 katinin 5 fazlasi yapalim


        myMap.compute("H", (key, value) -> (2 * value + 5));

        System.out.println(myMap); //{A=20, C=20, H=11, K=5}




    }
}
