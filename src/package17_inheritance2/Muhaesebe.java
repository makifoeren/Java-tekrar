package package17_inheritance2;

public class Muhaesebe extends Personel{

    protected int saatUcreti;
    protected  String statu;
    protected int maas=8;


    protected int maasHesapla(){
        int maas=saatUcreti*8*30;
        return maas;
    }
}
