package package15_varargs_stringBuilde;

public class C02_Varargs {

    public static void main(String[] args) {


        // kac tane String verilirse verilsin
        // iclerinden en uzun olani yazdiran bir method olusturun

        String str1="Ali";
        String str2="Veli";
        String str3="Oguzhan";

        // Yazilan argument sayisi sabitse herzamanki gibi bir method olusturabiliriz
        // ancak argument sayisinin degisme ihtimali varsa
        // o zaman varargs tercih edilir
        enUzunKelime(str1,str2,str3);

    }

    private static void enUzunKelime(String... str) {
        String enUzunStr="";

        for (String each: str
             ) {
            if (each.length()>enUzunStr.length()){ // gelen kelime elimdekinden uzun sa o en uzun olur
                enUzunStr=each;
            }
        }
        System.out.println("En uzun kelime : " + enUzunStr);
    }
}
