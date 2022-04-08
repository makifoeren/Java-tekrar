package package6_scope;

public class C02_InstanceVariable {

    /*
    Instance (objek) Variable ; Class in icerisinde ancak main disinda olmali class in hepsi icin gecerli
    fakat static olursa durum degisir artik instance degil
    class seviyesindeki lere deger atanmasi sart degil olusturman yeterli
    class seviyesindeki varablelere default dgerler atar  string icin null,sayisal data lar icin 0, boolen false
    instance lara class tan veya baska bir yerden ulasmak istersnis MUTLAKA obj olusturmalisiniz ve
    o obje uzerinden ulasilmali
    obje class ismi ile olusturulur



     */
    int sayi;
    String bransIsmi="Java";
    boolean okuldaMi;

    public static void main(String[] args) {

        // sayi=10 ; sayi variable i static olmadigi icinmain method dan direk kullanilmaz
        //instance variable lara static methodlardan ulasabilmek icin obje olustrmamiz gereki

        C02_InstanceVariable obj1=new C02_InstanceVariable();
        System.out.println(obj1.sayi); // 0
        obj1.sayi=10;
        System.out.println(obj1.sayi); // 10
        obj1.bransIsmi="SQL";
        System.out.println(obj1.okuldaMi); //false
        //obj1 nerede olusturuldugunu bulur 26. satira kadar bir atama yok class level e gidip bakiyor ve aliyor
        // bir deger atanmadigi icin class ta defaul deger yani false görür



        C02_InstanceVariable obj2=new C02_InstanceVariable();
        System.out.println(obj2.sayi); // 0 buraya kadar obj2 icin herhangi bir atama yok 0 yazdirir
        System.out.println(obj2.bransIsmi); //java
        // obj2 nerede olusturuldugunu bulur 29. satira kadar bir atama yok class level e gidip bakiyor ve aliyor

        obj1.okuldaMi=true;
        System.out.println(obj2.okuldaMi);
        // eger verimiz inctanse yani static degilse baska obj ler ilgilenmez
        // biz obj1 e deger atadik ama obj2 yi istiyoruz obj1 2 yi baglamz


    }
}
