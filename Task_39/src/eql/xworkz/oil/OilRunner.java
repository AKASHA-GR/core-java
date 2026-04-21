package eql.xworkz.oil;

public class OilRunner {
    public static void main(String[] args) {
        Oil oil1 = new Oil(180,950,"Sunflower");
        Oil oil2 = new Oil(180,950,"Sunflower");

        boolean equals = oil1.equals(oil2);
        System.out.println("Both oil1 and oil2 are same:"+equals);

    }
}
