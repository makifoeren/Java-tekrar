package package7_arrays;

public class C01_Arrays {

    /*
    Birden fazla variable depolamak icin kullanilabilen object (non-primitie data) lerdir
    Tepsi gibi iki tane data tipi olabilir ya primitive yada non primitivlerin ref leri onun icinde tutar
    tüm verilerin data türleri ayni olmali
    object (non-primitie data) --> Heap Memory de depolanir - Value ile birlikte method lara da sahipler
    runtime da olusturulur
nasil declare ediler ?

     */

    public static void main(String[] args) {
          // 1- [] arr oldugunu declare ediyoru 3 sekildede olur yazilabilir önemli olan
        // 2- arr in ismi
        // 3 -  data türünü belirtmek
        int arr1[] ={1,2,3,};
        int[] arr2={2,5,6};
        int [] arr3={2,5,6};

        double arr4[] = {1.9,2.3,10.2};
        String arr5[] = {"Ali ", "veli"};

        // assing etmek mecburi mi?

        int sayi;
        int arr6[];
        // kullanmadan önce mutlaka deger atamasi yapmamiz lazim
        // hem deklare hemde atama yapacaksam nasil olmali?
        // 1- deklare edip esitligin sagina süslü parantez icerisine degerleri yazilabilir boyut belirtmis oluruz

        String arr7[] = {"Ali ", "veli"};

        //2 - icine deger atamadan olusturmak isteriz,boyutu belirlememiz lazim yeni bir arr olustur ama boyutu 3 olsun

        int arr8[]=new int[3];// java icinde 3 tane defaul deger alan bir deger olusturur







    }


}
