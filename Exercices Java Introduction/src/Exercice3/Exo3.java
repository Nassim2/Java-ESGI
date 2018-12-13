package Exercice3;

import java.util.ArrayList;

public class Exo3 {

    public static double average(String nbs) {
        Integer sum = 0;
        char[] nb_arr = nbs.toCharArray();
        try {
            for (int i = 0; i < nb_arr.length; i++) {
                sum += Character.getNumericValue(nb_arr[i]);
            }
            return sum.doubleValue() / nb_arr.length;
        } catch (NumberFormatException nfe) {
            System.out.println("Values are incorrect");
            return 0;
        }
    }

    public static void main(String[] args) {
        average("1256783920495");
    }
}
