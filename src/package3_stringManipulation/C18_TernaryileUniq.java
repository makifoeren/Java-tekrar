package package3_stringManipulation;

import java.util.Scanner;

public class C18_TernaryileUniq {

    public static void main(String[] args) {
        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir isim giriniz :");
        String isim = scan.next();

        //Ternary ile
        System.out.println("   ***   ternary   ***   ");
        char c1 = isim.charAt(0);
        char c2 = isim.charAt(1);
        char c3 = isim.charAt(2);

        String result = isim.length() == 3 ? ((c1 != c2 & c1 != c3 && c2 != c3) ? "Girdiginiz isim 3 harfli ve unique karakterle sahip"
                : "Girdiginiz isim 3 harfli ancak unique karakterle sahip degil "):"Girdiginiz isim 3 harfli değil";

        System.out.println(result);

}
}
