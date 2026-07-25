package _6CollectionAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        // List<Integer> list = new ArrayList<>();
        // list.add(4);
        // list.add(4);
        // System.out.println(list.indexOf(4));
        // Map<String, Integer> map = new HashMap<>();
        // map.put("Prasad", 10);
        // map.put("John", 12);
        // for (Map.Entry<String, Integer> en : map.entrySet()) {
        //     System.out.println(en);
            
        // }


        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // TODO Auto-generated method stub
                if(o1.age > o2.age)
                    return 1;
                else
                    return -1;
            }
        };

        List<Student> studs  = new ArrayList<>();
        studs.add(new Student("Prasad", 21));
        studs.add(new Student("John", 18));
        studs.add(new Student("Doe", 19));
        studs.add(new Student("Tony", 46));

        Collections.sort(studs);
        for(Student s : studs){
            System.out.println(s.age +" " + s.name);
        }
        studs.sort(Comparator.comparingInt(Student :: getAge));
    }
}


class Student implements Comparable<Student>{
  
    int age;
    String name;
    public int getAge(){
        return this.age;
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
        if(this.age > o.age){
            return 1;
        }
        else 
            return -1;
    }
   
}
