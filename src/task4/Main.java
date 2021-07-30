package task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            while (reader.ready()) {
                nums.add(Integer.parseInt(reader.readLine()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error in first file");
        }
        int[] numbers = new int[nums.size()];
        for (int i = 0; i < nums.size() ; i++) {
            numbers[i] = nums.get(i);
        }
        System.out.println(ArrayChecker.avChecker(numbers));
    }
}
