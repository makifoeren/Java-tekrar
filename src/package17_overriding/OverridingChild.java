package package17_overriding;

public class OverridingChild extends OverridingParent{

    public void method1(){  // parant le ayni isimde olabilir buna Ovveriding denir parenti etkisiz hale getiri

        System.out.println("Child class method1");
        //method1() static ise cagirir
    }

    public static void main(String[] args) {

    /*
    Bir obje olusturulurken Data turu ve Constructor ayni class'dan secilmisse
    -- OverridingParent obj3= new OverridingParent(); --
    Java direk o class'a gider
    hem variable hem de method icin
    o class'da varsa kullanir, yoksa o class'in
    parent'larina bakar
     */

        // static olmayinca obj ile cagiracaz

        OverridingChild obj1= new OverridingChild(); // cons child ise method overrid edildimi bakar
        obj1.method1(); // Child class method1
        obj1.method2(); // Parent class method2

        OverridingParent obj3= new OverridingParent();
        obj3.method2(); // Parent class method2
        obj3.method1(); // Parent class method1


        /*
        Eger Data turu Parent, Constructor Child class'dan secildiyse
        -- OverridingChild obj1= new OverridingChild();--
        variable'larda yukaridaki sekilde calisma devam eder
        Ancak
        Method'lar icin Data turunun oldugu class'daki method
        Child class tarafindan OVERRIDE edilmis mi diye kontrol etmemiz gerekir
        Eger child class'larda bumethod override edilmisse
        override eden method calisir
         */
        OverridingParent obj2= new OverridingChild();
        obj2.method2(); // Parent class method2
        obj2.method1(); // Child class method1   overrid olmadigi icin parant ten alkiyr
    }

}
