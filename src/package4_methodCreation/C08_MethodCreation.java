package package4_methodCreation;

public class C08_MethodCreation {
    public static void main(String[] args) {

        String isim="Mehmet";
        String soyisim="Basar";
        String kKNo="1234567890123456";

        // bir method isi yapip bize geri getirmesini istiyorsak return typ void degil
        // bize getirecegi data türünde olmalidir
        // bunlar bana string döndürmeli

        String gizlenmisIsimSoyisim=isimSoyisimGizle(isim,soyisim);
        System.out.println(gizlenmisIsimSoyisim);

        String gizlenmisKKNo=krediKartiGizle(kKNo);
        System.out.println(gizlenmisKKNo);
    }

    private static String krediKartiGizle(String kKNo) {
        String yeniKKNo="**** **** **** " + (kKNo.substring(12));
        return yeniKKNo;
    }

    private static String isimSoyisimGizle(String isim, String soyisim) {

        String yeniIsim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\S","*");
        String yeniSoyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\S","*");

        //method olusturmada 3. adim method
        //        // calisinca sadece bir sey mi yazdiracak yoksa bize bir data mi döndürecek buna karar vermektir
        //        // bu soruda gizlenmis isim soy isim dondürmesi istendiginden
        //        // return type i void degil string secip method un sonuna retunr edilecek datayi yazdik
        return yeniIsim + " " + yeniSoyisim;
    }
}
