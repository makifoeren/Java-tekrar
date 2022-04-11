package package12_passByValue;

public class C01_PassByValue {
    public static void main(String[] args) {
/*
          Java Pass By Value bir programlama dilidir
          Yani; bir primitive variable'i argument olarak bir method'a yollarsaniz
          Java o variable'i degil, degerini(value) method'a aktarir (pass)
         */

        double etiketFiyati=100;

        yüzdeOnIndirimYap(etiketFiyati);
        yüzdeOnIndirimYap(etiketFiyati);
        System.out.println("iki indirimden sonra main method a etiket fiyati : " + etiketFiyati);


    }

    private static void yüzdeOnIndirimYap(double etiketFiyati) {

        etiketFiyati=etiketFiyati*0.90;
        System.out.println("sizin icin %10 indirim fiyatimiz : " + etiketFiyati);
    }
}
