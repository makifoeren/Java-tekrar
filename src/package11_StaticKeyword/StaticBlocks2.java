package package11_StaticKeyword;

public class StaticBlocks2 {

    {
        /*
        static olmayan bloklar ise obje olusturulurken calisir

        static bloklar sadece 1 kere en basta calisir ama
        static olmayan bloklar her obje olusturulurken yeniden calisir
         */
        System.out.println("static olmayan blok calisti");
    }

    static{
        System.out.println("static blok calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method basi");

        StaticBlocks2 obj1=new StaticBlocks2();
        StaticBlocks2 obj2=new StaticBlocks2();


    }
}
