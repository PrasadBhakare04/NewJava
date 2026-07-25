//To run thread we have to extend the Thread class and the exteding class should have a run method which will call other required method and contains other logic 
// to run the Thread we should call the start method
// the start method by calls the run method
// if the class doesn't have run method then nothing happens
package _5Threads;

public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        B objB = new B();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(objB);
        t1.start();
        t2.start();
    }
}
// IF we use the Thread class we cannot implement other classes so it's better to use the functionl interface
// class A extends Thread {
//     public void run(){
//         show();
//     }
//     void show() {
//         for (int i = 0; i < 100; i++) {
//             System.out.println("hello");
//             try {
//                 Thread.sleep(1);
//             } catch (InterruptedException e) {
//                 // TODO Auto-generated catch block
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B extends Thread {

//     public void run(){
//         show();
//     }
//     void show() {
//         for (int i = 0; i < 100; i++) {
//             try {
//                 System.out.println("Hi");
//                 Thread.sleep(1);
//             } catch (InterruptedException ex) {
                
//             }
//         }
//     }
// }


//Implementing the Runnable interface

class A implements Runnable{
    public void run(){
        show();
    }

    void show(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex){}
        }
    }
}

class B implements Runnable{
    public void run(){
        show();
    }

    void show(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex){}
        }
    }
}