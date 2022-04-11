package package15_varargs_stringBuilde;

public class C01_Varargs {

    public static void main(String[] args) {
/*
            Tek method ta istedigimiz kadar parametreyi yollayarak sonuc almamizi saglar
        yani parametre sayimiz degisken ancak method un yapacagi is sabitse Varargas kullanilarak
        tek method la kodumuzu yazabiliriz
        data typ tan sonra ... koymaliyiz declarre ederken int... sayi
        varargs disinda parametre varsa varargs parametre olarak en sona yazilmali aksi durumda nerede duracagini bilmez
 */

        // verilen iki sayiyi toplayan bir method olusturun

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;
        int sayi5=50;
        // bir de 3 sayiyi toplayan method olusturalim
        toplaGel();
        toplaGel(sayi1);
        toplaGel(sayi1,sayi2);
        toplaGel(sayi1,sayi2,sayi3);
        toplaGel(sayi1,sayi2,sayi3,sayi4);
        toplaGel(sayi1,sayi2,sayi3,sayi4,sayi5);
    }

    private static void toplaGel(int... sayi) {
        int toplam=0;
        for (int each: sayi
        ) {
            toplam+=each;
        }
        System.out.println(toplam);
    }


}
