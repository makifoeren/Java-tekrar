package package8_list;

import package7_arrays.C13_ArraysSoru;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_List {

    public static void main(String[] args) {
        /*
        ArrayList length i esnek olan bir Array dir
         */

        // Array e 3 ekleyelim

        int arr[]={};
        C13_ArraysSoru obj=new C13_ArraysSoru();
        C13_ArraysSoru.arrayeElemanEkle(arr,3);
        arr=C13_ArraysSoru.arrayeElemanEkle(arr,3);
        System.out.println(Arrays.toString(arr)); // [3]

        arr=C13_ArraysSoru.arrayeElemanEkle(arr,8);
        System.out.println(Arrays.toString(arr)); // [3, 8]

        // ArrayList olusturma
        ArrayList<String> list1=new ArrayList<String>();
        ArrayList<String> list2=new ArrayList<>();
        List<String> list3=new ArrayList<>(); // en cok tercih edilen
       //  ArrayList<String> list4=new List<>(); cte hatasi verir sagde ArrayList kullanmak zorundayiz

        // ArrayList yazdirma
        System.out.println(list3); //[]

        // 1 - add() method du ile ArrayList e eleman eklemek icin kullanilir

        List<String> hayvan=new ArrayList<>();
        hayvan.add("kedi"); // indexs ol,madan yapilabilir [kedi]
        hayvan.add("serce"); // [kedi,serce]

        hayvan.add(1,"aslan"); //[kedi,aslan,serce]
        hayvan.add(3,"kus");

        System.out.println(hayvan); //[kedi, aslan, serce, kus]

        // 2 - method size()  ArrayList in kac elemn oldugunu gösterir

        List<String > sayilar=new ArrayList<>();
        System.out.println(sayilar.size()); // 0
        sayilar.add("2");
        sayilar.add("5");
        System.out.println(sayilar.size()); // 2

        // 3. method isEmpty ArrayList bos ise true degilse false döndürür

        System.out.println(sayilar.isEmpty()); // false

























    }


}
