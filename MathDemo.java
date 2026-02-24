public class MathDemo {

    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int sum(int[] args) {
        int total = 0;
        for (int num : args) {
            total += num;
        }
        return total;
    }


    public static void main(String[] args) {
        System.out.println("Min (5, 10): " + MathDemo.min(5, 10));
        System.out.println("Max (5, 10): " + MathDemo.max(5, 10));
        
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Sum of array: " + MathDemo.sum(numbers));
    }
}