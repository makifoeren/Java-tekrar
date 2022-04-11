package package17_inheritance3;

public class Test extends Hayat {

    public Test() { // cons // 3 burasu
        // super () parametresiz var
        //parent class ta parametresiz default() cons var
        // özelligi yok hic bit öz degistrmez
        // parent e gider ve geri döner
        // 4 gitti-- 5 geri döndü
        System.out.println("test class "); // 6
        super.getDetails(); // 7 class üyelerini cagirir
        // () olmadigi icin cons degil gider Hayat class indakini cagirir
        // 8-9-10 hayat class inda

    } //11

    public static void main(String[] args) { // 1
        Test obj2 = new Test(); // 2 obj olusturacak bu class //12
        // parametresiz con var mi bakar
        obj2.getDetails(); //13 bu class ta yok yine parent e gider
        // oradakini bir daha yazdirri
    }

}
