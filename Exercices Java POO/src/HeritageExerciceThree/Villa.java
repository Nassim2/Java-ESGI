package HeritageExerciceThree;

public class Villa extends Building {

    protected int roomCounter;
    protected boolean swimming_pool;

    public double tax() {
        return  swimming_pool ? roomCounter * 100 + 750 : roomCounter * 100;
    }

    public Villa(String owner, String address, double area, int roomCounter, boolean swimming_pool) {
        super(owner, address, area);
        this.roomCounter = roomCounter;
        this.swimming_pool = swimming_pool;
    }

    public void print() {
        System.out.println(this);
    }

    public int getRoomCounter() {
        return roomCounter;
    }

    public void setRoomCounter(int roomCounter) {
        this.roomCounter = roomCounter;
    }

    public boolean isSwimming_pool() {
        return swimming_pool;
    }

    public void setSwimming_pool(boolean swimming_pool) {
        this.swimming_pool = swimming_pool;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomCounter=" + roomCounter +
                ", swimming_pool=" + swimming_pool +
                ", owner='" + owner + '\'' +
                ", address='" + address + '\'' +
                ", area=" + area +
                '}';
    }
}
