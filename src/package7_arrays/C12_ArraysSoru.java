package package7_arrays;

import java.util.Arrays;

public class C12_ArraysSoru {

    public static void main(String[] args) {
        // verilen bir Array e yeni bir element ekleyin

        int arr[]={3,5,7}; // 4. bir arr ekle

        // arr[3]=8;  buna itiraz etmez fakat array e olmayan bir index e atama yapamayiz --rte verir
        // arr ={1,3,5}; var olan bir Array e ayni boyutta dahi olsa yeni degerler iceren bir atama yapamayiz

        arr=new int[4];  // [0,0,0,0] yeni deger atamasi yapilir eski deger ler iptal olmus olur

        System.out.println(Arrays.toString(arr));

        int arrYeni[]=new int[5];

        arr=arrYeni; // eski arr yi degistirdik

        System.out.println(Arrays.toString(arr)); //[0, 0, 0, 0, 0]

        arrYeni[0]=2;
        arrYeni[3]=5;

        arr=arrYeni;

        System.out.println(Arrays.toString(arr)); //[2, 0, 0, 5, 0]

        // Bir array e icinde hazir elementlerin oldugu yeni bir array atamak isterseniz
        // bunu {1,2,3,4,} diye degil new int [3] diyerek olusturup
        //sonra deger atayarak tamamladigimiz bir array i assing edeerek yapabiliriz
        //sag taraf parantezli yazamayz fakat önce bir arr olusturup atama yapabiliriz

        int  arrEnYeni[]={1,2,3,4,5};

        arr=arrEnYeni;

        System.out.println(Arrays.toString(arr)); //[1, 2, 3, 4, 5]






    }
}
