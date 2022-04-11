package package17_inheritance3;

public class AAli {

    AAli(String isim){ //7
        System.out.println("Parametreli cons calisti"); //8
    }//9

    AAli(){ //5
        this("a"); // 6
        System.out.println("parametresiz cons calisti"); //19
    }
}
