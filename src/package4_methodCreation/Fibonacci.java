package package4_methodCreation;

import java.util.Scanner;

public class Fibonacci {

  /*
  Kullanicidan alinan bir tamsayi kadar(47 den kucuk) FIBONACCI dizisi olusturun. kendinden onceki sayilarin toplami
     0-1-1-2-3-5-8-13-21-34....

  */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("47 den kücük bir sayi giriniz : ");
        int sayi=scan.nextInt();
        fibonacci(sayi);
    }

    public static void fibonacci(int num){
        int sayi1=0;
        int sayi2=1;
        int sayi3;


        if (num<47){
            System.out.print( sayi1 + "-");
            System.out.print(sayi2 + "-");

            for (int i=2; i<num; i++){
                sayi3=sayi1+sayi2;
                System.out.print("-" + sayi3 );
                sayi1=sayi2;
                sayi2=sayi3;

            }

        }else {System.out.println("47 den kucuk bir sayi giriniz...");}

    }

}
