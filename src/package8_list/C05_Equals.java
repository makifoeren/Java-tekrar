package package8_list;

import java.util.ArrayList;
import java.util.List;

public class C05_Equals {

    public static void main(String[] args) {
        // 9. method Equals iki listedeki ayni indexs teki elemanlarin ayni olup olmadigini kontrol eder.
        // ayni ise true degilse false döner hem index hem elemetler ayni olmali

        List<String> first = new ArrayList<String>();
        List<String>  second = new ArrayList<String>();
        System.out.println(first.equals(second)); // true iki bos liste

        first.add("a"); // [a]

        System.out.println(first.equals(second)); // false

        second.add("a"); // [a]
        System.out.println(first.equals(second)); // true

        first.add("b"); // [a,b]
        second.add(0,"b");// [b,a]
        System.out.println(first.equals(second)); // false

        // 10. method clear listedeki tüm elemnlari siler return typ void tir hic birsey dönmez

        System.out.println(first.isEmpty()); //false
        System.out.println(first.size()); // 2
        first.clear();
        System.out.println(first.isEmpty()); // true
        System.out.println(first.size()); //0







    }
}
