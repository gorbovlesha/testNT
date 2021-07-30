package task4;

public class ArrayChecker {

    public static int avChecker(int[] arr) {
        double average = 0;

        if (arr.length > 0)
        {
            double sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j];
            }
            average = sum / arr.length;
        }

        int prox = arr[0];
        double dif = Math.abs(average-prox);

        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(average - arr[i]) < dif) {
                prox = arr[i];
                dif = Math.abs(average - arr[i]);
            }
        }


        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < prox) {
                counter += prox - arr[i];
            } else if (arr[i] > prox) {
                counter += arr[i] - prox;
            }
        }
        return counter;
    }

}
