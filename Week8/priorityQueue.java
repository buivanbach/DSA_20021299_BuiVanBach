package Week8;

import java.util.*;
import  java.util.Comparator;
import java.util.PriorityQueue;
class Student {
    private int id;
    private String name;
    private double gpa;

    public Student(String name, double gpa, int id) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
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

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}

class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getGpa() < s2.getGpa()) return 1;
        else if (s1.getGpa() > s2.getGpa()) return -1;
        else {
            if (s1.getName().toLowerCase().compareTo(s2.getName().toLowerCase()) < 0 ) return -1;
            else if (s1.getName().toLowerCase().compareTo(s2.getName().toLowerCase()) > 0) return 1;
            else {
                if(s1.getId()< s2.getId()) return -1;
                else if(s1.getId()< s2.getId()) return 1;
                else return 0;
            }
        }
    }
}

class Priorities {
    public List<Student> getStudents(List<String> events){
        PriorityQueue<Student> q = new PriorityQueue(new StudentComparator());
        List<Student> students = new ArrayList<>();
        for(String i : events){
            Scanner split = new Scanner(i);
            String order = split.next();
            if(order.equals("ENTER")){
                q.add(new Student(split.next(), split.nextDouble(), split.nextInt()));
            }
            else {
                q.poll();
            }
        }
        Student currentStudent = q.poll();
        if(currentStudent == null){
            return students;
        }
        else {
            while(currentStudent!= null){
                students.add(currentStudent);
                currentStudent = q.poll();
            }
        }
        return students;
    }
}

public class priorityQueue{

    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName()+" "+st.getGpa()+" " + st.getId());
            }
        }
    }
}