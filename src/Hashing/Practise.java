package Hashing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Student{
    String name;
    int id;
    Student(String name,int id){
        this.name=name;
        this.id=id;
    }
}
public class Practise {
    public static void main(String[] args) {
        Map<Student,Integer>map=new HashMap<>();
        Student s1=new Student("Raghav",1);
        Student s2=new Student("Bhumi",2);
        Student s3=new Student("Raghav",1);
        map.put(s1,100);
        map.put(s2,89);
        map.put(s3,95);
        System.out.println(map.size());
        Map<String,Integer>map2=new HashMap<>();
        String S0="coc";
        String S1="poc";
        String S2="coc";
        map2.put(S0,100);
        map2.put(S1,10);
        map2.put(S2,98);
        System.out.println(map2.size());
    }
}
