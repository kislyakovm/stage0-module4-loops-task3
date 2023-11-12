package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if (first == 0) {
            System.out.println(second);
        } else if (second == 0) {
            System.out.println(first);
        } else {
            if (first < second) {
                for (int i = first; i > 0; i --) {
                    if (second % i == 0 && first % i == 0) {
                        System.out.println(i);
                        break;
                    }
                }
            } else {
                for (int i = second; i > 0; i --) {
                    if (second % i == 0 && first % i == 0) {
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
    }
}
