package agr.xworkz.concert;

public class Singer {
    String name;
    int age;

    public Singer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Singer Name:"+name+",Singer Age:"+age;
    }
}
