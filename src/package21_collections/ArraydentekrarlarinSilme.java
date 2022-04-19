package package21_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ArraydentekrarlarinSilme {

    public static void main(String[] args) {


        // verilen bir array'den tekrar eden elementleri silip
        // unique elementler olusan bir array haline donduren bir method olusturun

        Integer arr[] = {3, 5, 4, 6, 3, 1, 2, 7, 8, 6, 1, 4, 2, 8};

        arr=benzersizYap(arr);

        System.out.println(Arrays.toString(arr));

/*
*
 */
    }

    private static Integer[] benzersizYap(Integer[] arr) {
        Set<Integer> benzersizSet = new TreeSet<Integer>(); //HashSet [1, 2, 3, 4, 5, 6, 7, 8]
                                                            // TreeSet [1, 2, 3, 4, 5, 6, 7, 8]
        for (Integer each:arr
             ) {
            benzersizSet.add(each);
        }
        System.out.println(benzersizSet);

        // Set de index yapisi yoktur dolayisiyla forLoop kullanamayiz

        // Set'de index yapisi yoktur, dolayisiyla forLoop kullanamayiz
        Integer arrBenzersiz[]=new Integer[benzersizSet.size()];
        int index=0;
        for (Integer each: benzersizSet
        ) {
            arrBenzersiz[index]=each;
            index++;
        }
        return arrBenzersiz;
    }
}