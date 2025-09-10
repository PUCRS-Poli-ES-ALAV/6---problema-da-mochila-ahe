public class Main {
    public static void main(String[] args) {

        Fibos fibos = new Fibos();
        int n = 10;

        System.out.println("FiboRec: " + fibos.fiboRec(n));
        System.out.println("Fibo: " + fibos.fibo(n));
        System.out.println("MemoizedFibo: " + fibos.memoizedFibo(n, new int[n + 1]));
    }
}
