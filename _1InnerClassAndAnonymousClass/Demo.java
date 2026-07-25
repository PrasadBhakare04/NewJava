public class Demo {
    public static void main(String[] args) {
        Anony a = new Anony(){
            public void show(){
                System.out.println("this is from the anonymous class");
            }
        };
        a.show();
    }
}

class Outer {
    int outerNumber = 30;

    class Inner {
        int a;
        Inner() {
            a = 10;
        }
    }
}