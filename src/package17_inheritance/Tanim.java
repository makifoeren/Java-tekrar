package package17_inheritance;

public class Tanim {

    /*
    Inheritance bir obj / class in baska bir obj/class in  tüm özelliklerini ve
    davranislarini elde ettigimiz mekanizmadir
    OOP (Nesne Yöntemli programlama sistemi) nin öemli bir parcasidir
    daha önce olusturulmus Class larin üzerinde yeni class lar olusturabilmemizdir
    inht. sayesinde yeni olusturdugmuz bir class var olan bir class in tüm method ve variable leri kullanmasini saglar
    bu islemler inhr. inh. sayesinde child clss , parent class daki public veya protected primitive datalari
    obj, veya method lari problemsiz bir sekilde kullanirlar

    Inh sayesinde tekrar tekrar yazan cod kullanabilmek mümkün
    Geneli kapsayan class üyeleri parent class ta, daha spesifik olanlar ise child classlarda olusuturulut

    child lar public ve protected data lara problemsiz inhert edbilir
    private olanlar inhert edilemez
    default olanlar child ve parent ayni package da olduklari zaman inhert edilebilir

    parent class -- super
    child class -- sub diye de adlandirilirlar

    Single Inh -- java single yi kabul eder bir child bir parent class la olabilir
    Multilevel inh -- zinir kabul eder asagidam yukari child parent i decer omnun da parent ini secmis olur
    Hierarchical Inh -- soyagaci bir den fazla class ayni class i parent olarak kullanabilirr
    Java butun class lar Object class dan Inh ederler
    obj clas lar bütün class larin parentidir.  obj class parent i olmayan tek class
    Multiple INh -- bir class birden fazla parent kabul etmez

    IS-A HAS-A Realationship

    IS-A-- Bir class öz olarak diger class i kapsiyor demek  BMW IS-A Car bmw car in alt class yukari dogru
    HAS-A -- bütün öz baska bir yerden almissa Apartman HAs-A daire, daire HAS-A mutfak asagi dogru

    --INHERITANCE DA CONSTRUCTOR CAGIRMA--
    bir class ta cons calistiginda once parent class daki cons calisir.
    Cünkü her cons ilk satirinda super() keyword vardir (gönmese bile)

    super() parent class tan constructor cagirmak icin
    this() icinde bulundugu class da baska bir cos cagirmak icin kullanilir

    super. ide data veya variable icin kullanilir direk parent e gider

    Method Overriding -- Parent class da varolan bir methodu medhod signature ini degistrirmeden
    medhod bady sini degistirerek kullanmaya Method Overriding denir.

    Nicin kullanilir -- Overriding kullanaranl child class in parent class taki methodu kendine
    uyarlayarak (implement) kullanmasini saglamis oluruz,

    Overriding yapildiginda parent class daki method Overridden Method (gecversiz)
    child class daki methoda Overriding Method denir.

    Ovverridin Kurallari
    1 - Method Signature i  (method ismi ve parametreler) ayni olmali.
    2 - Child class daki method (overriding method ) Access Modifier i parent class daki
    method un (overridden) modifier in dan daha dar olamaz
    privat default protected public  parent teki siralama child kisitlama yapamaz
    3 - Overriding method covariant retun type kullanmalidir.
    void veya primitiv olursa ayni olmak yorunda
    void--void
    string--strig cocugin daha genis olmamali
    4 - private, static and final method lar overriding yapilamaz
    Parent class taki privat method a child class tan ulasmamiz mümkün olmadigan
    java bu iki method u farkli kabul eder
    @Override kullanmak istersen bile kabul etmez CTE verir

    Polymorphism = Overloading + Overriding
    bir method un farkli farkli sekilde kullanmak demek
   -- Overloading bir compile time (static)
    body istenirse degisir
    --Overriding run time dynamic
    body %99 degisir
   -- final static ve private met Overload edilir ama Override edilemez
    --Overloading inheritance gerekmez, Overriding gerekir
   -- Overloading se istedigimiz sekilde access modifier ve return typ kullanabiliriz
   Overriding de  access modifier ve return typ ta belli kurallara baglidir
   SUPER: YAZARAK IKISIDE CALISIR
   FINAL METHOD SON HALI

   SIGNATURE--- METHOD ISIM VE PARAMETRE AYNI
   ACCESS MOD PUBLIC





    3-






     */


}
