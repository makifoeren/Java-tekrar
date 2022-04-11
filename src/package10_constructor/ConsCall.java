package package10_constructor;

public class ConsCall {

    /*
    Bir cons in icinden digeri cons u cagirmak icin this(parametere); kullanilir
    this() yazilinca cons tan sonra ilk satirda yazilmali ve sadece 1 tane olmali
     */
    int x =5;

    ConsCall(){ //cons1 //5 //11
        System.out.println("-x" + x); // -x5 //6 //12

    }//7

    ConsCall(int x) { //cons2 //3
        this(); // conscoll 1. satirdaki parametresiz //4
        System.out.println("-x" + x); //-x4 //8
    }//9

    public static void main(String[] args) { //1

        ConsCall cc1 =new ConsCall(4); //2

        ConsCall cc2 =new ConsCall(); //10 bir daha yukari gider ve yazdirir


    }
}
