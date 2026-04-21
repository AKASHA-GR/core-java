package eql.xworkz.toothPaste;

public class ToothPasteRunner {
    public static void main(String[] args) {
        ToothPaste toothPaste1 = new ToothPaste("Dober Red",220,150);
        ToothPaste toothPaste2 = new ToothPaste("Dober Red",220,150);

        boolean equals = toothPaste1.equals(toothPaste2);
        System.out.println("Both toothPaste1 and toothPaste2 are Same:"+equals);
    }
}
