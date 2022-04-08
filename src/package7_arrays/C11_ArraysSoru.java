package package7_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C11_ArraysSoru {
    public static void main(String[] args) {
        // kullanicidan kac elementlik bir ayrray olusturcagini sorun
        // array i olusturup elmentleri kullanicidan alip,array e atayin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen kac elemetli bir array istediginizi yazini");
        int uzunluk=scan.nextInt(); // 3

        int arr[]=new int[uzunluk]; // [0,0,0] icinde 0 olan bir arr olusur

        for (int i = 0; i < uzunluk ; i++) { // 0 dan baslasin uzunluktan kisa oldugu sürece devam etsin
            System.out.println("Array icin " + (i+1) +  " . elemani giriniz");
            arr[i]=scan.nextInt(); // ya gecici bir sayi yada direk buradaki gibi gecici bir sayi

        }
        System.out.println(Arrays.toString(arr));

    }
}
