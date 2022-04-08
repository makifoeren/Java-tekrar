package package7_arrays;

public class C10_MDarrays {

    public static void main(String[] args) {

        //boyutlari belirli bir array i elementleri girmeden olusturalim

        // bir okulda icnde 24 ögrenci olan 8 sinif vardir. siniflar ve ögrnci 2 kat li

        int arr[][]=new int[8][24];

        // bir ilcede herbirinden 24 ogrencilik 8 sinif bulunan 5 okul vardir

        int ilce[][][]=new int[5][8][24];

        // bir okulda 3 tane 24 kisilik 2 tane 22 kisilik sinif vardir bu olmaz cunku toplama cikarma yoktur
        // bunu yapmak icin 2 farkli array olusturmak gerekir

        int sinif24[][]=new int[3][24];

        int sinif23[][]=new int[2][22];

        // manuel olarak elemnletileri atama yaparsak farkli uzunlukta inner arrayler tanimlayabiliriz
        int arr4[][]={{3,1,7,5},{6,2}};


    }
}
