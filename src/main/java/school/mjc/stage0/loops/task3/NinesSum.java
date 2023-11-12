package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        String str = "";

        for (int i = 0; i < lengthOfLastNumber; i++) {

            str += 9;
            sum += Integer.parseInt(str);
        }
        System.out.println(sum);
    }
}
