package agr.brand.names;

public class Festival <T,U>{
    T x;
    U y;

    public Festival(T x,U y){
        this.x =x;
        this.y =y;
    }

    public void action(){
        System.out.println(this.x);
        System.out.println(this.y);
    }
}
