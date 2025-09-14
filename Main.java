import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Fibos fibos = new Fibos();
        int n;

        int[][] itens = {
                {0, 0},
                {2, 3},
                {3, 4},
                {4, 5},
                {5, 8},
                {6, 9},
                {7, 10},
                {8, 11},
                {9, 12},
                {10, 15},
        };

        Random rand = new Random();

        System.out.printf("%5s %5s %5s %12s %12s %12s%n",
                "Teste", "N", "C", "ValorMax", "Iterações", "Instruções");
        System.out.println("----------------------------------------------------------------------------");

        long inicioBateria = System.nanoTime();

        for (int t = 1; t <= 10; t++) {
            int N = 1 + rand.nextInt(itens.length - 1); // 1 .. itens.length-1
            int C = 3 + rand.nextInt(12);               // 3 .. 14

            int resultado = fibos.backPackPD(N, C, itens);

            System.out.printf("%5d %5d %5d %12d %12d %12d%n",
                    t, N, C, resultado,
                    fibos.getCounterMochilaIteractions(),
                    fibos.getCounterMochilaInstructions());
        }

        long fimBateria = System.nanoTime();
        double duracaoTotal = (fimBateria - inicioBateria) / 1_000_000_000.0;

        System.out.println("----------------------------------------------------------------------------");
        System.out.printf("Duração total dos 10 testes: %.8f s%n", duracaoTotal);

        /*
        double inicio = System.currentTimeMillis();
        for (int i = 1; i <= 10; i++) {
            n = i;
            System.out.println("\n-----------------------------" + i + "----------------------------------");
            System.out.println("FiboRec: " + fibos.fiboRec(n) + ", Iterações: " + fibos.getCounterFiboRec() + ", Instruções: " + fibos.getCounterInstructionsFiboRec());
            //System.out.println("Fibo: " + fibos.fibo(n) + ", Iterações: " + fibos.getCounterFibo() + ", Instruções: " + fibos.getCounterInstructionsFibo());
            //System.out.println("MemoizedFibo: " + fibos.memoizedFibo(n, new int[n + 1]) + ", Iterações: " + fibos.getCounterMemoizedFibo() + ", Instruções: " + fibos.getCounterInstructionsMemoizedFibo());
        }
        double fim = System.currentTimeMillis();
        double duration = (fim - inicio) / 1000;
        System.out.println("Duração: " + duration);
        */
    }
}
