package package4_methodCreation;

public class C06_MethodCreation {
    public static void main(String[] args) { //1

        // string i yazdiran method olusturalim

        //hosgeldiniz diyen bir method olusturun

        // kapanma mesaji yazan bir method olusutur


        hosgeldinYazdir(); //2

    }//14

    private static void kapanmaMethodu() { //9
        System.out.println("Bizi tercih ettiginiz icin tesekkür ederiz"); //10
    } //11

    public static void hosgeldinYazdir() { //3
        System.out.println("Hosgeldin"); //4

        stringYazdir("Böylede olur"); //5
    } //13

    private static void stringYazdir(String str) { //6
        System.out.println(str); //7

        kapanmaMethodu(); //8
    } //12

    }

