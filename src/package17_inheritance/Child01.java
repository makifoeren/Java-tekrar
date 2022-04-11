package package17_inheritance;

public class Child01 extends Parent {
    public static void main(String[] args) {
            /*
            isim vari yok ama exstends oldugu icin Parent e gidip bakacak
            Child class hic bir objeye ihtiyac duymadan
            parent class'daki variable ve method'lara ulasabilir

         */
        System.out.println(isim); // Hasan
        System.out.println(fabrika); //Yildiz Tekstil

        method1();
        method2();



    }


}
