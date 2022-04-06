package package3_stringManipulation;

public class C11_substring {

    public static void main(String[] args) {
        // 16. yöntem substring  verilen string in istenen parcasini index ini kullanarak almamizi saglar

        String str="Bugün hava cok güzel";


        System.out.println(str.substring(5)); //  hava cok güzel
        System.out.println(str.replace("Bugün","Yarin")); //Yarin hava cok güzel
        System.out.println("Yarin " + str.substring(5)); //Yarin hava cok güzel
        System.out.println(str.substring(6)); //hava cok güzel 6 - inclusive
        System.out.println(str.substring(0,7)); //Bugün h
        System.out.println(str.substring(0,1)); //B
        // 5. harfi (6. index )bulmak icin daha once charAt kullaniyorduk fakat burada str.charAt kabul etmez
        // char a cevirir primitiv olur ve string kullanilmaz
        System.out.println(str.substring(4,5));//n
        System.out.println(str.substring(4,4)); // hiclik verecek son eclusive gecerli
        // System.out.println(str.substring(7,2)); bu sekilde kabul etmez
        System.out.println(str.substring(str.length()-1)); // son harfi verir l
        System.out.println(str.substring(str.length())); // son karakterde sonrasi olmadigi icin hiclik
        System.out.println(str.substring(str.length()-5)); // son bes harfi güzel








    }
}
