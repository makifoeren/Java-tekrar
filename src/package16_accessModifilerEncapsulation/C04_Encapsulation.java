package package16_accessModifilerEncapsulation;

public class C04_Encapsulation {

    public static void main(String[] args) {

/* Bir variable'i encapsule etmek icin
            1- Access modifier'i private yapariz
            2- okuma ve yazma ozelliklerinin kullanilmasini istedigimiz gibi sinirlayabiliriz
                - Eger sadece okunmasini istiyorsaniz getter
                - Sadece deger girilebilsin isterseniz setter
               methodlarini olustururuz.

           Bir variable icin hem getter hem setter olusturursaniz
           o variable public olmus gibi
           hem okuyup hem de yazilmasini saglayabilirsiniz

           Piyasada developer'lare arasinda genel uygulama da boyledir


         */
        C03 obj=new C03();


       // obj.sayi göremezsi

        obj.getSayi(); // dgeer vasrsa yazar yoksa 0
        System.out.println(obj.getSayi());

        obj.setStr("Java Java Java");
        System.out.println(obj.getStr()); // Java Java Java

        System.out.println(obj); // sayi=0, str=Java Java Java



    }

}


