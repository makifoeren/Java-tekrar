package package7_arrays;

public class C05_BirnarySearch {
    public static void main(String[] args) {

        // Verilen array'de istenen bir elementin var olup olmadigini true/false yazdirarak
        // gosteren bir method olusturun
        int arr[]= {3,5,6,1,9,45,25,4,9,0};
        int istenenSayi=77;
        istenenElemanVarMi(arr,istenenSayi);

    }

    private static void istenenElemanVarMi(int[] arr, int istenenSayi) {
        // olmayan bir elemen yazinca false vermiyor bu sadce bulduysa karsilastiri döndürü bunu engellemek icin basa
        // boolean false yapip cözmüs olacagiz ayni sonucu bulunca true dönecek

        boolean sonuc=false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==istenenSayi){
                sonuc=true;
                break;
            }

        }
        System.out.println(sonuc);


    }


}
