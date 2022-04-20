package package21_collections;

import java.util.HashSet;
import java.util.Set;

public class C07_RetainAll {
    public static void main(String[] args) {


        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();

        set1.add(10);
        set1.add(29);

        set2.addAll(set1);
        set2.add(24);
        set2.add(36);

        System.out.println(set1); //[10, 29]
        System.out.println(set2); //[36, 24, 10, 29]

        System.out.println(set2.retainAll(set1)); // true


        System.out.println(set1); //[10, 29]
        System.out.println(set2); //[10, 29] gidip haric i siliyor set1 le ortak olanlarigetiri


    }
}
