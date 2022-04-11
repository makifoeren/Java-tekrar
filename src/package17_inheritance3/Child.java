package package17_inheritance3;

import package17_inheritance2.Parent;

  public class Child extends Parent {

      // bir class'i child class yaptigimizda
      // parent class'daki constructor'a ulasmasi gerekir
      // bu durumda parent class'daki constructor'in
      // access modifier'i uygun bir modifier yapilmalidir

      Child(){ //3
          super(); //4 //17/2 deki parent() in önüne ulasilabilmesi
                            // 5 6 7 orada calisi icin protected yaptik veya public
          System.out.println("child class parametresiz cons"); // 8

      } //9

      Child(int s){
          // Child class'da tum constructor'larin ilk satirina
          // Java'nin yerlestirdigi constructor PARAMETRESIZ dir yani super()

          System.out.println("Child class parametreli cons.");
      }

      Child(int sayi1, int sayi2){
          // Eger parent class'dan parametresiz constructor'i degil de
          // baska bir constructor'i calistirmak isterseniz
          // bunu Child class'daki constructor'in ILK SATIRINA yazmalisiniz
          super(sayi1,sayi2);
          System.out.println("Child iki parametreli cons.");
      }


      public static void main(String[] args) { //1

          Child child=new Child(5,8); //2 //10 bosken

      }
  }
