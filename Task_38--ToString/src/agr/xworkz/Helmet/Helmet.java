package agr.xworkz.Helmet;

import java.util.Arrays;

public class Helmet {
    Type type;
    Brand brand;
    int[] count;
    String color;
    boolean isProtect;

    public Helmet(Type type, boolean isProtect, String color, int[] count, Brand brand) {
        this.type = type;
        this.isProtect = isProtect;
        this.color = color;
        this.count = count;
        this.brand = brand;
    }

    public void protect(){
        System.out.println("The helmet protect the head like a sheald.");
    }

    public void typeInfo(){
        System.out.println("The helmet have different types in it.");
    }

    @Override
    public String toString() {
        return "Type:"+type+",Brand:"+brand+",Count:"+ Arrays.toString(count)+",Color:"+color+",Helment Protect:"+isProtect;
    }
}
