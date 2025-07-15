class A3{
    public void print(){
        System.out.println(" this is class A3");
    }
}
class B3 extends A3{
    public void printB3(){
        System.out.println(" this is class B3");
    }
}
class C3 extends A3{
    public void printC3(){
        System.out.println(" this is class C3");
    }
}

public class heirarical{
    public static void main(String[] args) {
        B3 obj = new B3();
        obj.print();
        obj.printB3();
    }
}
