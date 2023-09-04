public class Main {
    public static void main(String[] args) {
        int[] original = {-3, 2, 6, -11};
        int[] cumSum = new int[original.length];
        int n = 1;

        for (int i = 0; i < original.length; i++) {
            if (i == 0)
                cumSum[i] = original[i];
            else {
                cumSum[i] = cumSum[i-1] + original[n];
                n++;
            }
        }
        for (int sum : cumSum)
            System.out.print(sum + " ");
    }
}