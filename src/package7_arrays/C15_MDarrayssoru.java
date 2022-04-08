package package7_arrays;

public class C15_MDarrayssoru {

    public static void main(String[] args) {
        // asagidaki MDA
        // ic array lerindeki son elemenlar carpimini ekrana yazdirin
        // ekrana yazdirilam {{1,2,3},{3,4},{6}}
        /*
        son elemen dedigi icin ic ice loop olmaya bilir cünkü bir dolasma olmayacak
        hedef belli son elemlar
        burada 2 katli oldugunu anliyoru
        carpim*=arr[i][arr[i].length-1
        i 0 alacak 0 in length inin -1 (3-1) arr[0][2] ==3
        i 1 alacak 1 in length inin -1 (2-1) arr[1][1] ==5
        i 2 alacak 2 in length inin -1 (1-1) arr[2][0] ==6

         */

        int arr[][]={{1,2,3},{3,4},{6}};
        int carpim=1; // carpimlarini bulmk icin konteyner

        for (int i = 0; i <arr.length ; i++) { // arr length ine bakmak icin

            carpim*=arr[i][arr[i].length-1];

        }
        System.out.println("son elementlerin carpimi : " + carpim);
    }

}


