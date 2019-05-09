package ExerciceTwo;

import java.util.ArrayList;

public class Application {

    ArrayList<ArrayList<Mark>> marks;

    public void print(){
        for (int i = 0; i < marks.size(); i++) {
            System.out.println("Etudiant " + i + " : ");
            for (int j = 0; j < marks.get(i).size(); j++) {
                System.out.println(marks.get(i).get(j).getValue());
            }
        }
    }

    public double average(int position) {
        double avg = 0;
        int count = 0;
        double res = 0;
        while (count < marks.get(position).size()){
            avg += marks.get(position).get(count).getValue();
            count++;
        }
        res = avg / count;
        return res;
    }

    public void add(int position, String subject, float value) {
        Mark mark = new Mark(value, subject);
        marks.get(position).add(mark);
    }

    public int compute() {
        return 0;
    }

    public double [] avgs() {
        double[] avgs = new double[marks.size()];
        for (int i = 0; i < marks.size(); i++) {
            avgs[i] = average(i);
        }
        return avgs;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Application() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Application{}";
    }
}
