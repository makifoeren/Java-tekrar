package package16_deneme;

import package16_accessModifilerEncapsulation.C01;

public class DenemeChild extends C01 {
    public static void main(String[] args) {


        System.out.println(halkaAcikSayi );
        halkaAcikSayi=30;

        // obj olmamasina ragmen ulastik nedeni child class

        C01.aileyeOzel=25;

        // protectet ve static oldugu icin ulastik


}}