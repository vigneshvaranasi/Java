class sample1{
    public void display(){
        for(int i=0;i<5;i++)
        {
            System.out.println("From Sample 1 Class");
            try {
                Thread.sleep(1000);
            } 
            catch (Exception ex) {}
        }
    }
}
class sample2{
    public void display(){
        for(int i=0;i<5;i++)
        {
            System.out.println("From Sample 2 Class");
            try {
                Thread.sleep(1000);
            } 
            catch (Exception ex) {}
        }
    }
}
class withSleep{
    public static void main(String[] args) {
        sample1 obj1=new sample1();
        sample2 obj2=new sample2();
        obj1.display();
        obj2.display();
    }
}