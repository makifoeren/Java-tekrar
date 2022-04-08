package package5_loop;

public class C03_Polindrome {
    public static void main(String[] args) {

    // Soru 9 ) Interview Question Kullanicidan bir String isteyin.
    // Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden bir method
    // yazin. Palidron terse cevirip cikanda ayni ise Palidrome denir

    String str="ahmet";
    palindromeKontrolEt(str);

}

    private static void palindromeKontrolEt(String str) {
        String terstenstr="";
        for (int i = str.length() - 1; i >= 0; i--) {
            terstenstr+=str.charAt(i);

        }
        System.out.println("Girdiginiz kelimenin tersten yazilisi : " + terstenstr);

        if (str.equalsIgnoreCase(terstenstr)){

            System.out.println("Girdiginiz kelime palidrom");
        }else System.out.println("Girdiginiz kelime palindrom degil");
    }
}