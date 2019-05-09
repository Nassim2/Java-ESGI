package ExoSalaire;

public class main {

    public static void main(String[] args) {
        Employee[] array = new Employee[3];
        array[0] = new CDD(3000, 500, "Jean");
        array[1] = new CDI(4000, "Michel");
        array[2] = new TP(20, 100, "Pierre");

        int sum;
        sum = 0;
        for (Employee employee : array) {
            sum += employee.getSalary();
        }

        System.out.println(sum);
    }
}