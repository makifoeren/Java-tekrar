package package8_list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class C04_ContainsCollection {
    public static void main(String[] args) {

        // 7. method contains Array in icinde olup olmadigini bulmak icin kullanilir
        // elemen var sa true yksa falsa

        List<String> harfler=new ArrayList<>();

        harfler.add("D"); // [D]
        harfler.add("M"); //[D,M]
        harfler.add(1,"T"); // [D,T,M]
        harfler.add(0,"T"); //[T, D, T, M]

        System.out.println(harfler);
        harfler.contains("T");
        System.out.println(harfler.contains("T")); //true
        System.out.println(harfler.contains("f")); //false

        List<String> karakterler=new ArrayList<>();
        karakterler.add("M");
        karakterler.add("T");
        System.out.println(harfler.containsAll(karakterler)); // t ve me bu listede var mi ? true
        // harfler listesi karakterler listesini iceriyor mu diye soruyor sira önemli degil

        karakterler.add("F");
        System.out.println(harfler.containsAll(karakterler)); // false

        // 8. method collections.sort
        // ArrayList deki elemnlari kücükten büyüge veya alfabetik siraya göre dizer

      //  Collection.sort(harfler);
        System.out.println(harfler);








    }

}
