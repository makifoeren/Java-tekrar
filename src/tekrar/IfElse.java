package tekrar;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {


        String kulAdi = "yazilimbilimi";
        String parola = "234456";

        Scanner scan = new Scanner(System.in);

        System.out.println("Kullanici Adi Giriniz");
        String kullaniciAdi = scan.nextLine();

        System.out.println("Parola giriniz");
        String kullaniciParola = scan.nextLine();

        if (!(kulAdi.equals(kullaniciAdi))&& !(parola.equals(kullaniciParola))){
            System.out.println("kullanici adi ve parola yanlis");

        }
        else if((kulAdi.equals(kullaniciAdi))&& !(parola.equals(kullaniciParola))){
            System.out.println("parola yanlis");

        } else if(!(kulAdi.equals(kullaniciAdi))&& (parola.equals(kullaniciParola))){
            System.out.println("kullanici adi  yanlis");

        }
        else
            System.out.println("giris basarili");

    }


    /*
    || bir tane true varsa true donmesi icin yeterli
    && bir tane false varsa false doner
     */
}
