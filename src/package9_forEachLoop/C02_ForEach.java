package package9_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C02_ForEach {
    public static void main(String[] args) {
        // 10 elemntli bir list olustur

        int arr [] = {2,5,4,6,4,9,7,1,3,10};
        List<Integer> sayilar = new ArrayList<>();

        for (int each:arr
        ) {
            sayilar.add(each);
        }
        System.out.println(sayilar); // [2, 5, 4, 6, 4, 9, 7, 1, 3, 10]

        //Sayilar listesinde 3 e bölünemeyen sayilari for each loop yazdiralim

        for (int each :sayilar
        ) {
            if(each%3!=0){
                System.out.print(each + " "); // 2 5 4 4 7 1 10
            }

        }


    }
}
