public class Starpattern {
    public static void main(String[] args) {
        Starpattern s = new Stars();
        s.go(5);
    }

    private void go(int n) {
        String s = "";
        for (int i = 0; i < n; i++) s += " *";
        String w = "";
        for (int i = 0; i < n; i++) w += " ";

        for (int i = n; i > 0; i--) {
            System.out.print(w.substring(i));
            System.out.println(s.substring((n - i) * 2));
        }
        for (int i = 2; i <= n; i++) {
            System.out.print(w.substring(i));
            System.out.println(s.substring((n - i) * 2));
        }
    }
}