// package _2Enumeration(Enum);

enum Status{
    Running, Failed, Pending, Success;
}
public class Demo {
    public static void main(String[] args) {
        Status s = Status.Running;
        System.out.println(s);

        Status[] ss = Status.values();
        for(Status s1 : ss){
            System.out.println(s1);
        }
    }
    
}
