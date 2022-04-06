package package4_methodCreation;

import java.util.Scanner;

public class C01_MethodCreation {
    public static void main(String[] args) {
        // kullanicidan bir kelime isteyin
        //eger kelime 3 harften kisa ise ise "kelime cok kisa" yazdirin
        // eger kelime 3,4 veya 5 harfli ise harf sayisini yazdirin ve kelimenin tersten yazilisini yazdirin
        // eger 5 harften uzunsa " kelime cok  uzun" yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String input=scan.next();
        String tersKelime="";

        if (input.length()<3){
            System.out.println(" kelime cok kisa");
        }else if(input.length()<=5){
            if (input.length()==3){
                tersKelime=input.substring(2) + input.substring(1,2) + input.substring(0,1);

            }else if(input.length()==4) {
                tersKelime=input.substring(3) + input.substring(2,3) + input.substring(1,2) + input.substring(0,1);
            }else {
                tersKelime=input.substring(4) + input.substring(3,4) + input.substring(2,3) + input.substring(1,2) + input.substring(0,1);
            }
            System.out.println("girdiginiz kelimedeki harf sayisi = " + input.length());
            System.out.println(" girdiginiz kelimenin tersten yazilisi = " + tersKelime);
        }else {
            System.out.println("Kelime cok uzun");
        }






    }
}
