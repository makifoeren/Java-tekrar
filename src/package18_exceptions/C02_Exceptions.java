package package18_exceptions;

public class C02_Exceptions {

    public static void main(String[] args) {
        // String olarak verilen bir sayiyi, integer'a cevirip
        // 2 katini ekranda yazdiralim

        String str = "1234a";

        int sayi = Integer.parseInt(str);

        // str icinde sayi olmayan bir karakter olursa
        // NumberFormatException.forInputString verir
        System.out.println("girilen sayinin iki kati : " + 2*sayi);

        // try catch yöntemi ile bu sorun cözülmüs


        try {  // bunu yapmaya calis hata görsende devam et
           // int sayi=Integer.parseInt(str);
            System.out.println("girilen sayinin 2 kati : " + 2*sayi);
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("girdiginiz string sayi olmayan elementler iceriyor");
        }









    }
}