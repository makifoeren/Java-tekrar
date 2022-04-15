package package18_exceptions1;

public class Tanim {

    /*
        Exception'lar icin de parent child iliskisi mevcuttur
        Eger bir kod icin birden fazla exeption olusma ihtimali varsa
        Oncelikle olasi exception'lar parent-child iliskisi tasiyor mu bakmamiz gerekir
        Eger parent child iliskisi yoksa, istedigimiz sirada catch cumleleri olusturabiliriz
        Eger Parent child iliskisi varsa
        sadece parent exception'i yazabiliriz
        veya ikisini de yazmak istersek
        child'i once parent'i sonra yazmaliyiz
         */
        /*
        Alti kirmizi cizili her kod CTE degildir
        Java syntax hatalarini derleme esnasinda (compile) farkeder ve altini cizer
        biz bu gune kadar tamamina CTE diyorduk ancak
        exception konusu ile birlikte
        Compile Time Exception kavrami da hayatimiza girdi
         */
        /*
        1-- sorunlar fazla ise ic ice try catch veya bir try birden cok catch konabilir
        2-- eger tüm exception iceren bir  exception varsa sadece onu yazabiliriz
        FNF daha dar kapsamli ama delikleri büyük
        IOE daha genis kapsamli ama delikleri kücük

        ExceptionTypes

        1- Compile Time Checked Exceptions
        kod yazidiginda Java ongördügü olasi sorunlardir.
        Java olasi bir problem gördügünde kirmizi cizgi ile bizi uyarir
        her kirmizi cizgi excetion degil

        2 - Run time Unchecked Exception
        Kod calistiginda ortaya cikan dir.

        3- NullPointerException
        null obj uygun olmayam bir komutla kullanilinca verir
        RT exception dir

        4- ArrayIndexOutOfBoundsException
        Arr ve List olmayyan bir indexs icin islem yapmak istersek verir
           RT exception dir

        5- ClassCastException
        Bir datayi casting yapilamyacak bir datya cevirmek istediginizde verir
           RT exception dir

        6- NumberFormatException  sayi olmayan bir string i sayiya cevirmeye calisilinca verilen hata.
           RT exception dir

        7- IllegalArgumentException
        kodu durdurmak icin kullanilir
        RT exception#


        8- Finally block
        Try catch ile kullanilir her durmda calisir
        cloud veya datbase ile connection i bitirmek veya üzerinde calisilan dosyayi kapatmak gibi islemler icin kullanilir.
        catch olmadan sadece try ile kullanilabilir
         */
     /*
        throw ve throws
         throws -- checked exception icin kullanilir
         throws key exception handle yapilamk istenmiyorsa kullanilir exception olusunca program calismasi durur
         throws key den sonra aralara virgül konuarak birden fazla exception yazilabilir
         throws key method icerisinde kullanilamaz kullanilacaksa method isminin noldugu satirda yazilmali
         throws key den sonra birden fazla exception kullanilacaksa yazilan exceptionlar arasinda parent iliskidi varsa ,
         child exception yazilabilir ama tavsiye edilmez. Cunku parent tüm durumlari kapsayacak

         Throw key kontrollu olarak bir exception throw etmek icin kullanilir
         Throws ise bir veya birden fazla exception u deklare etmek icin kullanilir

         Throw key ile sadece bir exception throw edilir.
         Throws ile bir veya birden fazla

         Throw key method un icinde kullanilir.
         Throws key method signature ile kullanilir.

         Throw key yazdiktan sonra variable yailir (Ör. new IIlegalargumentException)
         Throws keyyazdiktan sonra exception class ismi yazilir FileNotFoundException



         */

}
