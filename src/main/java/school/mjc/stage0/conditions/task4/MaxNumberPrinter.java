package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int max;
        max = first >= second && second <= first? first : second >= third? second:third;
        System.out.println(max);
    }
}
