package package19_garbage_abstractClass_Interface;

public class C02_Final extends C01_Final{


   // public void abstractMethod(); body olmayinca kabul etmez

    public static void main(String[] args) {

        System.out.println(C01_Final.pisayisi);

        // C01_Final.pisayisi =3.7; ulasabilirsin fakat deger atayamazsi

        // extends yapsaniz da degisen birsey olmaz

    }
/*
    public static final void method1(){

Override parent class'daki method'u child class'a uyarlamak demekti
        yani islevini degistirmek istiyoruz
        ancak parent class'daki method final olarak tanimlandigindan
        Java method'un uyarlanmasina izin vermiyor
        System.out.println("Parent class final method1");


        System.out.println("Parent class final method1");*/
}
