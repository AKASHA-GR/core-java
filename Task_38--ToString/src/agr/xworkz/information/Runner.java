package agr.xworkz.information;

public class Runner {
    public static void main(String[] args) {
        Type type = new Type("Harassment");

        Information information = new Information(type,Resource.NEWS,"America",false,"02-20-2026");
        information.resourceInfo();
        information.typeInfo();
        System.out.println(information);

        RecismInfo recismInfo = new RecismInfo(type,Resource.NEWS,"America",false,"02-20-2026","NorthAmerica","washington");
        recismInfo.resourceInfo();
        recismInfo.typeInfo();
        System.out.println(information);
    }
}
