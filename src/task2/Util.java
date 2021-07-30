package task2;

public class Util {

    public static double check(float x, float y, float xc, float yc, float r) {
        double result = Math.pow((xc - x), 2) + Math.pow((yc - y), 2);
        return result;
    }
    public static void printResult(double result, float r) {
        if (result == Math.pow(r, 2)) System.out.print(0 + "\n");
        if (result > Math.pow(r, 2)) System.out.print(2 + "\n");
        if (result < Math.pow(r, 2)) System.out.print(1 + "\n");
    }
}
