package package7_arrays;

import java.util.Arrays;

public class C13_ArraysSoru {
    public static void main(String[] args) {


    // verilen bir Array e yeni bir element ekleyin bir method olusturun

    int arr[]={3,5,7};
    int eklenecekElement=6;

    // önce method olusturaacz ve argümant verecegiz
    // arr yi degistirecegi icin bize bir arr dönsün benim arr  eski yi silip yeni devam etsin
        // method u arr esitlecez

        arr = arrayeElemanEkle(arr,eklenecekElement);
        arr=arrayeElemanEkle(arr,11);

        System.out.println(Arrays.toString(arr)); //[3, 5, 7, 4]


    }

    public static int[] arrayeElemanEkle(int[] arr, int eklenecekElement) {

        int yeniArray[] = new int[arr.length + 1]; // [0,0,0,0]  bos konteyner yeni elemntin uzungu eskisi +1

        for (int i = 0; i < arr.length; i++) {

            yeniArray[i] = arr[i]; // yeni arr 0 eski arr 0 elemnti esit


        }
        yeniArray[yeniArray.length-1]=eklenecekElement;  // burada da ekleme yapip döndürdük
        return yeniArray;
    }}