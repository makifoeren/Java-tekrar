package package4_methodCreation;

import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
        /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */

        Scanner scan=new Scanner(System.in);
        System.out.println("Yapacaginiz dört islemi + - * / olarak seciniz");
        char islem=scan.next().charAt(0);

        System.out.println("Birinci sayi : ");
        double num1= scan.nextDouble();

        System.out.println("Ikinci sayi : ");
        double num2= scan.nextDouble();

        hesapMakinesi(islem,num1,num2);

    }

    private static void hesapMakinesi(char islem, double num1, double num2) {
        switch(islem) {
            case '+':
                System.out.println(num1 + " " + num2 + "=" + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " " + num2 + "=" + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " " + num2 + "=" + (num1 * num2));
                break;
            case '/':
                System.out.println(num1 + " " + num2 + "=" + (num1 / num2));
                break;

            default: {
                System.out.println("hatali giris yaptiniz");
            }

        }

    }
}
