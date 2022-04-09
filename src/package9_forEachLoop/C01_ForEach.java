package package9_forEachLoop;

public class C01_ForEach {
    /*
    toptan calisiyor hersey geliyor siniftakilerin hepsi nin asi olmaya gelmesi
    hata yapma ihtimali azalir
    kodun daha okunabilir olmasini saglar
    bunu yapmak icin hedef listesi collection sinifa gidip hepsni getiriyor hedefi olmasi 1.sarti
    list ve arr icin kullanilir

     */

    public static void main(String[] args) {
        int arr []={2,4,6,8,11};

        // elementleri for loop ile yazdirma

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " "); //2 4 6 8 11
        }
        System.out.println("");

        // bunu for each loop ile yapacak olusak
        // for each loop u calistirmak icin heef bir collection vermeliyiz
        // int verecek getirecek her bir elemti bir adi olmali olmali
        //nereden arr den getir
        // sout geleni yazdir

        for (int each:arr
             ) {
            System.out.print(each +" "); //2 4 6 8 11

            // baslangic bitis degeri detaylari ile ugrasmaya
            // gerek kalmadan colléctions tan tum elementleri bize getirir
            // dez avantaj index e bagli bir islem yapamayiz


        }


    }

}
