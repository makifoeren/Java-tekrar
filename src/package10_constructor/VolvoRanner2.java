package package10_constructor;

public class VolvoRanner2 {
    public static void main(String[] args) {
        // her obje olusturudugumuz da model yakit gibi degrlri tektek atama
        // yapmak istemiyorsaniz ne yapmak lazim

        Volvo arb1 =new Volvo("XC60",false,2023,"Benzin");
        System.out.println( arb1.toString()); //  Model : XC60 Yakit : Benzin Max Hiz : 240
// metdot toString olunca  System.out.println( arb1) buda kullanilir

        Volvo arb2=new Volvo("XC90",true,2021,"Elektrikli");
        System.out.println(arb2);
    }
}
