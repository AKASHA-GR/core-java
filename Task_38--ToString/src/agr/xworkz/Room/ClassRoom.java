package agr.xworkz.Room;

public class ClassRoom extends Room{
    int numberOfStudent;
    int numberOfTeachers;

    public ClassRoom(Temparetur tempareture, int[] numberOfRooms, WindowType windowType, double height, double width, int numberOfStudent, int numberOfTeachers) {
        super(tempareture, numberOfRooms, windowType, height, width);
        this.numberOfStudent = numberOfStudent;
        this.numberOfTeachers = numberOfTeachers;
    }


    @Override
    public void store() {
        super.store();
    }

    @Override
    public void BuildInfo() {
        super.BuildInfo();
    }

    @Override
    public String toString() {
        return "NumberOfStudent:"+numberOfStudent+",NumberOfTeachers:"+numberOfTeachers;
    }
}
