package package19_garbage_abstractClass_Interface;

public class C01_Final {
// class final yapilirsa Parent olmaz

    final static double pisayisi=3.14; // final degisime karsi korur ulasilabilir kakat degistirilamez
    public static void main(String[] args) {

        final int sayi=10;

       // sayi=20; final a deger aTAMASI YAPILAMAZ


    }

    public final static void method1() {
        System.out.println("Parent class final method1");
    }
    }

