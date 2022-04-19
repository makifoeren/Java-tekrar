package package19_garbage_abstractClass_Interface;

public interface Interface {


    /*
    1- Interface, tamamen soyut methodlarin bulundugu bir java türüdür.
    2- Intercafede constructor olmaz,yani obje üretilemez
    3- Interface kendisinden inherit edecek Child class larin mecburen olusturmasi gereken methodlari belirleyen to-do
    list gibidir. Interface kulaniminin temel amaci Child class lairn kullanacagi standartlari belirlemektir.
    4- class veya abstract class kullanmak yerine Interface kullanmanin bize saglasdigi
    2. büyük özellik ise birden fazla Interface inherir edebilme imkanidir.
    5- Interface deki tümvariable lar public static ve final olur, biz bu keyword leri yazmasak da
    Java otomatik olarak bu sekilde tanimlar.
        Interface deki tüm methodlar public ve abstract olur.
    6- Concrete bir class,birden fazla Interface interface i inherit ettiginde, kullanilacak variable in
     hangi Interface den geldigini java nin bilesi icin Interfaceismi.VariableIsmi seklinde cagrilir,
     Method lar icin ise eger farkli interface lerde ayni isimde method varsa Java bakar
            -- eger ikisininde return type ayni ise overriding bir method yeterli olur.
            -- return type lar farkli ise hangisini kullansak diger overridee edilmis olasagi icin
            Java CTE verir
     */
}
