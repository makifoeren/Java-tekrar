package package5_loop;

public class C07_WhilLoop {

    public static void main(String[] args) {
        //kullanicidan iki tam sayi alip
        //bu sayilari ve aralarindaki tüm tam sayilari yazdiran kod olusturun


        int baslanginc=40;
        int bitis=60;

        for (int i = baslanginc; i <=bitis ; i++) {
            System.out.print(i + " ");
        }

        System.out.println("");

        // ayni soruyu while loop ile yapalim


        while (baslanginc<=bitis){

            System.out.print(baslanginc + " ");
            baslanginc ++;
        }
        System.out.println(""); // alt satira gecmek ici
        System.out.println(baslanginc); //61
    }
}
