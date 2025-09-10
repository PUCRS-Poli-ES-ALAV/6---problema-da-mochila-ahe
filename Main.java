public class Main {
    public static void main(String[] args) {

        Fibos fibos = new Fibos();
        int n;

        int[][] itens = {
            {0, 0}, 
            {2, 3},
            {3, 4},
            {4, 5},
            {5, 8}
        };

        int N = 4; 
        int C = 5;  

        int resultado = fibos.backPackPD(N, C, itens);
        System.out.println("Valor máximo possível: " + resultado);


        for (int i = 1; i <= 10; i++) {
            n = i;
            System.out.println("\n-----------------------------" + i + "----------------------------------");
            System.out.println("FiboRec: " + fibos.fiboRec(n) + ", Iterações: " + fibos.getCounterFiboRec() + ", Instruções: " + fibos.getCounterInstructionsFiboRec());
            System.out.println("Fibo: " + fibos.fibo(n) + ", Iterações: " + fibos.getCounterFibo() + ", Instruções: " + fibos.getCounterInstructionsFibo());
            System.out.println("MemoizedFibo: " + fibos.memoizedFibo(n, new int[n + 1]) + ", Iterações: " + fibos.getCounterMemoizedFibo() + ", Instruções: " + fibos.getCounterInstructionsMemoizedFibo());
        }

    }
}
