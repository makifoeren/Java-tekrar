package package4_methodCreation;

public class BirkezYazdirma {
    public static void main(String[] args) {
/*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */

        birKereYazdir("aabbcccccddddaaa");


    }

    private static void birKereYazdir(String str) {
        String sonuc="";

        for (int i = 0; i < str.length(); i++) {
            if (sonuc.contains(str.substring(i,i+ 1))){ //tekrarsiz karakterleri dondurecegimiz sonucumuz,
                                                        // cumleden aldigimiz herhangi bir klarakteri icermiyorsa
                sonuc += str.substring(i,i+1); //o zaman sonuca ekleyebilirisniz
            }}
        System.out.println(sonuc);
    }

            }

