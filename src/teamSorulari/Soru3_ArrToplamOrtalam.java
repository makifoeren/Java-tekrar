package teamSorulari;

public class Soru3_ArrToplamOrtalam {

    /*
        Bir sinifa ait ders notlari veriliyor
        Bu notlarin toplamini ve ortalamasini bulunuz
        input={30,56,56,75,95,100,30,80,50}
         */
    public static void main(String[] args) {


        int sayi[] = {30, 56, 56, 75, 95, 100, 30, 80, 50};

        int toplam=0;

        for (int i = 0; i <sayi.length; i++) {
            toplam=toplam + sayi[i];


        }

        double ortalama=toplam/sayi.length;

        System.out.println("Toplam = " + toplam );
        System.out.println("Ortalama = " + ortalama);


    }}



      /*  int sum = 0;

        for (int i = 0; i < sayi.length; i++) {

            sum = sum + sayi[i];
        }
        double average = sum / sayi.length;


        System.out.println("sum = " + sum);
        System.out.println("averge = " + average);

    }*/

