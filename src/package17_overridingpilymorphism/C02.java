package package17_overridingpilymorphism;

public class C02 extends C01{

    private void method4(){
        System.out.println("Child method4");
        // Parent class'daki private method4'e
        // Child class'dan ulasmamiz mumkun olmadigindan
        // Java bu iki method'u
        // TAMEMEN FARKLI IKI METHOD olarak kabul eder
        // @Override kullanmak istersek Java kabul etmez CTE verir
    }


    @Override
    protected String method3 (){
        // Covariant icin yazildi
        return "Java";
    }

    @Override // parent ile iliskili oldugunu gösteriyor
    public void method2() {
        /*
            @Override notasyonu overridden method ile overriding method'u
            birbirine baglar
            Farkinda olunmadan overriden method silinirse veya signature degistirilirse
            bu iliski bozulacagi icin Java CTE verir

            Notosyon kullanilmazsa Java bunlari iliskisini bilir ama
            overridden method silinirse sesini cikarmaz
         */
        System.out.println("Child method2");
    }


    public static void main(String[] args) {

        C02 obj = new C02();


        /*
        Data türü C01 önce C01 e gidecek
         de method 1 e gidip bakacak ovveride edilmis mi ? edilmemis se alip gelecej
        cons türü C02 oldugu icin C02 ye bakiyor override edilmisse oradan alip delecek

         */
        obj.method1(); // parent method1
        obj.method2(); // child method2


        C01 obj2 = new C02();
        obj2.method1(); // parent method1
        obj2.method2(); // child method2

        C01 obj3 = new C01(); // cons ve data türü C01 oldugu icin C02 ye hic bakmiyor
        obj3.method1(); // parent method1
        obj3.method2(); // parent method2

    }
}
