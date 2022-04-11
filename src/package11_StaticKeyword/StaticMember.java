package package11_StaticKeyword;

public class StaticMember {

    static int x;  // static variable
    int y; // instance variable

    StaticMember(){ // cons //3 //8
        x+=2;//4 //9
        y++;//5 //10
    }//6 //11

    static int getSquare(){ // static method //13
        return x * x; //14
    }

    public static void main(String[] args) { //1
        StaticMember sm1=new StaticMember(); //2

        StaticMember sm2=new StaticMember();//7

        int z =sm1.getSquare(); //12 // static bir method a olasmak icin obj ye ihtiyac var

        System.out.println("-x" + z + "-y" + sm2.y); //-x16-y1   (y inctance old icin obj üzerindenyazdirili) // 15


    }
}
