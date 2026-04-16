package agr.xworkz.Room;

public class runner {
    public static void main(String[] args) {
        WindowType windowType = new WindowType("sliding");
        int[] numberOfRooms = {10,5,8,7,13,15,18,20};

        Room room = new Room(Temparetur.THIRTY_FIVE,numberOfRooms,windowType,1200,800);
        System.out.println(room.toString());
        room.store();
        room.BuildInfo();
        System.out.println();

        ClassRoom classRoom = new ClassRoom(Temparetur.THIRTY_FIVE,numberOfRooms,windowType,1200,800,80,12);
        System.out.println(classRoom.toString());
        classRoom.store();
        classRoom.BuildInfo();
    }
}
