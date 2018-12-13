package Exercice2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class Ex2 {
    public static double average(String fileName) {
        ArrayList<Integer> array = new ArrayList<>();
        Integer sum = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] res = line.split(":");
                array.add(Integer.parseInt(res[1]));
            }
            for (Integer mark : array) {
                sum += mark;
            }
            return sum.doubleValue() / array.size();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static double getMarkEmail(String fileName, String Email) {
        Integer res = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parse = line.split(":");
                if (Objects.equals(parse[0], Email)) {
                    res += Integer.parseInt(parse[1]);
                }
            }
            return res;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static void main(String[] args) {
        double average = average("test.txt");
        double getMark = getMarkEmail("test.txt", "test.test@gmail.com");
        System.out.println(average);
        System.out.println(getMark);
    }
}

