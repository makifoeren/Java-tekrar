package package_18exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_FileInputStream {
    public static void main(String[] args) {

        String dosyaYolu="src/package18_exceptions/Dosya.text"; //dosya yolu degisse bile kod calisir ama hata verir

        try {
            FileInputStream fis=new FileInputStream(dosyaYolu); // bunu ilk yaptigimizda hata verdi
            int k=0;
            while ((k=fis.read()) !=-1){
                System.out.print((char)(k));
            }


        } catch (FileNotFoundException e) {  //22.satir ddha ince oldugu icin yer degistirirsen calismaz
            e.printStackTrace(); // calismaya devam exception firlatiyor
        } catch (IOException e) { // dosyalarla ilgili tüm yazma ve okumalareda gecerlidir
            e.printStackTrace();
        }

    }
}
