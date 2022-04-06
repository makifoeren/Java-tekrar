package package3_stringManipulation;

public class C14_Isimgizleme {
    public static void main(String[] args) {
        // Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
        //isim-soyisim : M***** B*******
        // kart no : **** **** **** 1234

        String isim="Mehmet";
        String soyisim="Basar";
        String kKNo="1234567890123456";

        String yeniIsim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\S","*");
        String yeniSoyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\S","*");
        String yeniKKNo="**** **** **** " + (kKNo.substring(12));
        System.out.println("Isim Soyisim : "+yeniIsim+ " " +yeniSoyisim+ "\n Kart no : " +yeniKKNo);


       /* String yeniIsim=isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\S","*"); // cift isim space yerine

        String yeniSoyisim=soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\S","*");

        String yeniKKNo="**** **** **** " + kKNo.substring(12);


        System.out.println("Isim Soyisim : "+yeniIsim+ " " +yeniSoyisim+ "\n Kart no : " +yeniKKNo);*/

    }
}
