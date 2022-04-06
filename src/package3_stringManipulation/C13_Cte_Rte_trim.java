package package3_stringManipulation;

public class C13_Cte_Rte_trim {
    public static void main(String[] args) {

        // 16.yöntem cte-rte
       //  int sayi= null;  cte -int primitiv oldugu icin null degeri alamz synteax hatasi olarak görürve tüm projeyi etkiler

        String str="  Hava cok güzel  ";
        // System.out.println(str.substring(50)); // bunu calistiri ama terminalde hata yi gösterir rte

        //17. yöntem trim tüm stringin önünde ve sonundaki bosluklari keser


        System.out.println(str); //   Hava cok güzel
        System.out.println(str.length()); //18
        System.out.println(str.trim());//Hava cok güzel
        System.out.println(str.trim().length());//14

        str=str.trim(); // atama yapabiliriz
        System.out.println(str); //Hava cok güzel


    }
}
