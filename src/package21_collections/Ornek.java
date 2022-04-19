package package21_collections;

import java.util.LinkedList;
import java.util.Scanner;

public class Ornek {
    public static void main(String[] args) {
/*
bir liste olusturun
kullanicidan bir isim isteyin
bu isim LinkedList te varsa "Bu isim LinkedList te vardi ve silindi"
eger yoksa "Bu isim LinkedList te yoktu ve silinmedi"
 */
        LinkedList<String> ll1 = new LinkedList<>();

        ll1.add("Ali");
        ll1.add("Veli");
        ll1.add("Can");
        ll1.add("Ayse");

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir isim giriniz...");
        String isim = scan.nextLine();

        System.out.println(ll1);

        if (ll1.remove(isim)){
            System.out.println("Bu isim LinkedList te vardi ve silindi");
            System.out.println(ll1);
        }else {
            System.out.println("Bu isim LinkedList te yoktu ve silinmedi");
            System.out.println(ll1);
        }
    }
}
