package package7_arrays;

import java.util.Arrays;

public class C09_MDarrays {

    /*
    Multi Dimensional Array ic ice arr
    [] [] [] outer arr ve icte 2 tane inner arr var

     */
    public static void main(String[] args) {
    int arr[][]={{3,1,7},{6,10,2}};

    // 3 e ulasmak icin en distaki elemen tin [0] i. al
    // icte te bir arr var orada da ic 0 dan baslacak dolayisiyla arr[0][0] bize 3 ü vermis olur
    // kac tane köseli parantez varsa o kadar köseli parantez ve index girmelisiniz
    // iceri dogru bir yol alma arr[1][1] bize 10 u verir


        System.out.println(arr[0][1]);//1
        System.out.println(arr[1][2]); //2

      //   ilk inner array in tüm elemanlari yazdiralim
        System.out.println(Arrays.toString(arr[0])); //[3, 1, 7]

        System.out.println(Arrays.toString(arr)); // [[I@27f674d, [I@1d251891]

     // MDArray de tüm elementleri tüm array olarak yazdirmak istersek

        System.out.println(Arrays.deepToString(arr));  //[[3, 1, 7], [6, 10, 2]]

        // verilem MDA tüm elementlerin toplamini bulunuz


         // arr[0][1]  // 1 e ulasmak icin  mda ulasacagimiz her bir elemen 2 index olmali biri dis bir ic arr ile ilgili

        int toplam=0;

        for (int i = 0; i <arr.length ; i++) {
            /*
            0 dan basliyor length 2 daha sonra 0<2 saglaniyor ,
            j ye gececek j=0  i= 0 arr[0] in length i 3  --> j<3 bir altta geciyor
            arr[0][0] buda 3 oluyor ve bunu toplama ekliyor
            sonra j 1 artiyor fakar i halen 0 , 0 in j degerleri bitinceye kadar böyle devam eder
            ve toplama ekler
            i=1 olacak ve islemler tekrar edecek

             */

            for (int j = 0; j <arr[i].length ; j++) { // neden i nin legth i cünkü  0 daki index i aldiginda o
                // nun uzunlugu kadar gidecek

                toplam +=arr[i][j];  // icerdekilerin esit uzunlukta olmasi sarti yoktur

            }

        }
        System.out.println("array deki elementlerin toplemi : " + toplam);


    }

}
