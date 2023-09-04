public class Main {
    public static void main(String[] args) {
        int[] num = {2, 5, -3, 11, 193, -2};
        int sum = 0;
        for (int n : num) {
            System.out.print(n + " ");
            sum += n;
        }
        System.out.println();
        System.out.println("Sum is: " + sum);
    }
}