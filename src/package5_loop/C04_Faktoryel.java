package package5_loop;

public class C04_Faktoryel {
    public static void main(String[] args) {

        // Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir  tamsayi isteyin
        // ve girilen sayinin faktoryel'ini bulun. (5!=5*4*3*2*1)

        int sayi=7;

        int faktoryel=1;

        String faktoryelAcikYazim="" ; // string yyapmak icin basina bir hiclik

        for (int i =sayi ; i >=1  ; i--) {
            faktoryel *=i;
            if (i==sayi){
                faktoryelAcikYazim =faktoryelAcikYazim + i ;
            } else
                faktoryelAcikYazim =faktoryelAcikYazim + " * " + i ;
        } System.out.println(sayi + "! = " + faktoryelAcikYazim + " = " + faktoryel); // 7! = 77 * 6 * 5 * 4 * 3 * 2 * 1 = 5040

        System.out.println(sayi + "! = " + faktoryel); // 7! = 5040


    }
}
