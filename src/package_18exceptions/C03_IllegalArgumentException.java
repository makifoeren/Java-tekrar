package package_18exceptions;

import java.util.Scanner;

public class C03_IllegalArgumentException {
    public static void main(String[] args) {

         /*
        kullanicidan yasini isteyin
        kullanici yas olarak negatif bir sayi,
        0 veya 120 den büyük bir sayi girerse illegalArgumentException
        olusacak sekilde bir program yaziniz
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yasinizi girinizz");
        int yas =scan.nextInt();


        if (yas<=0 || yas>120){
            //System.out.println("Lütfen gecerli bir yas girinzi");
            //Java bizim istedigimiz durumlarda da exception firlatabilir

            throw new IllegalArgumentException(); // kodun calismasi ni durdurmak icin

        }else System.out.println("Uygun bir yas girdiniz");





    }
}
