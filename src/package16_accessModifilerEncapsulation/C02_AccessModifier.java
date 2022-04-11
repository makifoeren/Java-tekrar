package package16_accessModifilerEncapsulation;

public class C02_AccessModifier {
    public static void main(String[] args) {


        C01 obj =new C01();

        obj.acikString="Bye";
        C01.acikSayi=50;

        // C01.sayi=15; sayi private oldugu icin ulasamazsin
        //obj.method1; private acces modifier oldugu icin ulasamazsin

        // C01 objParametreli=new C01(5); private acces modifier oldugu icin ulasamazsin




    }
}
