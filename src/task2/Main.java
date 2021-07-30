package task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        try {
            BufferedReader readerFile1 = new BufferedReader(new FileReader(args[0]));

            String line1File1 = readerFile1.readLine();
            String[] line1 = line1File1.split(" ");

            String line2File1 = readerFile1.readLine();

            circle.setXc(Float.parseFloat(line1[0]));
            circle.setYc(Float.parseFloat(line1[1]));
            circle.setR(Float.parseFloat(line2File1));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error in first file");
        }
        List<Point> points = new ArrayList<>();
        try {
            BufferedReader readerFile2 = new BufferedReader(new FileReader(args[1]));
            while (readerFile2.ready()) {
                String[] nums = readerFile2.readLine().split(" ");
                float x = Float.parseFloat(nums[0]);
                float y = Float.parseFloat(nums[1]);
                points.add(new Point(x, y));
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error in second file");
        }

        for (int i = 0; i < points.size(); i++) {
            double result = Util.check(points.get(i).getX(), points.get(i).getY()
                    ,circle.getXc(), circle.getYc(), circle.getR());
            Util.printResult(result, circle.getR());
        }
    }
}
