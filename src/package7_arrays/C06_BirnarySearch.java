package package7_arrays;

import java.util.Arrays;

public class C06_BirnarySearch {
    public static void main(String[] args) {
        int arr[]= {3,5,6,1,9,45,25,4,9,0};
        int istenenSayi=35;

        // Eger Javadan hazir BinarySearch ile yapmak isterseniz
        // once sort methodunu kullanip, sonra binarySearch yapmaliyiz
        // binarySearch() bize istenen sayinin oldugu indexi verir
        // bir elementin var olup olmadigini bulabiliriz fakat önce sort yapmaliz

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [0, 1, 3, 4, 5, 6, 9, 9, 25, 45]
        System.out.println(Arrays.binarySearch(arr,istenenSayi)); // -10 35 icin
        //  35 olsa id 25 ile 45 arasi olur yani 10 uncu sayi olurdu
        // eger olmayan bir elemnti aratirsak
        // Java bulamadigini gostermek icin - isareti koyar
        // sonrada o sayi olsaydi siralamasi ne olacak ise o sirayi bize verir
        // olan sayilar index döner yani 0 dan baslar
        // olmayanlar - ve sira döner

        // bir elementin Arrays te olup olmadigi bu yöntemke bulunur

        int [] num={2,4,5,6};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num)); // [2, 4, 5, 6]
        System.out.println(Arrays.binarySearch(num,4)); //1
        System.out.println(Arrays.binarySearch(num,6)); //3
        System.out.println(Arrays.binarySearch(num,7)); // -5
        System.out.println(Arrays.binarySearch(num,18)); // -5






    }
}
