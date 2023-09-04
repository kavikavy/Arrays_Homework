public class Main {
    public static void main(String[] args) {
        int[] NUMS = {3, 5, 0, 11, 1};
        int COUNT = 0, S = 0;

        for (int i = 0; i < 5; i++) {
            if (NUMS[i] != 0) {
                S = S + NUMS[i];
                COUNT++;
            }
        }

        if (COUNT == 0)
            System.out.println(0);
        else
            System.out.println(S);
    }
}