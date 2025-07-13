class A{
    void methodA(){
        System.out.println("method of A");
    }
}
class B extends A{
    void methodB(){
        System.out.println("method of b");
    }
}
class C extends B{
    void methodC(){
        System.out.println("Method of c");
    }
}

public class inherit_multilevelInherit {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodC();
        obj.methodB();
        obj.methodA();
    }
}
