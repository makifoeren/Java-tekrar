package package2_ifElse_Switch;

import java.util.Scanner;

public class C10_Soru {
    /*
           Veri tipi int olan variable(değişken) verildiğinde
               Eger int 1 ise print monday
               Eger int 2 ise print tuesday
               Eger int 3 ise print wednesday
               Eger int 4 ise print thursday
               Eger int 5 ise print friday
               Eger int 6 ise print saturday
               Eger int 7 ise print sunday
               Eger int 8 den buyuk ise  print "this is not a valid day"
               NOT : BU PROBLEMI ÇÖZERKEN SWITCH STATEMENT KULLANIN
        */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int day=scan.nextInt();

        switch(day) {
            case 1:
                System.out.println("p.tesi");
                break;
            case 2:
                System.out.println("sali");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("c tesi");
                break;
            case 7:
                System.out.println("pazar");
                break;

            default:
                System.out.println("yanlis deger girdiniz");



        }




    }
}