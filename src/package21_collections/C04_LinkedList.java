package package21_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> ll1 = new LinkedList<>();

        Deque<Integer> ll2 = new LinkedList<>();

        // System.out.println(ll1.element()); // bosken kullanilirsa exception firlatir

        System.out.println(ll1.poll()); // bastaki elementi veriri bos sa null döner

        System.out.println(ll1.pollFirst()); // bos oldgu icin null
        System.out.println(ll1.pollLast());// bos oldgu icin null
       // System.out.println(ll1.pop()); // ilk elementi bulup sildirir bulamazsa bize excepton firlatir

        ll1.push(30);
        ll1.push(20);
        System.out.println(ll1); // [20, 30] basa ekleme yapar

        ll1.remove();
        System.out.println(ll1.remove()); // ilk elemti siler ve bize döndürür

        ll2.push(40);
        ll2.push(50);
        System.out.println("ll2" + ll2); //ll2[50, 40]

       ll2.remove(50); // Deque obj verir

        System.out.println(ll2.remove()); // obj olarak 50 yi siler

        ll1.removeFirstOccurrence(30);
        System.out.println(ll1);






    }
}
