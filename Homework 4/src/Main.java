public class Main {
    public static void main(String[] args) {
        int[] array = {5, 4, -7, -2, -1};
        int[] reverse = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reverse[i] = array[(array.length-1)-i];
        }
        for (int n : reverse)
            System.out.print(n + " ");
    }
}