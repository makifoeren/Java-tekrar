package package3_stringManipulation;

public class C12_substringSoru {
    public static void main(String[] args) {
        // 1-48 of 104 "nutella"
        // bu arama sonucundaki bulunan sonuc sayisini 100 den cok ise süper
        // az ise az sonuc bulundu yazdirsin

        String str="1-48 of 104 results \"nutella\"";

        /*
        104 veya sonuc ikicispace ile ucuncuspace arasinda
         */
        int ilkSpace=str.indexOf(" "); // ilkspace in index i 4
        int ikinciSpace=str.indexOf(" ", ilkSpace+1); // ikinci space ilk inden sonrasi once string degeri
                                                                    // sonrada nereden itibaren aradigim yani ilkspace den sonr
        int ücüncüSpace=str.indexOf(" ", ikinciSpace+1); // ucuncu space ikinciden sonrasi once string degeri
                                                                   // sonrada nereden itibaren aradigim yani ikinciden den sonra

        String aramaSonucSayisiStr =str.substring(ikinciSpace+1,ücüncüSpace); //ikinci space +1 olmsinin nedeni spaceden sonrakini
                                                                              // alsin boslugu almasin ucuncu space e kadar
        System.out.println(aramaSonucSayisiStr);


        int aramaSonucSayisiInt=Integer.valueOf(aramaSonucSayisiStr); //str int degerine cevirip kiyaslama yapmak icin

        if (aramaSonucSayisiInt>100){
            System.out.println("Süper");
        }else {
            System.out.println("Az sonuc buldu");
        }


    }
}
