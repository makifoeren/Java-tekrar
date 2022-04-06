package package3_stringManipulation;

public class C17_TerstenYazdirma {
    public static void main(String[] args) {
        //Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.

        String input = "mavi";
        String tersStr = input.substring(3).toUpperCase() + // ilk hrarf büyük digerleri kücük
                input.substring(2, 3).toLowerCase() +
                input.substring(1, 2).toLowerCase() +
                input.substring(0, 1).toLowerCase();
        System.out.println(tersStr);

    }
}
