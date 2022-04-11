package package16_accessModifilerEncapsulation;

public class C03 {
    // encapsule edecegimiz 2 variable olusturalim
    // generate  ile yapttik

    private int sayi;
    private String str;


    public int getSayi() { // sayiyi getiri deger atamaz
        return sayi;
    }

    public void setSayi(int sayi) { // deger atar
        this.sayi = sayi;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return  // bunu düzenleyebilirisn
                "sayi=" + sayi +
                ", str=" + str ;
    }
}
