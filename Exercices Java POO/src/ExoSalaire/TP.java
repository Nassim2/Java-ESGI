package ExoSalaire;

public class TP extends Employee{
    public int NBH;
    public int TH;

    public int getSalary(){
        return TH * NBH;
    }

    public TP(int NBH, int TH, String name) {
        this.NBH = NBH;
        this.TH = TH;
        this.setName(name);
    }
}
