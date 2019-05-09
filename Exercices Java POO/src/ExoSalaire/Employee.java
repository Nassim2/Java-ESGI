package ExoSalaire;

public abstract class Employee {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int getSalary();
}
