package package19_garbage_abstractClass;

public abstract class C03_IlkAbstractClass {

    public abstract void abstractMethod();

    /*
    Abstract method'lar
    child class'larin MUTLAKA override etmesi gereken method'lardir
    dolayisiyla HICBIR ZAMAN direk calistirilmazlar
    ve bu sebeple method body'sine ihtiyac yoktur
   bir class'in veya method'un abstract olup olmadigini anlayabilir miyiz ?
   - abstract yaziyorsa abstractir, yazmiyorsa degildir
   (abstract olmayan class'lara concrete class/method denir)
   Abstract methodlar body'e sahip olamaz
   Concrete method'lar ise method body'si olmadan olusturulamaz
     */




    /*
    Abstract classs, genellikle ortak özellikleri olan nesenelri olan tek bir cati altinda toplamak icn kullanilir
    Tüm chil class larda olmasini istedigimiz dinamik özellikleri (methods) abstract method olarak olustururuz.
    Abstract olmaya(concrete) tüm child class larda absttract method lari override etmek zorunda.
    böylece tüm child class lar ayni dinamik özelliklere (methods) sahip olurlar


     */


}
