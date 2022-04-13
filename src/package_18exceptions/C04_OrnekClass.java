package package_18exceptions;

public class C04_OrnekClass {
    public static void main(String[] args) {

      /*  int sayi1=10;
        int sayi2=20;

        try {
            System.out.println(sayi1/sayi2);
        } catch (ArithmeticException e) {
            System.out.println("Kodda hata var...");
            e.printStackTrace();
        }finally {
            System.out.println("connection u durdur... ");
        } */


/*
        String s="";

        try {
            s +="t";
        }catch (Exception e) {
            s +="c";
        }finally {
            s +="f";
        }
        s +="a";

        System.out.println(s); */


        System.out.println(exceptions()); //2

    }

    private static String exceptions() { //3
        String result = "";//4
        String v = null;//5

        try { //6 önce icte ki try catch calisacak
            try { //7
                result = result + "a"; //8
                v.length();// 9 nullpoint exc
                result = result + "c"; // bura calismaz
            } catch (NullPointerException e) { // 10 devreye girer
                result = result + "c"; // 11 ekler
            } finally { //12
                result = result + "d"; // 13
                throw new Exception(); // 14 exception firlatti
            }
        } catch (Exception e) { // 15 yakladi
            result = result + "e"; //16 ekledi
        }//17

        return result; //18
    }
}
