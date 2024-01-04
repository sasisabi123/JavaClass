public class Multiply {
    public static void main(String[] args) {
        multi(5, 5);
        multi(10, 10, 10);
    }

    public static void multi(int n1, int n2) {
        int total = n1 * n2;
        System.out.println("Total is " + total);
    }

    public static void multi (int n1, int n2, int n3) {
        int total = n1 * n2 * n3;
        System.out.println("Total is " + total);
    }
}
