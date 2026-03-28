class BitShiftBinary {
    public static void main(String[] args) {
        int num = 5;

        System.out.println("Original: " + num + " -> " + Integer.toBinaryString(num));

        int left = num << 1;
        System.out.println("Left Shift: " + left + " -> " + Integer.toBinaryString(left));

        int right = num >> 1;
        System.out.println("Right Shift: " + right + " -> " + Integer.toBinaryString(right));
    }
}