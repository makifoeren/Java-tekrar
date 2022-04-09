package package8_list;

import java.util.Arrays;
import java.util.List;

public class C09_ArraydenListecevirme {

    public static void main(String[] args) {

        // verilen bir array'i listeye cevirin
        String arr[]={"A" , "B" , "C"};

        List<String> arraydenList= Arrays.asList(arr);

        // arrayden liste cevirdigimiz zaman yeni listin uzunlugunu degistiremeyiz
        // dolayisiyla yeni list ile add() , remove(), clear() gibi method'lar calistirmak
        // istedigimizde Exception olusur
        // arraydenList.add("J"); // UnsupportedOperationException
        System.out.println("19.satirda list :" + arraydenList); //19.satirda list :[A, B, C]
        arr[1]="F";

        // arr atama yapsaniz list degisir veya tam tersi hangisi degisirse otomtikmen digeride degisir
        System.out.println("23.satirda Array : " + Arrays.toString(arr)); //23.satirda Array : [A, F, C]
        System.out.println("24.satirda list :" + arraydenList); //24.satirda list :[A, F,
        arraydenList.set(0,"Y");


        System.out.println("28.satirda Array : " + Arrays.toString(arr)); //28.satirda Array : [Y, F, C]
        System.out.println("29.satirda list :" + arraydenList); //29.satirda list :[Y, F, C]



    }
}
