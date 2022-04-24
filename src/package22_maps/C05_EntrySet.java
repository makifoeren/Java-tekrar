package package22_maps;

import java.util.Map;
import java.util.Set;

public class C05_EntrySet {
    /*
    her obj yi element olarak kabul ediyor entryset
     */
    public static void main(String[] args) {

        Map<Integer, String> sinifListMap = MapOlustur.myMap();

        System.out.println(sinifListMap);

        sinifListMap.entrySet();

        System.out.println(sinifListMap.entrySet()); // collection a cevirdik [] e cevirdik


          /*
        myMap..entrySet(); method u bize Entry lerden olusan bir set dondururu
        Eger bu Entry leri manipule  etmek istiyorsak
        method un dondugu Set i yeni bir Set olusturup store etmeliyiz
         */

        Set<Map.Entry<Integer, String>> sinifEntrySeti = sinifListMap.entrySet();
        System.out.println("No  Isim  Soyisim  Brans  D.Yili");
        System.out.println("________________________________");


        for (Map.Entry<Integer, String> each : sinifEntrySeti
        ) {
            // System.out.println(each); //101=Ali, Can, Dev, 1453
            //102=Veli, Yan, QA, 1249
            // 103=Ali, Yan, C#, 2000
            //104=Can, Yan, C#, 2345
            // 105=Hassan, Yan, Java, 1094


            Integer entryKey = each.getKey();
            String valueStr = each.getValue();

            String valueArr[] = valueStr.split(", ");

            //  System.out.println(entryKey + " " + valueArr[0] + " " + valueArr[1] +
            //        " " + valueArr[2] + " " + valueArr[3]);

            System.out.printf("%-4d %-6s %-9s %-6s %s\n", entryKey, valueArr[0], valueArr[1], valueArr[2], valueArr[3]);

        }
        System.out.println("________________________________");


    }
}
