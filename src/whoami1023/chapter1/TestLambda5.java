package whoami1023.chapter1;

import java.text.Collator;
import java.util.TreeSet;

/**
 * 有参有返回值
 */
public class TestLambda5 {
    public static void main(String[] args) {
        Collator collator = Collator.getInstance();
        TreeSet<Student> set = new TreeSet<>((s1, s2) -> collator.compare(s1.getName(),s2.getName()));
        set.add(new Student(10,"张飞"));
        set.add(new Student(3,"周瑜"));
        set.add(new Student(1,"宋江"));
        set.forEach(student -> System.out.println(student));
    }
}

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
