package ExoSalaire;

public class CDI extends Employee {
    public int SB;

    public CDI(int SB, String name) {
        this.SB = SB;
        this.setName(name);
    }

    public int getSalary(){
        return SB;
    }
}
