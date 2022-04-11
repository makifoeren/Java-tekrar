package package7_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SoruIlkveSonKarakters {
    /*
       a ve b den oluşan 2 int array verildiğinde, aynı ilk öğeye sahiplerse veya
       aynı son öğeye sahiplerse true değerini döndürün.
       Her iki arrayin lengthi(öğe sayısı) 1 veya daha fazla olacaktır.
      commonEnd([1, 2, 3], [7, 3]) → true
      commonEnd([1, 2, 3], [7, 3, 2]) → false
      commonEnd([1, 2, 3], [1, 3]) → true
   */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 5 sayi giriniz");
        String myStr = scan.nextLine();
        String arr[] = myStr.split(" ");


        int[] myArr = new int[5];
        System.out.println(Arrays.toString(myArr));

        for (int i = 0; i < myArr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            myArr[i] = num;
        }
        System.out.println("MyArr " + Arrays.toString(myArr));

        int[] UseThisArray1 = new int[3];
        int[] UseThisArray2= new int[2];

        for (int i = 0; i < 3; i++) {

            UseThisArray1[i]=myArr[i];
        } System.out.println("UseThisArray1 : " + Arrays.toString(UseThisArray1));

        for (int i = 3; i <5 ; i++) {
            UseThisArray2[i-3]=myArr[i];
        } System.out.println("UseThisArray2 : " + Arrays.toString(UseThisArray2));
        // hoca yazdi


        List<Integer> outer=new ArrayList<>();

        outer.add(UseThisArray1[0]);
        outer.add(UseThisArray1[1]);
        outer.add(UseThisArray1[2]);

        System.out.println("outer " + outer);

        List<Integer> inner = new ArrayList<>();

        inner.add(UseThisArray2[0]);
        inner.add(UseThisArray2[1]);

        System.out.println("inner " + inner);

        if(outer.get(outer.size()-1)==inner.get(1)){//son elemanlari kiyasliyor
            System.out.println("true");
        } else if(outer.get(0)==inner.get(0)){//ilk elemanlari kiyasliyor
            System.out.println("true");
        }else System.out.println("false");

    }}

