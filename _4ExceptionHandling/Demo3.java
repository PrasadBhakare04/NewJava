package _4ExceptionHandling;
class MyException extends Exception{

    public MyException(String s) {
        super(s);
        System.out.println("this is custom exception");
    }
    
}
public class Demo3{
    public static void main(String[] args) {
        int i = 10;
        int j = 1;
        
        try{
            int k = i / j;
            if(k == 10){
                // throw new MyException(); this is the custom exception
            }
        }
        catch(Exception e){
        }
    }

}