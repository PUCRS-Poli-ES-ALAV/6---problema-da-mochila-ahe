
public class Fibos {
    public int counterFiboRec = 0;
    public int counterFibo = 0;
    public int counterMemoizedFibo = 0;

    public int counterInstructionsFiboRec = 0;
    public int counterInstructionsFibo = 0;
    public int counterInstructionsMemoizedFibo = 0;




    public int fiboRec(int n) {
        if (n <= 1) return n; counterInstructionsFiboRec++;
        counterFiboRec++;
        counterInstructionsFiboRec++;
        return fiboRec(n - 1) + fiboRec(n - 2);
    }

    public int fibo(int n) {
        int[] f = new int[n + 1]; counterInstructionsFibo++;
        f[0] = 0; counterInstructionsFibo++;
        f[1] = 1; counterInstructionsFibo++;

        counterInstructionsFibo++;
        for (int i = 2; i <= n; i++) {
            counterInstructionsFibo++;
            counterInstructionsFibo++;
            f[i] = f[i - 1] + f[i - 2]; counterInstructionsFibo++;
            counterFibo++;
        }

        return f[n];
    }

    public int memoizedFibo(int n, int[] f) {
        counterInstructionsMemoizedFibo++;
        for (int i = 0; i <= n; i++) {
            counterInstructionsMemoizedFibo++;
            counterInstructionsMemoizedFibo++;
            f[i] = -1; counterInstructionsMemoizedFibo++;
            counterMemoizedFibo++;
        }
        return lookupFibo(n, f);
    }

    private int lookupFibo(int n, int[] f) {
        if (f[n] >= 0) {
            counterInstructionsMemoizedFibo++;
            counterMemoizedFibo++;
            counterInstructionsMemoizedFibo++;
            return f[n];
        } else if (n <= 1) {
            counterInstructionsMemoizedFibo++;
            counterMemoizedFibo++;
            counterInstructionsMemoizedFibo++;
            f[n] = n;  counterInstructionsMemoizedFibo++;
        } else {
            counterMemoizedFibo++;
            counterInstructionsMemoizedFibo++;
            counterInstructionsMemoizedFibo++;
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

    public int getCounterMemoizedFibo() {
        return counterMemoizedFibo;
    }

    public int getCounterFibo() {
        return counterFibo;
    }

    public int getCounterFiboRec() {
        return counterFiboRec;
    }

    public int getCounterInstructionsFiboRec() {
        return counterInstructionsFiboRec;
    }

    public int getCounterInstructionsFibo() {
        return counterInstructionsFibo;
    }

    public int getCounterInstructionsMemoizedFibo() {
        return counterInstructionsMemoizedFibo;
    }


}
