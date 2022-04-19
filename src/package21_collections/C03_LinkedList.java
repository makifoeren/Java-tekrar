package package21_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {
        //List ten gelen özellikleri kullandik
        //Deque den gelenlere bakacagiz


        Deque<Integer> ll1=new LinkedList<>();

        ll1.addFirst(10); // basa element ekler
        ll1.addLast(20); // sona element ekler, add() gore daha hizlidir
        System.out.println(ll1);
        System.out.println(ll1.element()); // ilk elementi silmeden bize dondurur  10
        // ilk element yoksa exception firlatir
        System.out.println(ll1); //[10, 20]

        ll1.getLast();
        System.out.println( ll1.getLast()); //  son elementi silmeden bize dondurur 20
        System.out.println( ll1.getFirst() ); // ilk elementi silmeden bize dondurur

        ll1.offer(30); // sona ekler ama bize birsey dondurmez
        System.out.println(ll1);  //[10, 20, 30]

        ll1.offerLast(40); // // sona ekler ve bize true dondurur
        System.out.println(ll1); //[10, 20, 30, 40]

        ll1.offerFirst(50);
        System.out.println(ll1); //[50, 10, 20, 30, 40]

        ll1.peek();  // bulamazsa null döner
        System.out.println(ll1.peek());// ilk elementi silmeden bize dondurur bulamazsa null döndürür -50








    }
}
