package package7_arrays;

import java.util.Scanner;

public class C14_MDArrays {
    public static void main(String[] args) {

        // kullanicidan bir cümle isteyecez ve cümledeki kelime sayisini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String cümle=scan.nextLine();

        String arr[]=cümle.split( " "); // kelime leri bölerek sayiyi buluruz hiclik deseydik harfleri buluruz
        // burada kelime istedigimiz icin space ten bölüyoru

        System.out.println("Girdiginiz cümledeki kelime sayisi : " + arr.length);







    }
}
