package ExoSalaire;

public class CDD extends Employee{
    public int SB;
    public int Prime;

    public CDD(int SB, int prime, String name) {
        this.SB = SB;
        Prime = prime;
        this.setName(name);
    }

    public int getSalary() {
        return SB + Prime;
    }
}
