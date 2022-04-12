package package18_exceptions;

public class C04_Exceptions {

    public static void main(String[] args) {


        int a=10;
        int b=0; // 5 ikrn sorun yok 0 oluca hata verir
        int c=0;

        try {
            c=a/b;  // burayi scip try-catch yapiyoru
        } catch (Exception e) {
            // Buradaki e java nin exception i atayacagi obj adi
            //Exception ise olusan exception nin turü
            // e.printStackTrace();
            System.out.println(e.getMessage()); // / by zero
            System.out.println(e.toString());
            System.out.println(e.getCause()); // null
        }
        System.out.println(c);

    }
}

