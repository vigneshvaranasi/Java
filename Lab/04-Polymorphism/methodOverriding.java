
class apple{
    public void display(){
        System.out.println("In Apple");
    }
}
class orange extends apple{
    public void display(){
        System.out.println("In Orange");
    }
}
class mango extends apple{
    public void display(){
        System.out.println("In Mango");
    }
}
public class methodOverriding {
    public static void main(String[] args) {
        apple a = new apple();
        orange o = new orange();
        mango m = new mango();
        apple ref;
        ref = a;
        ref.display();
        ref = o;
        ref.display();
        ref = m;
        ref.display();
    }
}
