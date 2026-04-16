package agr.xworkz.medicalShop;

public class Staff {
    String name;
    int age;

    public Staff(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "NameOfStaff:"+name+",AgaOfStaff:"+age;
    }
}
