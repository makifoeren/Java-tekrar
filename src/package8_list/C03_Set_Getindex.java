package package8_list;

import java.util.ArrayList;
import java.util.List;

public class C03_Set_Getindex {
    public static void main(String[] args) {
        // 5. method set var olan bir elemani degistirmeye yarar
        // bu method add yerine kullanilamz
        // olmayan bir index ile kullanilirs hata verir

        List<String> hayvanlar=new ArrayList<>();



        hayvanlar.add("kedi");
        hayvanlar.add("serce");
        hayvanlar.add("zürafa");

        hayvanlar.set(1,"ari");

        System.out.println(hayvanlar); //[kedi, ari, zürafa]

        // daha önce olanlari arsiv de tutmak istiyorsak

        List<String> loglistesi=new ArrayList<>();

        loglistesi.add(hayvanlar.set(1,"kuzu")); // 1 e gitti kuzu yapti gelirken ari yi getirdi
                                    // burada hem liste güncellendi hemde ari arsiv e gecti

        System.out.println(hayvanlar); //[kedi, kuzu, zürafa]
        System.out.println(loglistesi);//[ari]


        // 6 . method get(indexs)  istenen index teki elemani döndürü

        System.out.println(hayvanlar.get(2)); // zürafa

        System.out.println(hayvanlar); //[kedi, kuzu, zürafa] degisen bir sey yok sadece 2 de kim var ona baktik


    }
}
