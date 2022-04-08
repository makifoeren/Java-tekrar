package package5_loop;

public class C05_NestedForLoop {

    public static void main(String[] args) {
        // kullanicidan bir rakam alip carpim tablosu olusturalim
        // int input=4;

        // 1 2 3
        //2 4 6
        //3 6 9

       /* for (int i =1; i <=input ; i++) {
            for (int j = 1; j <=input ; j++) {
                System.out.print((i*j) + " ");
            }
            System.out.println(""); // satiri asagi cekmek icin
        } */

        //Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
        //        * // yapi böyle ise nested
        //        * *
        //        * * *
        //        * * * *
        int input = 5;

        for (int i = 1; i <= input; i++) {

            for (int j = 1; j <= i; j++) { // i yerine input yazarsan dikdörtgen formatinda olur
                // input2 deyip farkli kare ve diktortgen yapilabilir
                //inner loop <=i outer loop int te ki i

                System.out.print("* ");

            }
            System.out.println(" ");
        }
    }}
