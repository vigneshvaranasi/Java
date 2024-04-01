class T1 implements Runnable {
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("T1 : "+i+  " Thread - "+Thread.currentThread().getId());
        }
    }
}
class T2 implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("T2 : "+i+  " Thread - "+Thread.currentThread().getId());
        }
    }
}
public class runnableInterface {
    public static void main(String[] args) {
        T1 obj1 = new T1();
        T2 obj2 = new T2();
        Thread obj3=new Thread(obj1);
        Thread obj4=new Thread(obj2);
        obj3.start();
        obj4.start();
    }
}
