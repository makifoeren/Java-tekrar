package package7_arrays;

import java.util.Arrays;

public class C03_BüyüktenKücügeSiralama {


        public static void main(String[] args) {

            // verilen bir arrayi buyukten kucuge siralayip yazdiran bir method olusturun
            int arr[]= {3,5,6,1,9,45,25,4,9,0};
            terstenSiralaYazdir(arr);  // once arr yi tersten yazdir method u olusturacaz


            // en büyük sayi yi yazdirmak istesek 1. elemti yazsak kaydetmedigimiz icin bize 45 i vermez
            //siralam yaptik ama ters siralama yapmadik
            // siralamadan sonra kaydetmek ve bundan sonra böyle kullanacksaniz geri döndürüp kaydetmek lazim
            // method ta yazdirdigimiz icin kullanamiyoruz
            System.out.println(arr[0]); // 0



        }


    private static void terstenSiralaYazdir(int[] arr) { // void birakiyoruz sadece yazdirmak icin
                                       // public yaptik baska class larda lazim olsa kullanmak icin

        Arrays.sort(arr);// [0, 1, 3, 4, 5, 6, 9, 9, 25, 45] arr siraladik
        System.out.println(Arrays.toString(arr)); // [0, 1, 3, 4, 5, 6, 9, 9, 25, 45]

        int tersArr[]=new int[arr.length]; //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0] java default deger atadi
        System.out.println(Arrays.toString(tersArr));  //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        for (int i = 0; i <arr.length ; i++) { // 0 dan basladik  forr ters arr in 0 inci elementi normal elementin
            // son elementini almali
            // normalde yapsak arr.length-1 yapardik sbt olur ve hep ayni degeri atar
            // i ye bagli olsun diye i degeri atadik 1 elemnte son elemnten 1 eksigi yazacak basa kadar gidecek
            tersArr[i]= arr[arr.length-1-i] ;
        }
        System.out.println(Arrays.toString(tersArr)); //[45, 25, 9, 9, 6, 5, 4, 3, 1, 0]

    }


}
