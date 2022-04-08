package package5_loop;

public class C11_WhileLoop {
    public static void main(String[] args) {
        //Kullanicidan sayi al
        //bu sayiyi tam bolen sayilari ve toplam kac tane olduklarini ekrana yazdirin

        int input=20;

        // for loop ile de yapabiliriz
        //While ile yapalim

        int bölen=1;
        int sayac=0;

        while(bölen<=input) {
            if(input%bölen==0){
                System.out.print(bölen + " ");
                sayac++;
            }
            bölen++;
        }
        System.out.println("");
        System.out.println(input + " sayinin bölen " + sayac + " adet sayi vardir ");

    }
}
