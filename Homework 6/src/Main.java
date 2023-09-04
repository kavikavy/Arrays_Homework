public class Main {
    public static void main(String[] args) {
        int[] array = {4, -3, -5, 9, 1, 11};
        int m = 1;
        int[] smaller = new int[array.length];
        int[] larger = new int[array.length];
        int s = 0, l = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < m) {
                smaller[s] = array[i];
                s++;
            }
            else if (array[i] > m) {
                larger[l] = array[i];
                l++;
            }
        }

        System.out.print("Smaller: ");
        for (int small : smaller)
            System.out.print(small + " ");
        System.out.println();
        System.out.print("Larger: ");
        for (int large : larger)
            System.out.print(large + " ");
    }
}