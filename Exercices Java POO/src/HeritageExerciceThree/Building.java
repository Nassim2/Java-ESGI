package HeritageExerciceThree;

public abstract class Building implements Comparable<Building> {
    protected String owner;
    protected String address;
    protected double area;

    public abstract double tax();

    public abstract void print();

    public Building(String owner, String address, double area) {
        this.owner = owner;
        this.address = address;
        this.area = area;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int compareTo(Building building){
        if (building.area == area)
            return 0;
        else if (area < building.area)
            return 1;
        else
            return -1;
    }
}