package package10_constructor;

public class aaaaaStudent {
    String name;
    int age;
    String phone;

    aaaaaStudent(){ // parametresiz cons burda default lari alir class taki
                 // name null age 0 phone null

    }

    aaaaaStudent(String name, int age, String phone){ // parametreli cons return typ ta yok
        this.name=name;                                // this oldugu icin eger bir atama yoksa class takileri alir
        this.phone=phone;                              // name ali age atama yok int old icin 0 phone "0987-34"
    }                                                 // this.age olmaliki 23. satirdakini almaz

    public static void main(String[] args) {
        aaaaaStudent s1 = new aaaaaStudent();

        aaaaaStudent s2 = new aaaaaStudent("ali",25,"0987-34");

        System.out.println(s2.name  + ", " + s2.age + ", " + s2.phone); // ali, 0, 0987-34


    }


}
