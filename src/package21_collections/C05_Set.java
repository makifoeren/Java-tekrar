package package21_collections;

import java.util.HashSet;
import java.util.Set;

public class C05_Set {

    // verilen bir array in tekrar eden elementlerin
    //sadce bir kere yazdiran bir method olusturun

    public static void main(String[] args) {

        Integer arr[]= {3,5,4,6,3,1,2,7,8,6,1,4,2,8};
        arrayiTekrarsizYazdiri(arr);



    }

    private static void arrayiTekrarsizYazdiri(Integer[] arr) {

        Set<Integer> tekrarsizElemanKumesi=new HashSet<>(); // set farkli dir kac tekrar olursa olsun bir tane atar

        for (Integer each: arr
             ) {
            tekrarsizElemanKumesi.add(each);

        }
        System.out.println(tekrarsizElemanKumesi); //[1, 2, 3, 4, 5, 6, 7, 8]
    }

}
