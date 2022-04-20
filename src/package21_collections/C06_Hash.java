package package21_collections;

import java.util.HashSet;
import java.util.Set;

public class C06_Hash {
    public static void main(String[] args) {

        /*
        Java tüm obj ler icin bir hash codu üretiyor
        mekanizmalkar bir birindrn farkli olabilir
        önemli olan ayni degere ayani codu vermesi
         */
        String str="Java cok guzel";
        System.out.println(str.hashCode()); //-481588044

        String str2="Hava cok guzel";
        System.out.println(str2.hashCode()); //529529206



        Set<Integer> sayiKumesi=new HashSet<>();
        System.out.println(sayiKumesi.hashCode()); //0


        sayiKumesi.add(10);
        System.out.println(sayiKumesi.hashCode()); //10

        sayiKumesi.add(20);
        System.out.println(sayiKumesi.hashCode()); //30









    }
}
