package package14__dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_IkiTarihArasiniBulma {


    public static void main(String[] args) {
        LocalDate bugun= LocalDate.now();
        LocalDate dogumGunu=LocalDate.of(1985,6,23);
        System.out.println(Period.between(dogumGunu,bugun)); // P36Y9M17D

        System.out.println(Period.between(dogumGunu,bugun).getYears()); // 50

        // FIXME: 09.04.2022 tarih yazdirid

    }

}
