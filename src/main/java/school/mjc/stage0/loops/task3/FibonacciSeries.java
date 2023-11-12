package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        System.out.println(0);
        System.out.println(1);

        int num;
        int n_prev = 0;
        int n = 1;

        for (int i = 2; i < lastFibonacci; i++) {
            num = n + n_prev;
            n_prev = n;
            n = num;
            System.out.println(num);
        }
    }
}
