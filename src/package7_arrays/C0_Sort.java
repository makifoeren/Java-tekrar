package package7_arrays;

import java.util.Arrays;

public class C0_Sort {
    public static void main(String[] args) {

  /*  // arrays i siralamak icin Sort method u kullanilir

    String arr[]={"S","E","L","M"};
        System.out.println(Arrays.toString(arr)); //[S, E, L, M]

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //[E, L, M, S]
        /*
        Java da bu siralamya Nutural Order denir sayi olursa kücükten büyüge
        metin olursa alfabetik siraya göre
         */

        int arr1[]={1,4,7,9,32,4,5,99};

        System.out.println(Arrays.toString(arr1));//[1, 4, 7, 9, 32, 4, 5, 99]
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1)); //[1, 4, 4, 5, 7, 9, 32, 99]

        // verilen bir array de en kücük ve en büyük degerleri yazdirin

        int arr2[]={3,5,6,1,9,0,45,25,4,9,0};

        // sort olmadan yapalim

        int enKücükSayi=Integer.MAX_VALUE;
        int enBüyükSayi=Integer.MIN_VALUE;

        for (int i = 0; i <arr2.length; i++){
            if (arr2[i]<enKücükSayi){

                enKücükSayi=arr2[i];

            }
            if (arr2[i]>enBüyükSayi){
                enBüyükSayi=arr2[i];
            }
        }

        System.out.println("Array deki en kücük sayi = " + enKücükSayi); // 0
        System.out.println("Array deki en büyük sayi = " + enBüyükSayi);// 45

        // Sort
        Arrays.sort(arr2);
        System.out.println("Array deki en kücük sayi = " + arr2[0]); // 0
        System.out.println("Array deki en büyük sayi = " + arr2[arr2.length - 1]); //45











    }
}