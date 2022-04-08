package package7_arrays;

import java.util.Arrays;

public class C07_Split {

    // Split stringe aittir String i parcalayip Array e cevirir
    public static void main(String[] args) {

        String str="Hava bugün daha güzel";
        str.split(" "); // space ten böl onun yerine virgül koyar bunuda bir Array e atamamiz lazim
        String kelimeler[]=str.split(" ");
        System.out.println(Arrays.toString(kelimeler)); //[Hava, bugün, daha, güzel] virgül den sonraki bosluklari array koyuyr
        System.out.println(kelimeler[1]); //bugün

        String daha[]=str.split("daha"); // daha yi bulup yerine , koyacak
        System.out.println(Arrays.toString(daha)); // [Hava bugün ,  güzel]

        String harfler[]=str.split("") ; // hiclik
        System.out.println(Arrays.toString(harfler)); // butun parcalar arasina , koyuyor
        // [H, a, v, a,  , b, u, g, ü, n,  , d, a, h, a,  , g, ü, z, e, l]




    }
}

