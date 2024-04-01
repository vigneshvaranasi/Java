class sample{
    public void display(){
        for(int i=0;i<5;i++)
        {
            System.out.println("Thread - "+Thread.currentThread().getId());
            try {
                Thread.sleep(1000);
            } 
            catch (Exception ex) {}
        }
    }
}
class T extends Thread{
    sample obj;
    T(sample obj){
        this.obj = obj;
    }
    public void run(){
        obj.display();
    }
}
public class withoutSynchronization {
    public static void main(String[] args){
        sample  s = new sample();
        T t1 = new T(s);
        T t2 = new T(s);
        T t3 = new T(s);
        t1.start();
        t2.start();
        t3.start();
    }
}
