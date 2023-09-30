public class EX07 {
    public static int power(int x, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }

    public static void main(String[] args) {
        int result1 = power(2, 5); // 计算 2 的 5 次方
        int result2 = power(3, 2); // 计算 3 的 2 次方

        System.out.println("2^5 = " + result1);
        System.out.println("3^2 = " + result2);
    }
}
