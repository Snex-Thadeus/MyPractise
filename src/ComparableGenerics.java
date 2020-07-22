import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stud implements Comparable<Stud>
{
    int rollno, marks;
    String name;

    public Stud(int rollno, int marks, String name) {
        this.rollno = rollno;
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Stud{" +
                "rollno=" + rollno +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }
    public int compareTo(Stud s)
    {
        return marks>s.marks?1:-1;
    }
}

public class ComparableGenerics {
    public static void main(String[] args) {
        List<Stud> studs = new ArrayList<>();
        studs.add(new Stud(23, 65, "Teddy"));
        studs.add(new Stud(43, 54, "Odhis"));
        studs.add(new Stud(63, 43, "Snex"));
        studs.add(new Stud(13, 80, "Lwande"));

         Collections.sort(studs, (i,j)->i.marks>j.marks?1:-1);
        for (Stud s : studs) {
            System.out.println(s);

        }
    }
}
