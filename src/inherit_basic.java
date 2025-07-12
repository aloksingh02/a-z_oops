class parentClass{
    void display(){
        System.out.println("Parent class method");
    }
}
class childClass extends parentClass{
    void show(){
        System.out.println("child class method");
    }
}
public class inherit_basic {
    public static void main(String[] args) {
        childClass child1 =  new childClass();
        child1.display();
        System.out.println();
        child1.show();
    }
}
