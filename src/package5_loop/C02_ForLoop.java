package package5_loop;

public class C02_ForLoop {
    public static void main(String[] args) {

        /* ekranda 10 kez "java güzeldir" yazdirin

        for (int i = 1; i <=10 ; i++) {
            System.out.println(i + " - Java güzeldir ");
        } */

        /* 10 ile 30 arasindaki(10 ve 30 dahil) sayilari aralarinda virgul olarak ayni satirda yazdirin

        for (int i = 10; i <=29; i++) {
            System.out.print(i + " , ");
        }
        System.out.print(30);*/

         /*Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak
         girilen sayiya kadar 3’un kati olan sayilari yazdirin

        int sayi = 27;

        for (int i = 1; i <= sayi; i++) {

            if (i % 3 == 0) {

                System.out.print(i + " ,");
            }*/

            // verilen iki harf ve aralarindaki harfleri yazdiran
            // bir kod yaziniz

            char ilkHArf='b';
            char sonHArf='h';
            for (char j = ilkHArf; j <=sonHArf ; j++) {
                System.out.print(j + " ");

            }

    }

    }







