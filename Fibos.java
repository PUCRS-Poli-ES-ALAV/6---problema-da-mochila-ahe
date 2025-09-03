import java.util.ArrayList;
import java.util.List;

public class Fibos {

    public int fiboRec(int n) {
        if (n <= 1) return n;

        return fiboRec(n - 1) + fiboRec(n - 2);
    }

    public int fibo(int n) {
        int[] f = new int[n + 1];
        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[n];
    }

    public int memoizedFibo(int n, int[] f) {
        for (int i = 0; i < n; i++) {

        }
        return 0;
    }

    private int lookupFibo(int n, int[] f) {
        if (f[n] >= 0) return f[n];


        return 0;
    }
}
