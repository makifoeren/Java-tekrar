package tekrar;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

     /*   int i=1;

        while (i<10){

            System.out.println(i +".java");
            i++;
        }
        System.out.println("dongu bitti");
        */

        Scanner scan=new Scanner(System.in);

        System.out.println("sayi giriniz");
        int sayi= scan.nextInt();

        int faktoriyel=1;

        while (sayi>=1){
            faktoriyel=faktoriyel*sayi;
            System.out.println("Faktoriyel "+ faktoriyel + " Sayi " + sayi);

            sayi--;
        }
        System.out.println(faktoriyel);
    }
}
