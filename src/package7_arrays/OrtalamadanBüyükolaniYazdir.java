package package7_arrays;

public class OrtalamadanBüyükolaniYazdir {
    public static void main(String[] args) {

            /*
             * write a java program that calculates the average value of array elements
             * Print elements that are greater than avarage
             * (dizi elemanlarinin ortalama degerini hesaplayan ve
             * lari yazdıran bir java programi yazin)
             * input[]= {1,2,3,4,5,6,7}
             * Output : 4
             */

        int arr[]={1,2,3,4,5,6,7};
        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            toplam +=arr[i];

        }System.out.println(toplam); //28


        double ortalama=toplam/arr.length;
        System.out.println("ortalama =" + ortalama); //ortalama =4.0
        System.out.print("ortalama dan büyük olanlar =  " );

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>ortalama){
                System.out.print(arr[i] + " ");
            }

        }

        for (int i = 0; i < arr.length; i++) {

        }
    }

}
