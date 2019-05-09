package ExoCompare;

public class Student implements Operators<Student> {

    public int id;

    public int compareTo(Student s){
        return id - s.id;
    }

    public static void main(String[] args) {

    }
}
