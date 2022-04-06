package package4_methodCreation;

public class C03 {

    // bu class main olmadigi icin calismaz
    // bu sadece bir depo dur
    // baska class lardaki method ve variable yi barindirir

    public static void besHarfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(4) + kelime.substring(3, 4) + kelime.substring(2, 3) +
                kelime.substring(1, 2) + kelime.substring(0, 1);

        System.out.println("girdiginiz kelimenin harf sayisi : " + 5);
        System.out.println("Kelimenin tersten yazılışı : " + tersKelime);


    }

    public static void dortHarfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(3) + kelime.substring(2, 3) + kelime.substring(1, 2) +
                kelime.substring(0, 1);
        System.out.println("girdiginiz kelimenin harf sayisi : " + 4);
        System.out.println("Kelimenin tersten yazılışı : " + tersKelime);

    }

    public static void ucHarfiTersineCevir(String kelime) {

        String tersKelime = kelime.substring(2) + kelime.substring(1, 2) + kelime.substring(0, 1);

        System.out.println("girdiginiz kelimenin harf sayisi : " + 3);
        System.out.println("Kelimenin tersten yazılışı : " + tersKelime);
    }

}
