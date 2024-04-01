class T1 extends Thread {
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("T1 : "+i+  " Thread - "+Thread.currentThread().getId());
        }
    }
}
class T2 extends Thread {
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("T2 : "+i+  " Thread - "+Thread.currentThread().getId());
        }
    }
}
public class extendingThreadClass {
    public static void main(String[] args) {
        T1 obj1 = new T1();
        T2 obj2 = new T2();
        obj1.start();
        obj2.start();
    }
}
