package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum = 0;
        int n = t;

        if (t > 0) {
            while (n > 9) {
                sum += n % 10;
                n = n / 10;
            }
            sum += n;
            System.out.println(sum);
        } else {
            while (n < -9) {
                sum += n % 10;
                n = n / 10;
            }
            sum += n;
            System.out.println(-sum);
        }
    }

}
