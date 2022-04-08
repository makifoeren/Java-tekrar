package package6_scope;

public class C03_StaticVariable {

    /*
    Static Variable ; class icinde anmcak main method basina static yazilmali ,
     olusturlmasi yeterli deger atamaya gerek yok defaul degrler vardir

     nstance variable'lar obje'ye bagimlidir ve her obje farkli degerler alabilir
        ogrenci notlari veya ogretmen branslari gibi

        bir objeye ait bir variable'in son degerini bulmak icin sadece o objeyi dikkate aliriz
       Static variabler ise class variable olarak tanimlanir
       ve tum class uyeleri icin aynidir. Okul ismi, okul mudurunun adi gibi
       eger static variable'in degeri degistirilirse herkes icin degisir


     */
    static String okulIsmi="Yildiz Koleji";
    static int okulNo;
    static boolean okulAcikMi;

    public static void main(String[] args) {
        System.out.println(okulIsmi); // Yildiz Koleji
        System.out.println(okulNo); // 0
        okulNo=102;
        System.out.println(okulAcikMi); //false
        System.out.println(okulNo); // 102
        staticMethod();

        System.out.println(okulNo); // staticMethod olusturduktan sonra 200

    }
    public static void staticMethod(){  // buna calis denmedimi calismaz main te calismamimiz
                                        // istedigimiz method un ismini yazmak yeterli
        okulNo=200;
        System.out.println(okulNo); //200

    }

}
