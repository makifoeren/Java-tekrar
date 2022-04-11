package package13_mutableImmutable;

public class C01_MutableImmutable {

    /*
    Immutable(degismez) class'lar, objeleri bir kez olusturduktan sonra degistiremedigimiz class'lar dir.
    Mutable(degisebilir) class'lar ise tam tersi olarak,olusturdugumuz objeleri degistirebildigimiz class'lar dir.
    NOT: Immutable class dan olusturulan objeler de immutable olurlar. Bu tüe obj olusur fakat onlari degistiremeyiz
    Immutable bir objeyi degistirmek istersek,Java o obj klonlar ve
     yapilan degisiklikleri klonlanmis yeni obj üzerinde gerceklesir
     buna  -threand safe -güvenli es zamanli calisma ortami olsun diye ihtiyac var ayni anda birden fazla kisi is Linkedl
     */

    public static void main(String[] args) {

        String str1= "Eren";
        String str2= "Eren";

        /*
        Eger yeni bir obj olusturma veya bir islem yapma yoksa java str havuzunu kont eder
        == hem degere hem de ref bakar
        3 ve 4 te variable va ve deger var dpolayisiyla 3 ve 4 le alakali kesin bir sey olmadigi icin false veriyor
         */
        String str3= new String("Eren");

        String str4= str1+"";


        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // true
        System.out.println(str1.equals(str4)); // true


        System.out.println(str1==str2); // true
        System.out.println(str1==str3); // false
        System.out.println(str1==str4); // false



    }
}
