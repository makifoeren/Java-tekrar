package package4_methodCreation;

public class C05_MethodCreation {
    public static void main(String[] args) {

        /*
        1. adim method adini yazin
        2. method a gidecek argümant var mi ?
        3.method olusturmada 3. adim method
        calisinca sadece bir sey mi yazdiracak yoksa bize bir data mi döndürecek buna karar vermektir

        *** bir method u olustirmak calismasi icin yetmez cagrilmasi lazim   ikiSayiTopla(a,b); cagirma dir
        ayni class veya farkli class ta olabilir
         */

        int a=12;
        int b=15;

        ikiSayiTopla(13,45);

        C03.dortHarfiTersineCevir("sema"); // baska yerden de cagirabilirisn
    }

    private static void ikiSayiTopla(int a, int b) {
        System.out.println(" verilen iki sayini toplami : " + (a+b));

    }
}
