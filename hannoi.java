public class hannoi {
    public static void main(String[] args) {
        int n = 3;
        hannoi(n, 'A', 'B', 'C');
    }
    public static void hannoi(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println(a + " -> " + c);
        } else {
            hannoi(n - 1, a, c, b);
            System.out.println(a + " -> " + c);
            hannoi(n - 1, b, a, c);
        }
    }
    
    
}
