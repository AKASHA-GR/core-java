package agr.xworkz.jail;

public class Name {
    String name;
    String location;

    public Name(String name, String location) {
        this.name = name;
        this.location = location;
    }

    @Override
    public String toString() {
        return "JailName:"+name+",Location:"+location;
    }
}
