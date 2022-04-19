package package20_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Örnek {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Kedi");
        list.add("Kuzu");
        list.add("Kelebek");
        list.add("Ari");

        System.out.println(list); // [Kedi, Kuzu, Kelebek, Ari]


        Iterator<String> yeniList=list.iterator();

        while(yeniList.hasNext()){
            yeniList.next();
            yeniList.remove();
        }
        System.out.println(list); // []

    }
}
