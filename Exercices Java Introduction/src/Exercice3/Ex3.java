package Exercice3;

public class Ex3 {

    public static double average(String[] nbs) {
        Integer sum = 0;
        try {
            for (String nb : nbs) {
                sum += Integer.parseInt(nb);
            }
            return sum.doubleValue() / nbs.length;
        } catch (NumberFormatException nfe) {
            System.out.println("Values are incorrect");
            System.out.println(nfe);
            return 0;
        }
    }

    public static void main(String[] args) {
        String[] array = {"13", "146", "b", "t" , "67"};
        System.out.println(average(array));
    }
}
