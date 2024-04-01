class sample1{
    public void didsplay(){
        for(int i=0;i<5;i++)
            System.out.println("From Sample 1 Class");
    }
}
class sample2{
    public void didsplay(){
        for(int i=0;i<5;i++)
            System.out.println("From Sample 2 Class");
    }
}
class withoutThreadClass{
    public static void main(String[] args) {
        sample1 obj1=new sample1();
        sample2 obj2=new sample2();
        obj1.didsplay();
        obj2.didsplay();
    }
}