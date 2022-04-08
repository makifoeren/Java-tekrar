package package5_loop;

public class C13_DoWhile {
    public static void main(String[] args) {

        // while loop ile sayidan ten kücük pozitif sayilari yazdiralim
        // while lopp önce kontrol sonra islem yani 1 kere fazladan calisir
      //  önce islem sonra kontrol yapalim denmis do while

        int input =3;
        int sayi1=1;
        int sayac=1;


        while (sayi1<3){
            System.out.println(sayi1);
            //sayac++;
            sayi1++;

        }
        //  System.out.println("Sayac :" + sayac);

        // ayni soruyu do while ilke yapalim
        //  önce islem sonra kontrol yapalim denmis do while
        // aradaki fark islem yapiyor yazdiriyor sonra konrol ediyor
        // do while de kosul yanlissa bile 1 kere calisir


        sayi1=1;

        do {
            System.out.println(sayi1);
            sayi1++;
        }while(sayi1<input);

    }
}
