package HeritageExerciceThree;

public class Company extends Building{
    String name;
    int employeeCounter;
    int avg;

    public double tax() {
        return 6.3 * area;
    }

    public Company(String owner, String address, double area, String name, int employeeCounter, int avg) {
        super(owner, address, area);
        this.name = name;
        this.employeeCounter = employeeCounter;
        this.avg = avg;
    }

    public void print() {
        System.out.println(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeCounter() {
        return employeeCounter;
    }

    public void setEmployeeCounter(int employeeCounter) {
        this.employeeCounter = employeeCounter;
    }

    public int getAvg() {
        return avg;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", employeeCounter=" + employeeCounter +
                ", avg=" + avg +
                ", owner='" + owner + '\'' +
                ", address='" + address + '\'' +
                ", area=" + area +
                '}';
    }
}
