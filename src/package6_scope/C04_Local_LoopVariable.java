package package6_scope;

public class C04_Local_LoopVariable {

    /*
    herhangi bir method icerisinde olusturlan variable lerdir. sadece o method icin gecerlidir,
    baska methodlar icin olanlar class level de olusturmmak gereki
    class ta olusturulanlar baska bir method ta kullanilirsa lati kirmizi olur
    bir diger öz deger atamasi yapmazsan Java bunlara default yapmaz
     */

    public static void main(String[] args) {

        int sayi;
        //  sayi++;


  /*  public void  add() {
        String str;
        // System.out.println(str);

    } */

        // Loop Variable



        int sayi1 = 0; // eger deger atamasi olmazsa yazdirmaz cunku local ama biz defaul deger versek sorunolmaz
        // bundan dolayi loop kullanirken variable yi onceden yazmamiz lazim yoks cte hatsi verir
        for (int i = 0; i < 10; i++) {
            System.out.println(sayi1);

        }


         // System.out.println(i); loop un disinda kullanilamz
    }
}