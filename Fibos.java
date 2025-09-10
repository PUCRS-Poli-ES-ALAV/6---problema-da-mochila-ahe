
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
        for (int i = 0; i <= n; i++) {
            f[i] = -1;
        }
        return lookupFibo(n, f);
    }

    private int lookupFibo(int n, int[] f) {
        if (f[n] >= 0) {
            return f[n];
        } else if (n <= 1) {
            f[n] = n;
        } else {
            f[n] = lookupFibo(n - 1, f) + lookupFibo(n - 2, f);
        }
        return f[n];
    }

    public int backPackPD(int n, int c, int[][] itens){
        int [][] maxTab = new int[n + 1][c + 1];
        
        for(int i  = 1 ; i <= n ; i++){
            int peso = itens[i][0];
            int valor = itens[i][1];

            for(int j = 1; j <= c; j++){
                if(peso <= j){
                    maxTab[i][j] = Math.max(maxTab[i  - 1][j], valor + maxTab[i - 1][j - peso]);

                }else {
                    maxTab[i][j] = maxTab[i - 1][j];
                }
            }
        }
        return maxTab[n][c];
    }
}
