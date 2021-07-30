package task1;

public class Main {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int[] arr = ArrayChecker.arrayCreation(num1);
        System.out.println(ArrayChecker.check(arr, num2));
    }

}
