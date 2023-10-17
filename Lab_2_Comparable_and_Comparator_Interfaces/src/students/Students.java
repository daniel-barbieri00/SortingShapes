package students;

import java.util.Comparator;

public class Students implements Comparable<Students> {
	
    private String name;
    private int age;

    
    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public String getName() {
        return name;
    }

    
    public int getAge() {
        return age;
    }

    
    @Override
    public int compareTo(Students other) {
        return this.name.compareTo(other.name);
    }

    
    public static class AgeComparator implements Comparator<Students> {
        @Override
        public int compare(Students st1, Students st2) {
            if (st1.age != st2.age) {
                return st1.age - st2.age;
            }
            return st1.name.compareTo(st2.name);
        }
    }

    
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + '}';
    }
}
