package _3Interfaces;
@FunctionalInterface
interface A{
    void show();
}
public class Demo2 {
    public static void main(String[] args) {
        A obj = () -> {
            System.out.println("this is the show method");
        };

        obj.show();
    }
}