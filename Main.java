public class Main {
    public static void main(String[] args) {

        Fibos fibos = new Fibos();
        int n = 10;

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

        System.out.println("FiboRec: " + fibos.fiboRec(n));
        System.out.println("Fibo: " + fibos.fibo(n));
        System.out.println("MemoizedFibo: " + fibos.memoizedFibo(n, new int[n + 1]));
    }
}
