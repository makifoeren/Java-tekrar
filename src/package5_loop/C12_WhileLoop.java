package package5_loop;

public class C12_WhileLoop {
    public static void main(String[] args) {
        // kullanicidan bir sayi alip bu sayinin rakamlarini toplayin

        int input=1234;
        int rakam=0;
        int rakamlartoplami=0;

        while (input>0){
            rakam=input%10;
            rakamlartoplami+=rakam;
             input /=10;
        }
        System.out.println(rakamlartoplami);
    }
}
