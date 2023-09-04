public class Main {
    public static void main(String[] args) {
        int[] values = {-3, 2, 7, 4, 7};
        boolean result = true;

        for (int i = 1; i < values.length; i++) {
            if (values[i] < values[i-1])
                result = false;
        }
        System.out.println(result);
    }
}