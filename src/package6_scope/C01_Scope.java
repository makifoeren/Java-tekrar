package package6_scope;

public class C01_Scope {

    /*  1 - Bir method icerisinde olusturulan variable lar sadece olusturduklari
    method ta kullanilabilir baska method ta kullanilmazlar
    2 - Tüm method larin kullanabilmesini istedigimiz variable leri class level da yazmaliyiz
    class leveldekileri
    --static yaparsak tüm methodlar kullanabilir
    --static olmazsa (instance) o zaman static olmayan method lar kullanilabilir
    3 - Loop icerisinde olusturulan variableler loop icnde kullanilir fakat disinda kullanilamaz
     */

    static String kurs="java";
    int level =10;


    public static void main(String[] args) {
        int sayi=10;
       // isim="Veli Can";
        System.out.println(kurs);
       // System.out.println(level);
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            int loopSayi=29;

        }
       // System.out.println(i);
       // loopSayi=24;


    }
    public static void method1(){
       // sayi=20;
        String isim="Ali Can";
        System.out.println(kurs);
      //  System.out.println(level);

    }
    public void method2(){
        // sayi=30;
         // isim="fatma Can";
        System.out.println(kurs);
        System.out.println(level);


    }




}
