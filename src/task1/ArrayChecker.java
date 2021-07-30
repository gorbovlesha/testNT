package task1;

public class ArrayChecker {
    public static int[] arrayCreation(int num1) {
        if (num1 <= 0) return null;

        int[] arr = new int[num1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    public static String check(int[] arr, int num2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int nextVal = 0;

        sb.append(arr[0]);

        while (i != arr[0]) {
            for (int j = 0; j < num2-1; j++) {
                int[] arr2;
                arr2 = transmit(arr, nextVal);
                i = arr2[0];
                nextVal = arr2[1];
            }
            if (i == arr[0]) {
                break;
            }
            sb.append(i);
        }
        return sb.toString();
    }

    public static int[] transmit(int[] arr, int startPos) {
        return new int[]{arr[(1 + startPos) % arr.length], ++startPos};
    }
}
