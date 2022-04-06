package package4_methodCreation;

public class C11_IkisayininToplami {
    public static void main(String[] args) {

        // iki int toplami
        int sayi1=10;
        int sayi2=20;

        ikiSayininToplami(sayi1,sayi2);
        // iki double toplami
        double sayi3=13.4;
        double sayi4=11.1;

        ikiSayininToplami(sayi3,sayi4);


        ikiSayininToplami(15,25); // dgerler int oldugu icin int methoduna gidecek
        ikiSayininToplami(15.1,25.4); // kendii sayi3 ve say4 ü verir

       int sayi5=4;
       double sayi6=2.9;

        ikiSayininToplami(sayi5,sayi6); // arguman le parametleri kontrol eder ve hangisi uyarsa oradaki islemi yapar
                                // int doubla gidecegi icin doubl icin yaptigimiz method ta is görür



    }
    private static void ikiSayininToplami(int sayi3, double sayi4) {
        System.out.println("bir int ile bir double toplami : " + (sayi3+sayi4));
    }

    private static void ikiSayininToplami(double sayi3, double sayi4) {
        System.out.println("iki double toplami : " + (sayi3+sayi4));
    }

    private static void ikiSayininToplami(int sayi1, int sayi2) {

        System.out.println("iki int toplami : " + (sayi1+sayi2));
    }
}
