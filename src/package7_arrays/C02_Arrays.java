package package7_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        String arr1[]={"Ali", "Veli", "Ayse"};

        // Array icerisindeki elementlere ulasabilmek ici index kullaniriz
        // indexs le elementlere ulasip update yapabiliriz

        System.out.println(arr1[0]); // Ali
        arr1[1]="Esila";

        System.out.println(arr1[1]); // Esila


        int arr2[]=new int[4];

        System.out.println(arr2[1]);//0
        System.out.println(arr2[3]);//0
        // System.out.println(arr2[5]);// hata verir

        //Arrayin tamamini yazdirmak istersek

        System.out.println(arr2); //[I@27f674d
        //array ler non-primitiv olduklarindan direk yazdirmak istersek
        // java referans bilgisini yazdiri

        for (int i = 0; i < 4; i++) {
            System.out.print(arr2[i] + " "); //0 0 0 0
        }
        System.out.println("");

            // Array i yazdirmak icin Arrays class indan toString() kullaniriz

            System.out.println(Arrays.toString(arr2)); // [0, 0, 0, 0]

        arr2[1]=11;
        arr2[3]=22;
        System.out.print(Arrays.toString(arr2));  //[0,11,0,22]

        System.out.println(" ");

        System.out.print(Arrays.toString(arr1));  //[Ali, Esila, Ayse]

        int arr[];  // deger atamasi yapmadik ama Java kabul etti ancak kullanmamiza izin vermez
        arr= new int[6];
        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0, 0]
        System.out.println(arr.length); // 6

        // String deki length() parantez vardi , bunda yok

        // arraydeki her bir elemani index degeri kadar artiralim

        for (int i = 0; i < arr.length ; i++) {
            arr[i] += i;
        }
        System.out.println(Arrays.toString(arr)); // [0, 1, 2, 3, 4, 5]

        // son index'deki elementi yazdiralim
        System.out.println(arr[arr.length-1]); // 5



    }

    }
