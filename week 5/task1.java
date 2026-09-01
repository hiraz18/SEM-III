public class ArrayInsertDisplay {
    public static void main(String[] args) {
        int size = 10;
        int[] n = new int[size];
        for (int i = 0; i < size; i++) {
            n[i] = (i + 1) * 10;
        }
        System.out.println("Array elements:");
        for (int num : n) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
