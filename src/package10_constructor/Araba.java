package package10_constructor;

public class Araba {
    /* 
    ********
    Java da her class olusturdugumuzda
     java o class tan ileride obje ler üretmek gerekecegini bilir
    ve biz özellikle belirtmesek de java her olusturdugu class a constructor koyar

    Java nin class olustururken class a koydugu constructor a
    DEFAULT CONSTRUCTOR denir ve bu görünmez

    eger biz görünür bir constructor imizi olsun istiyorsak default
    constructor ile ayni görevi yapan bir constructor olusturabiliriz
    veya istersek ayni kaliptan farkli desenlerde objeler olusturmak icin
    farkli özelliklerde constructor da olusturabiliriz

    constructor lari birbirinden farklilastiran tek ayricalik
    kullanilan parametre sayiyi ve parametre data türüdür

    */

    public Araba(){
        System.out.println("parametresiz cons calisti");

    }
    /* bir kod blogunun method veya constructor olmasindan emin olmak istiyorsaniz
    iki seye dikkat etmelisiniz

    1- constructor ismi clas ismi ile ayni olmali yani büyük harfle baslar
    2 - constructor larin return type i olmaz obj nin kendisini verir

    ozetle : constructor adi class adi ile ayni olmali ve returntype olmamali

     */

    public Araba(String renk){
        System.out.println(renk + " renkli bir araba");
    }

    public Araba(int yil){
        System.out.println(yil + " model bir araba üretildi");
    }

    public Araba(int yil, String renk){
        System.out.println(yil + " model " + renk + " renginde bir araba uretildi");}
}


