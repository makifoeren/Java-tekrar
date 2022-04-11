package package17_inheritance3;

public class Ali extends AAli{

    Ali(){ // 3
        // 4 // gözukmez ama super () var perent teki ne götürür
        System.out.println("Ali cons calsiti "); //11
    }

    public static void main(String[] args) { //1
        Ali al1=new Ali(); // 2 // obje olustu cons calismali
                    // Ali  klassindaki parametresi
    }
}
