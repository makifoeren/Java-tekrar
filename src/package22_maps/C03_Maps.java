package package22_maps;

import java.util.*;

public class C03_Maps {

    public static void main(String[] args) {
        // siniftaki ogrenci listesini duzenli olarak yazdiralim

        Map<Integer, String> sinifListMap = MapOlustur.myMap();
        System.out.println(sinifListMap); //{101=Ali, Can, Dev, 102=Veli, Yan, QA, 103=Ali, Yan, C#}

         /*
        Eger key lere tektek ulasmak istersek index yapisina ihtiyac var
        ancak map index yapisini desteklemz bunun icin once keyleri bir set e sonra da
        set in tüm elementlerini bir list e ekledik
         */

        Set<Integer> sinifKeySeti = sinifListMap.keySet();
        List<Integer> keyList = new ArrayList<>();
        keyList.addAll(sinifKeySeti);

        System.out.println(keyList); //[101, 102, 103]
        System.out.println(keyList.get(2)); // 103

        /*
        Value leri index ile ulasabilecegimiz bir sekle sokalim
         */


        Collection<String> sinifValueColl = sinifListMap.values(); // butun value leri bir yere attik

        System.out.println(sinifValueColl); // [Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, C#]
        System.out.println(sinifValueColl.size());//3

        List<String> sinifValueList = new ArrayList<>(); //MDA icin stringlerden olusan bir liste ekleyelim

        sinifValueList.addAll(sinifValueColl); //ekleme

        System.out.println(sinifValueList); //[Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, C#]


    /*
        her bir value birden fazla bilgiyi iceriyor
        onun icin value leri multidimensional bir arr atmak mantikli duruyor
        ancak MDA olusturmak icin boyutlari bilmeya ihtiyac var
         */

        int outerArrayBoyut = sinifValueList.size();
        System.out.println(outerArrayBoyut); //3

        // inner arr boyutunu bulmak biraz daha kompleks olacak

        String ilkValue = sinifValueList.get(0); // iceriye girmis olduk
        System.out.println(ilkValue); //Ali, Can, Dev

        String ilkValueArray[] = ilkValue.split(", "); // kac elemantten olustugunu bulmak icin
        int innerArrayBoyut = ilkValueArray.length;
        System.out.println(innerArrayBoyut); //3

        String valueMDArr[][] = new String[outerArrayBoyut][innerArrayBoyut];

        for (int i = 0; i < outerArrayBoyut; i++) { //Arr index yapisini desledigi icin
            String temp[] = sinifValueList.get(i).split(", ");


            for (int j = 0; j < innerArrayBoyut; j++) {

                valueMDArr[i][j] = temp[j];
            }

        }

        // System.out.println(Arrays.deepToString(valueMDArr)); //[[Ali, Can, Dev], [Veli, Yan, QA], [Ali, Yan, C#]]

        /*
         bu satira kadar key leri index ile ulasabildigim keyList e atadim
         value leri valueMDArr e atadim
         simdi bu key ve valuleri istedigim gibi manupule edebilirim
         */

        System.out.println("Numara  Isim   Soyisim  Brans");
        System.out.println("=============================");

        for (int i = 0; i < keyList.size(); i++) {
            System.out.print(keyList.get(i) + "   ");

            for (int j = 0; j < innerArrayBoyut; j++) {
                System.out.print(valueMDArr[i][j] + "   ");
            }

            System.out.println(" ");
        }


    }
}
