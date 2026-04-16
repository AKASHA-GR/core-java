package agr.xworkz.Room;

import java.util.Arrays;

public class Room {
    Temparetur tempareture;
    int[] numberOfRooms;
    WindowType windowType;
    double height;
    double width;

    public Room(Temparetur tempareture, int[] numberOfRooms, WindowType windowType, double height, double width) {
        this.tempareture = tempareture;
        this.numberOfRooms = numberOfRooms;
        this.windowType = windowType;
        this.height = height;
        this.width = width;
    }

    public void store(){
        System.out.println("we can store any thing in Room.");
    }

    public void BuildInfo(){
        System.out.println("The room was build by defferent materials.");
    }

    @Override
    public String toString() {
        return "Tempareture:"+tempareture+",NumberofRooms:"+ Arrays.toString(numberOfRooms)+",WindowType:"+windowType+",Height:"+height+",Width"+width;
    }
}
